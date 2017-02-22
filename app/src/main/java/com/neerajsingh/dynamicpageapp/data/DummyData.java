package com.neerajsingh.dynamicpageapp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class DummyData implements Serializable {
    List<WidgetData> widgetItems;

    public DummyData() {
        widgetItems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            WidgetItem<Value> item = new WidgetItem<>();
            WidgetData data = new WidgetData();
            List<WidgetItem<Value>> list = new ArrayList<>();
            if (i % 3 == 0) {
                SimpleTextValue simpleTextValue = new SimpleTextValue();
                simpleTextValue.setDefaultText("Neeraj " + i);
                simpleTextValue.setLable("Enter your Name");
                if (i % 2 == 0) {
                    simpleTextValue.setInputType("text");
                } else {
                    simpleTextValue.setInputType("number");
                }
                item.setValue(simpleTextValue);
                list.add(item);
                data.setWidgetList(list);
                //this Type needs to match with generator as we will map based on this name only
                data.setWidgetType("SIMPLE_TEXT");
                widgetItems.add(data);
            } else {
                DescriptWidgetValue value = new DescriptWidgetValue();
                value.setTitle("We are talking about this ");
                value.setDescription("This is very important to understand that we can add as many widget as we want like this on the page. My current index is " + i);
                item.setValue(value);
                list.add(item);
                data.setWidgetList(list);
                data.setWidgetType("DESCRIPTION_WIDGET");
                widgetItems.add(data);
            }
        }

    }

    public List<WidgetData> getWidgetItems() {
        return widgetItems;
    }
}
