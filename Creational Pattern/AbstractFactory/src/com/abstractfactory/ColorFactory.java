package com.abstractfactory;

public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new ColorRed();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
