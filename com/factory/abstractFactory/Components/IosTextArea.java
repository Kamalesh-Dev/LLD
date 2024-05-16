package com.factory.abstractFactory.Components;

public class IosTextArea implements TextArea{

    private String text;
    @Override
    public void setText(String text) {
        this.text = text;

    }

    @Override
    public String getText() {
        return this.text;
    }
}
