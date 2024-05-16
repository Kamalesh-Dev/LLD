package com.factory.abstractFactory.GUI;

public class GUI {

    public static GUIFactory getFactory(String type)
    {
        if(type == "Android")
        {
            return new AndroidGUIFactory();
        }
        else if(type == "IOS")
        {
            return new IosGUIFactory();
        }
        else
        {
            return null;
        }

    }
}
