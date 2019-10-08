package com.akpanda.creational.prototype;

import java.io.Serializable;

public class PointSer implements Serializable {
    public int x, y;

    public PointSer(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return String.format("x :%s, y: %s",x,y);
    }
}
