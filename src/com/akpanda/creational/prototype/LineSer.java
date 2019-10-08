package com.akpanda.creational.prototype;

import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

public class LineSer implements Serializable {
    public PointSer start, end;

    public LineSer(PointSer start, PointSer end)
    {
        this.start = start;
        this.end = end;
    }

    public LineSer deepCopy()
    {
        LineSer lineSer2 = SerializationUtils.roundtrip(this);
        return lineSer2;
    }
    @Override
    public String toString(){
        return "start: ("+start.toString()+") end: ("+end.toString()+")";
    }
}
