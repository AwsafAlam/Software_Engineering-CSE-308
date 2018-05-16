package com.factory.shape;

import com.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void Draw(double length , double width) {
        System.out.println("Drawing Rectangle of Resolution: " +
                length+"x"+width+"\n\n");


//       for (int i =0 ; i < (int) length%16;i++ ){
//            System.out.print("-");
//       }
//        for(int i =0 ; i<(int) width%3 ; i++) {
//            System.out.print("|");
//            for (int j =0 ; j < (int) length%16;j++ ){
//                System.out.print(" ");
//            }
//            System.out.println("|");
//        }
//        for (int i =0 ; i < (int) length%3;i++ ){
//            System.out.print("-");
//        }

    }
}
