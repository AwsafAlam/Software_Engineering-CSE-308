package com.abstractfactory;

public class AbstractFactoryExecute {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape s1 =  shapeFactory.getShape("CIRCLE");

        Color c1 = colorFactory.getColor("RED");

        s1.draw();

        c1.HexCode();
    }
}
