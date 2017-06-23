package com.example.csproject;

import android.graphics.Rect;

/**
 * Created by jkmoo on 6/16/2017.
 */

public abstract class GameObject {
    protected int x;
    protected int y;
    protected int dy;
    protected int dx;
    protected int height;
    protected int width;

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setDy(int dy)
    {
        this.dy = dy;
    }

    public void setDx(int dx)
    {
        this.dx = dx;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getDy()
    {
        return  dy;
    }

    public int getDx()
    {
        return  dx;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public Rect getRectangle()
    {
        return new Rect(x, y, x+width, y+height);
    }

}
