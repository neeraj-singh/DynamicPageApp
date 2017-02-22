package com.neerajsingh.dynamicpageapp.widget;

import com.neerajsingh.dynamicpageapp.Constants.Constants;
import com.neerajsingh.dynamicpageapp.WidgetInterface;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class SimpleTextWidgetGenerator extends WidgetGenerator {

    public SimpleTextWidgetGenerator() {
        super("SIMPLE_TEXT");
    }

    public WidgetInterface getWidget() {
        return new SimpleTextWidget();
    }

    @Override
    public int getId() {
        return Constants.SimpleTextWidget;
    }
}
