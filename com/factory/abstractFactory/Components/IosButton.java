package com.factory.abstractFactory.Components;

public class IosButton implements Button{
    @Override
    public void render() {
        System.out.println("IosButton rendered");
    }

    @Override
    public void click() {
        System.out.println("IosButton clicked");
    }
}
