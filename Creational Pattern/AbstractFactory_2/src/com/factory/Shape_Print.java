package com.factory;

import java.util.Scanner;

public class Shape_Print {

    public static void main(String[] args) {
	// write your code here

//        AbstractFactory computer = FactoryProducer.getFactory("SHAPE");
//
//        Shape circle = computer.getShape("CIRCLE");
//        circle.Draw();
//
//        Shape rectangle = computer.getShape("RECTANGLE");
//        rectangle.Draw();

        System.out.println("Enter Computer Speed and Memory");
        Scanner sc = new Scanner(System.in);

        double Speed = sc.nextDouble();
        double Memory = sc.nextDouble();

        System_Config system_config = new System_Config();
        system_config.setMemory(Memory);
        system_config.setSpeed_in_GHz(Speed);

        FixShapeResolution shapeobject = new FixShapeResolution(system_config);
        shapeobject.Print_and_Display();



    }


}
