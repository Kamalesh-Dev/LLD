package com.factory.abstractFactory;

import com.factory.abstractFactory.Components.Button;
import com.factory.abstractFactory.Components.TextArea;
import com.factory.abstractFactory.GUI.GUI;
import com.factory.abstractFactory.GUI.GUIFactory;

public class Client {

    public static void main(String[] args) {
        String os = "Android";

        GUIFactory guiFactory = GUI.getFactory(os);

        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextArea();


    }
}
