package com.neerajsingh.dynamicpageapp.data;

/**
 * Created by neeraj.singh on 23/02/17.
 */

abstract public class Value {
    private String type;

    public Value() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
