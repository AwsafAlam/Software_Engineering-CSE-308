package com.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String fact){
        if(fact == null ){
            return null;
        }
        if(fact.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if(fact.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
