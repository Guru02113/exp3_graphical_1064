package com.example.exp3_graphical_1064

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SampleCanvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val paint : Paint =Paint()
        paint.setColor(Color.YELLOW)
        canvas?.drawPaint(paint)
        paint.setColor(Color.RED)
        paint.textSize=50f
        canvas?.drawText("circle",140f,350f,paint)
        canvas?.drawCircle(200f,200f,100f,paint)
        paint.setColor(Color.GREEN)
        canvas?.drawRect(370f,110f,530f,300f,paint)
        canvas?.drawText("Rectangle",340f,350f,paint)
        paint.setColor(Color.CYAN)
        canvas?.drawText("square",125f,750f,paint)
        canvas?.drawRect(100f,510f,300f,700f,paint)
        paint.setColor(Color.MAGENTA)
        canvas?.drawText("LINE",425f,750f,paint)
        paint.setStrokeWidth(6f); // line width
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawLine(500F, 500F, 500F, 700F, paint);
    }
}