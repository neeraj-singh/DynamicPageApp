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
            SimpleTextValue simpleTextValue = new SimpleTextValue();
            simpleTextValue.setDefaultText("Neeraj " + i);
            simpleTextValue.setLable("Enter your Name");
            if (i % 2 == 0) {
                simpleTextValue.setInputType("text");
            }else{
                simpleTextValue.setInputType("number");
            }
            item.setValue(simpleTextValue);

            WidgetData data = new WidgetData();
            List<WidgetItem<Value>> list = new ArrayList<>();
            list.add(item);
            data.setWidgetList(list);
            data.setWidgetType("SIMPLE_TEXT");
            widgetItems.add(data);
        }

    }

    public List<WidgetData> getWidgetItems() {
        return widgetItems;
    }
}
