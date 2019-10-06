package com.akpanda.solidoopprinciples.liskovsubstitutionprinciple;

public class Runner {

    static void demoFUnction(Rectangle rectangle){
        rectangle.setWidth(10);
        System.out.println("Expected area "+rectangle.getHeight()*10);
        System.out.println("Actual Area"+rectangle.area());;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,5);
        demoFUnction(rectangle);

        // we are setting the side as 15. But the demo function changes one variable causing the erronous result
        Rectangle square = new Square(15);
        demoFUnction(square);
    }
}
