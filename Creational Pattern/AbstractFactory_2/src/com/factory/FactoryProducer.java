package com.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("RESOLUTION")){
            return new ResolutionFactory();
        }

        return  null;
    }
}
