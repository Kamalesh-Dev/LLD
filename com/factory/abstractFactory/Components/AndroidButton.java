package com.factory.abstractFactory.Components;

public class AndroidButton implements Button {
    @Override
    public void render() {
        System.out.println("Android Button Rendered");
    }

    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }
}
