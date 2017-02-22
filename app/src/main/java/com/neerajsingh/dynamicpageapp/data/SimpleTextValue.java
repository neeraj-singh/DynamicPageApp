package com.neerajsingh.dynamicpageapp.data;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class SimpleTextValue extends Value {
    String lable;
    String defaultText;
    String inputType;
    String textColor;
    int fontSize;
    /*
    You can have as many fields as you want.
     */

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
