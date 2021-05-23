package com.example.kbpemrogmobilegrafik2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class faceview extends View {
    public faceview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint green = new Paint();
        green.setARGB(255,0,255,0);
        green.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(100,100,300,300),green);

        Paint blue = new Paint();
        blue.setARGB(255,0,0,255);
        blue.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(140,140,170,170),blue);
        canvas.drawOval(new RectF(230,140,260,170),blue);

        Paint black = new Paint();
        black.setARGB(255,0,0,0);
        black.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(190,180,210,200),black);

        Paint red = new Paint();
        red.setARGB(255,255,0,0);
        red.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawOval(new RectF(170,230,230,250),red);

        black.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.BOLD));
        black.setTextSize(40f);
        canvas.drawText("Pemrogaman Mobile",100,400,black);


    }
}
