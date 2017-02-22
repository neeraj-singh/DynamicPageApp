package com.neerajsingh.dynamicpageapp;

import android.view.View;
import android.view.ViewGroup;

import com.neerajsingh.dynamicpageapp.data.WidgetData;

/**
 * Created by neeraj.singh on 23/02/17.
 */
public interface WidgetInterface {
    View onCreateView(ViewGroup parent);

    void onBindData(WidgetData widgetData);

}
