package com.factory;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);
    abstract Resolution getResolution(double Speed , double Memory);
}
