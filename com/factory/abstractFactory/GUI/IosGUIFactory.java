package com.factory.abstractFactory.GUI;

import com.factory.abstractFactory.Components.Button;
import com.factory.abstractFactory.Components.IosButton;
import com.factory.abstractFactory.Components.IosTextArea;
import com.factory.abstractFactory.Components.TextArea;

public class IosGUIFactory implements  GUIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public TextArea createTextArea() {
        return new IosTextArea();
    }
}
