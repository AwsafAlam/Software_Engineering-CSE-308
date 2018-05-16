package com.builderpattern;

public abstract class Drinks implements Item{

    @Override
    public abstract String Name();

    @Override
    public Packaging packaging() {
        return new Cup();
    }
}
