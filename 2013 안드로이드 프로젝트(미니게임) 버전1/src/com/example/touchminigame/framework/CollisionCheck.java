package com.example.touchminigame.framework;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;

public class CollisionCheck {
	public boolean CollisionArea(float x, float y, Rect r) // 터치시 충돌 범위 설정
	{
		if(x >= r.left && x <= r.right && y >= r.top && y <= r.bottom)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean CollisionBitmapArea(Bitmap bitmap, float x, float y, int nX, int nY) // 이미지와 터치좌표의 충돌처리
	{
		int width = 0, height = 0;
		width = (nX + bitmap.getWidth());
		height = (nY + bitmap.getHeight());
		
		if( x>= nX && y >= nY && x <= width && y <= height)
		{
			Log.i("INT", "nX: " + x + ", nY: " + y + ", Width: " + width + ", Height: " + height);
			return true;
		}
		else
			return false;
		
	}
	
	//이미지와 이미지 충돌
	public boolean COllisionBitmap(Bitmap bitmap1, Bitmap bitmap2, int nX1, int nY1, int nX2, int nY2) // 이미지와 이미지 충돌
	{
		int width1, height1, width2, height2;
		
		width1 = (nX1 + bitmap1.getWidth());
		height1 = (nY1 + bitmap1.getWidth());
		width2 = (nX2 + bitmap1.getWidth());
		height2 = (nY2 + bitmap1.getWidth());
		
		if((width1 >= nX2 && width2 >= nX1) && (height1 >= nY2 && height2 >= nY1))
			return true;
		else
			return false;
	}
}
