package com.neerajsingh.dynamicpageapp.data;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class WidgetItem<T extends Value> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
