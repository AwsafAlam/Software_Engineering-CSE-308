package com.factory;

public class FixShapeResolution {

    private System_Config system_config;
    private AbstractFactory computer;

    public FixShapeResolution(System_Config system_config) {
        this.system_config = system_config;
    }

    public void Print_and_Display(){
        computer = FactoryProducer.getFactory("RESOLUTION");
        Resolution resolution = computer.getResolution(system_config.getSpeed_in_GHz() ,
                system_config.getMemory());

        if(resolution == null){
            System.out.println("Computer not found in system...");
            return;
        }
        double length = resolution.getPixelLength();
        double width = resolution.getPixelWidth();

        computer = FactoryProducer.getFactory("SHAPE");
        Shape circle = computer.getShape("CIRCLE");
        circle.Draw(length , width);

        Shape rectangle = computer.getShape("RECTANGLE");
        rectangle.Draw(length , width);


    }
}
