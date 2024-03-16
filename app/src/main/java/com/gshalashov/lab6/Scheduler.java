package com.gshalashov.lab6;

import android.os.Handler;
import android.util.Log;
import com.gshalashov.lab6.MainActivity;
import java.util.TimerTask;


import android.view.View;


public class Scheduler extends TimerTask{
    float x;

    private Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    private MainActivity activity;

    public void setActivity(MainActivity activity) {
        this.activity = activity;
    }
    @Override
    public void run(){
        float a, b, c;
        a = 2;
        b = 3;
        c = 4;
        float F;
        if (x<5){
            F = (float) (-a*Math.pow(x, 2) - b);
        }
        else if (x>5){
            F = (x - a)/x;
        }
        else{
            F = -x/c;
        }
        Log.i("Вывод", Float.toString(F));
        Log.i("Вывод", Float.toString(x));

        if (handler != null && x <30) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    activity.onClick(null);
                }
            });
        }
    }
}
