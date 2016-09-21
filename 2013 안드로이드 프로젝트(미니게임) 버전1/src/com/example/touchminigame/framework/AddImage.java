package com.example.touchminigame.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class AddImage {
	BitmapDrawable Image;
	
	public Bitmap InitImage(Context ctx, int name)
	{
		Image = (BitmapDrawable)ctx.getResources().getDrawable(name);
		return Image.getBitmap();
	}
	
}
