package com.factorypattern;

import java.util.Scanner;

public class FactoryPatternDemo {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle from object ofinterface
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

    }
}
