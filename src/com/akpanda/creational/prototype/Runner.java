package com.akpanda.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        PointSer a = new PointSer(2,5);
        PointSer b = new PointSer(4,10);
        LineSer lineSer = new LineSer(a,b);
        LineSer lineSer2 = lineSer.deepCopy();
        lineSer2.end.y=15;
        System.out.println(lineSer);
        System.out.println(lineSer2);

        PointDC a1 = new PointDC(2,5);
        PointDC b1= new PointDC(4,10);
        LineDC lineDC = new LineDC(a1,b1);
        LineDC lineDC1 = lineDC.deepCopy();
        lineDC1.end.y=15;
        System.out.println("\n"+lineDC);
        System.out.println(lineDC1);
    }
}
