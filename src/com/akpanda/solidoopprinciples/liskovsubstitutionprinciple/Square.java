package com.akpanda.solidoopprinciples.liskovsubstitutionprinciple;

public class Square extends Rectangle{

    public Square(){}

    public Square(int size){
        super.height=super.width=size;
    }

    @Override
    public void setHeight(int height){
        super.height=height;
        super.width=height;
    }

    @Override
    public void setWidth(int width){
        super.height=width;
        super.width=width;
    }

}
