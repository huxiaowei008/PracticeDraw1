package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        RectF rectF = new RectF(100, 100, 300, 300);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, -47, 45, true, paint);

        paint.setColor(Color.parseColor("#7b1fa2"));
        canvas.drawArc(rectF, 0, 5, true, paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 7, 5, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 14, 50, true, paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 66, 112, true, paint);

        paint.setColor(Color.RED);
        rectF = new RectF(90, 90, 290, 290);
        canvas.drawArc(rectF, 180, 132, true, paint);
    }
}
