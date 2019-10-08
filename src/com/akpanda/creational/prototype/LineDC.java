package com.akpanda.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

public class LineDC {
    public PointDC start, end;

    public LineDC(PointDC start, PointDC end)
    {
        this.start = start;
        this.end = end;
    }

    public LineDC(LineDC other){
        this.start = new PointDC(other.start);
        this.end  = new PointDC(other.end);
    }
    public LineDC deepCopy()
    {
        return new LineDC(this);
    }
    @Override
    public String toString(){
        return "start: ("+start.toString()+") end: ("+end.toString()+")";
    }
}
