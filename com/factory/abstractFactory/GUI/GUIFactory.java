package com.factory.abstractFactory.GUI;

import com.factory.abstractFactory.Components.Button;
import com.factory.abstractFactory.Components.TextArea;

public interface GUIFactory {

    public Button createButton();
    public TextArea createTextArea();
}
