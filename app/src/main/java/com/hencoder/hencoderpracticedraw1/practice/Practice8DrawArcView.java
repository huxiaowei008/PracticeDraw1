package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        // left, top, right, bottom 描述的是这个弧形所在的椭圆；
        // startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；
        // 顺时针为正角度，逆时针为负角度），sweepAngle 是弧形划过的角度；
        // useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
        RectF rectF = new RectF(50, 50, 300, 200);

        canvas.drawArc(rectF, -110, 100, true, paint); // 绘制扇形
        canvas.drawArc(rectF, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(rectF, 180, 60, false, paint); // 绘制不封口的弧形

    }
}
