package com.factory.abstractFactory.GUI;

import com.factory.abstractFactory.Components.AndroidButton;
import com.factory.abstractFactory.Components.AndroidTextArea;
import com.factory.abstractFactory.Components.Button;
import com.factory.abstractFactory.Components.TextArea;

public class AndroidGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextArea createTextArea() {
        return new AndroidTextArea();
    }
}
