package com.example.deltager.endlessrrunnerwithinsults;

import android.view.View;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by deltager on 07-07-17.
 */

public class CanvasView extends View {

    public CanvasView(Context context) {
        super(context);
        setup();
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setup();
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setup();
    }

    public void setup() {
        //Find billeder og konverter dem til BitMap formatet. Skal gøres for alle jeres billeder

        //Positioner skal sættes her et sted

        //postInvalidate (opdatere View ved at kalde onDraw og tegne det på ny)
    }

    //Dette er den kode der skal til for at starte jeres timer.
    public void animation(){

    }



    //Det er den her der bliver kaldt når Android skal tegne jeres View
    @Override
    protected void onDraw(Canvas canvas) {
        //Få fat i højden og bredde af jeres View. I pixels
       /* height = canvas.getHeight();
        width = canvas.getWidth();

        //Sæt billederne til den størrelse i vil have dem. Parametrene er det originale BitMap, bredden af det nye bitmap, højden af det nye bitmap, true.
        //Bredden og højden skal være i pixels
        sun1 = Bitmap.createScaledBitmap(sun1, width/10, height/10, true);
        sun2 = Bitmap.createScaledBitmap(sun2, width/10, height/10, true);

        //Tegn ting. Se på de metoder Studio foreslår når i skriver variabelNavn.draw
        //Der skulle også stå nogenlunde gennemskueligt hvad parametrene skal være
        canvas.drawRect(0, 0, width, height, sky);
        canvas.drawText("Her er noget tekst", 40, height - 40, text);
        if(sunSwitch){
            canvas.drawBitmap(sun1, sunPosX, height/4, null);
        } else {
            canvas.drawBitmap(sun2, sunPosX, height/4, null); */
        }
    }


