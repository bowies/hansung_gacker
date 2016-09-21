package com.example.touchminigame.framework;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

public class DrawImage {
	public void drawBmp(Canvas cvs, Bitmap bitmap, float x, float y, int view)
	{
		switch(view)
		{
		case 0:
			if(bitmap != null)
			{
				cvs.drawBitmap(bitmap, x, y, null);
			}
			break;
		case 1:
			if(bitmap != null)
			{
				cvs.drawBitmap(bitmap, x-(bitmap.getWidth()/2), y-(bitmap.getHeight()/2), null);
			}
			break;
		}
	}
	
	public void drawPiece(Canvas cvs, Bitmap bitmap, Rect show, Rect point, Paint paint)
	{
		cvs.drawBitmap(bitmap, show, point, paint);
	}
	
	public void drawRotate(Canvas cvs, Bitmap bitmap, Rect show, Rect point, Paint paint, float m)
	{
		Matrix matrix = new Matrix();
		matrix.setRotate(m);
		
		Bitmap change_bitmap = Bitmap.createBitmap(bitmap, show.left, show.top,
				bitmap.getWidth(), bitmap.getHeight(),matrix,false);
		if(bitmap != change_bitmap)
		{
			bitmap = change_bitmap;
		}
		cvs.drawBitmap(bitmap, show, point, paint);
		
		change_bitmap.recycle();
		
	}
}
