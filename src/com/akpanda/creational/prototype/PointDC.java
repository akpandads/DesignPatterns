package com.akpanda.creational.prototype;

public class PointDC {
    public int x, y;

    public PointDC(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public PointDC(PointDC other){
        this(other.x,other.y);
    }
    @Override
    public String toString(){
        return String.format("x :%s, y: %s",x,y);
    }
}
