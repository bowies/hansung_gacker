package com.example.touchminigame.framework;

import java.util.HashMap;

import android.R.integer;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class SoundPlay {

	MediaPlayer mBack = null;
	MediaPlayer mEffect = null;
	SoundPool mSoundPool;
	HashMap<Integer, Integer>mSoundPoolMap;
	AudioManager mAudioManager;
	int Volume;
	
	public void setSoundPoolEffect(Context ctx, int num) // soundpool 이벤트 소리
	{
		mSoundPool = new SoundPool(num, AudioManager.STREAM_MUSIC, 0);
		mSoundPoolMap = new HashMap<Integer, Integer>();
		mAudioManager = (AudioManager)ctx.getSystemService(Context.AUDIO_SERVICE);
		Volume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
	}
	
	public void addSound(Context ctx, int ID, int name) // 사운드 추가
	{
		mSoundPoolMap.put(ID, mSoundPool.load(ctx, name,1));
	}
	
	public int playSound(int ID, int count) //어떤 음을 낼것인가?
	{
		int Volume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
		return mSoundPool.play(mSoundPoolMap.get(ID), Volume, Volume, 1, (count-1), 1f);
	}
	
	public void stopSound(int ID) // 사운드 중지
	{
		mSoundPool.stop(ID);
	}
	
	public void soundBack(Context ctx, int name, boolean loop) // 배경음.
	{
		mBack = MediaPlayer.create(ctx, name);
		
		mBack.start();
		mBack.setLooping(loop);

	}
	
	public void soundEffect(Context ctx, int name) // 배경음
	{
		mEffect = MediaPlayer.create(ctx, name);
		
		mEffect.seekTo(0);
		mEffect.start();
	}
}
