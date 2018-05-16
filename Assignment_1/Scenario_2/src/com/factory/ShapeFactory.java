package com.factory;

import com.factory.shape.Circle;
import com.factory.shape.Rectangle;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }


        return null;
    }

    @Override
    Resolution getResolution(double Speed, double Memory) {
        return null;
    }


}
