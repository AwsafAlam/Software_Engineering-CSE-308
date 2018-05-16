package com.factory;

import com.factory.Computer.Intel_Core_i3_3rdgen;
import com.factory.Computer.Intel_Core_i5_6thgen;
import com.factory.Computer.Intel_Core_i7_5thgen;

public class ResolutionFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Resolution getResolution(double Speed , double Memory) {
        System.out.println("Getting computer resolution from database...");
        if(Speed == Intel_Core_i3_3rdgen.getSpeed_in_GHz() && Memory == Intel_Core_i3_3rdgen.getMemory()){
            System.out.println("Computer found in Database : " +
                    "\n Intel Core i3 3rd Gen");
            return new Intel_Core_i3_3rdgen();
        }
        else if(Speed == Intel_Core_i5_6thgen.getSpeed_in_GHz() && Memory == Intel_Core_i5_6thgen.getMemory()){
            System.out.println("Computer found in Database : " +
                    "\n Intel Core i5 6th Gen");

            return new Intel_Core_i5_6thgen();
        }
        else if(Speed == Intel_Core_i7_5thgen.getSpeed_in_GHz() && Memory == Intel_Core_i7_5thgen.getMemory()){
            System.out.println("Computer found in Database : " +
                    "\n Intel Core i7 5th Gen");

            return new Intel_Core_i7_5thgen();
        }
        return null;
    }
}
