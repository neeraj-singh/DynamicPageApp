package com.neerajsingh.dynamicpageapp;

import android.util.SparseArray;

import com.neerajsingh.dynamicpageapp.widget.DescriptionWidgetGenerator;
import com.neerajsingh.dynamicpageapp.widget.SimpleTextWidgetGenerator;
import com.neerajsingh.dynamicpageapp.widget.WidgetGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class Mapper {

    public static Mapper mapper;
    private Map<String, WidgetGenerator> map = new HashMap<>();
    private SparseArray<WidgetGenerator> idToGenerator = new SparseArray<>();

    /**
     * Add any new widget and resister here to be consumed by the page
     * @return
     */
    public static Mapper registerWidgets() {
        if (mapper == null) {
            mapper = new Mapper();
            mapper.put(new SimpleTextWidgetGenerator());
            mapper.put(new DescriptionWidgetGenerator());
        }
        return mapper;
    }

    public void put(WidgetGenerator widgetGenerator) {
        map.put(widgetGenerator.getType(), widgetGenerator);
        idToGenerator.put(widgetGenerator.getId(),widgetGenerator);
    }

    public WidgetGenerator get(String type) {
        return map.get(type);
    }

    public WidgetInterface get(int id){
        return idToGenerator.get(id).getWidget();
    }

}
