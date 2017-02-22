package com.neerajsingh.dynamicpageapp.widget;

import com.neerajsingh.dynamicpageapp.WidgetInterface;

/**
 * Created by neeraj.singh on 23/02/17.
 */
abstract public class WidgetGenerator {

    String type;
    WidgetGenerator(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    abstract public int getId();

    abstract public WidgetInterface getWidget();
}
