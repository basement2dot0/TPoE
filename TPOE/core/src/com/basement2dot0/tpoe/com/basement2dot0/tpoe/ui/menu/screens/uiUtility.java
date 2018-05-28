
package com.basement2dot0.tpoe.com.basement2dot0.tpoe.ui.menu.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Widget;


public class uiUtility {
    
    private static float width = Gdx.graphics.getWidth();
    private static float height = Gdx.graphics.getHeight();
        
    //Widget
    
    public static float widthPositioning(Widget object)
    {
        float position = (width - object.getWidth()) / 2.0f;
        return position;
    }
    public static float widthPositioning(Widget object, float offset)
    {
        float position = (width - object.getWidth()) / 2.0f + offset;
        return position;
    }
    public static float heightPositioning(Widget object)
    {
        float position = (height - object.getHeight()) / 2.0f;
        return position;
    }
    public static float heightPositioning(Widget object, float offset)
    {
        float position = (height - object.getHeight()) / 2.0f + offset;
        return position;
    }
    
    //Button
    
    public static float widthPositioning(Button object, float offset)
    {
        float position = (width - object.getWidth()) / 2.0f + offset;
        return position;
    }
    
    public static float widthPositioning(Button object)
    {
        float position = (width - object.getWidth()) / 2.0f;
        return position;
    }
    public static float heightPositioning(Button object, float offset)
    {
        float position = (height - object.getHeight()) / 2.0f + offset;
        return position;
    }
    public static float heightPositioning(Button object)
    {
        float position = (height - object.getHeight()) / 2.0f;
        return position;
    }
}
