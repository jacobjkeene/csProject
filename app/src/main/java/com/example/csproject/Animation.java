package com.example.csproject;

import android.graphics.Bitmap;
import android.os.Build;
import android.provider.Settings;

/**
 * Created by jkmoo on 6/16/2017.
 */

public class Animation {
    private Bitmap[] frames;
    private int currentFrame;
    private long startTime;
    private long delay;
    private boolean playedOnce;

    public void setFrames(Bitmap[] frames)
    {
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
    }

    public void setDelay(long d){delay = d;}
    public void setFrame(int i){currentFrame = i;}
    public int getFrame(){return currentFrame;}
    public boolean playedOnce(){return playedOnce;}

    public void update()
    {
        long elapsed = (System.nanoTime()-startTime)/1000000;

        if(elapsed>delay)
        {
            currentFrame++;
            startTime = System.nanoTime();
        }
        if(currentFrame == frames.length)
        {
            currentFrame = 0;
            playedOnce = true;
        }
    }

    public Bitmap getImage()
    {
        return frames[currentFrame];
    }

}