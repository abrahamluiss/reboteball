package pe.azm.sensors202020;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class eLienzo extends View {
Paint pintar = new Paint();
Rect cuadrado =new Rect(100,100,300,300);

    public eLienzo(Context context) {
        super(context);
    }

    @Override
    protected void onDraw (Canvas lienzo){
        super.onDraw(lienzo);
        lienzo.drawRGB(200,200,185);
        pintar.setColor(Color.WHITE);
        lienzo.drawRect(cuadrado,pintar);
        pintar.setStyle(Paint.Style.STROKE);
        pintar.setStrokeWidth(5);
        pintar.setColor(Color.RED);
         lienzo.drawRect(cuadrado,pintar);
         pintar.setStyle(Paint.Style.FILL);
         pintar.setColor(Color.BLUE);
         lienzo.drawCircle(500,300,100,pintar);
    }
}
