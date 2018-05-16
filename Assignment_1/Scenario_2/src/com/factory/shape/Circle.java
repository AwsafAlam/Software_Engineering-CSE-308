package com.factory.shape;

import com.factory.Shape;

public class Circle implements Shape {
    @Override
    public void Draw(double length , double width) {
        System.out.println("Drawing Circle of Resolution: " +
                length+"x"+width+"\n");



//        int posX = 5;
//        int posY = 10;
//        int radius = (int)((length + width)/2)%5;
//        for (int i = 0;i <= posX + radius; i++) {
//            for (int j = 1;j <=posY + radius; j++) {
//                int xSquared = (i - posX)*(i - posX);
//                int ySquared = (j - posY)*(j - posY);
//                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
//                    System.out.print("#");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}
