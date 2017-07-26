package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        canvas.drawLine(50, 50, 50, 300, paint);
        canvas.drawLine(50, 300, 480, 300, paint);

        paint.setColor(Color.GREEN);

        canvas.drawRect(60, 298, 110, 300, paint);
        canvas.drawRect(120, 270, 170, 300, paint);
        canvas.drawRect(180, 270, 230, 300, paint);
        canvas.drawRect(240, 230, 290, 300, paint);
        canvas.drawRect(300, 200, 350, 300, paint);
        canvas.drawRect(360, 160, 410, 300, paint);
        canvas.drawRect(420, 240, 470, 300, paint);

        paint.setColor(Color.WHITE);
        canvas.drawText("直方图",270,350,paint);
    }
}
