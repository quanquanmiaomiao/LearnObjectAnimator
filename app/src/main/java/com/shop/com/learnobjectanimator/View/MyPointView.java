package com.shop.com.learnobjectanimator.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by caozhiyu on 17/5/15.
 */
public class MyPointView extends View {

    //创建圆形对象，半径为100
    private Point point = new Point(100);

    public MyPointView(Context context) {
        super(context);
    }

    public MyPointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        //以300，300为圆心，以当前圆的半径为半径，画一个圆
        canvas.drawCircle(300, 300, point.getRadius(), paint);
        super.onDraw(canvas);
    }

    public void setPointRadius(float radius) {
        point.setRadius(radius);
        invalidate();
    }
}
