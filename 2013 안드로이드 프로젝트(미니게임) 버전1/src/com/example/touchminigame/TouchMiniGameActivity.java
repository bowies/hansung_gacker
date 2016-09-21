package com.example.touchminigame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TouchMiniGameActivity extends Activity{
	
	TouchMiniGameMain miniGameMain;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_touch_mini_game);
	
		String[] list = {"���ӽ���", "�α���", "ȸ������", "����", "����"};
		
		ArrayAdapter<String> adapter;
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
		
		ListView listView = (ListView)findViewById(R.id.MainMenuList);
		listView.setAdapter(adapter);
		
		
		requestWindowFeature(Window.FEATURE_NO_TITLE); // ȭ�鼳��
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN); // ȭ�鼳��
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_touch_mini_game, menu);
		return true;
	}
}
