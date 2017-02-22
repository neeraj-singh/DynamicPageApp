package com.neerajsingh.dynamicpageapp.data;

import java.util.List;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class WidgetData {

    private List<WidgetItem<Value>> widgetList;

    private String widgetType;

    public List<WidgetItem<Value>> getWidgetList() {
        return widgetList;
    }

    public void setWidgetList(List<WidgetItem<Value>> widgetList) {
        this.widgetList = widgetList;
    }

    public WidgetData() {
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }
}
