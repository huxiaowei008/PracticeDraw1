package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);//开启抗锯齿
        int width = canvas.getWidth();//画布宽
        int hight = canvas.getHeight();//画布高

        //drawCircle前两个参数 centerX centerY 是圆心的坐标，第三个参数 radius 是圆的半径，单位都是像素
        canvas.drawCircle(width / 4, hight / 4, 50, paint);

        paint.setStyle(Paint.Style.STROKE);//Style 修改为画线模式
        canvas.drawCircle(width * 3 / 4, hight / 4, 50, paint);

        paint.setStyle(Paint.Style.FILL);//Style 修改为填充模式
        paint.setColor(Color.BLUE);
        canvas.drawCircle(width / 4, hight * 3 / 4, 50, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20); // 线条宽度为 20 像素
        paint.setColor(Color.BLACK);
        canvas.drawCircle(width*3/4,hight*3/4,50,paint);
    }
}
