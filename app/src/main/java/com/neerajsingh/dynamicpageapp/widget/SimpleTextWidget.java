package com.neerajsingh.dynamicpageapp.widget;

import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.neerajsingh.dynamicpageapp.R;
import com.neerajsingh.dynamicpageapp.data.SimpleTextValue;
import com.neerajsingh.dynamicpageapp.data.Value;
import com.neerajsingh.dynamicpageapp.data.WidgetData;
import com.neerajsingh.dynamicpageapp.data.WidgetItem;

import java.util.List;

/**
 * Created by neeraj.singh on 23/02/17.
 */

public class SimpleTextWidget extends BaseWidget {

    EditText editText;

    @Override
    public View onCreateView(ViewGroup parent) {
        rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_text_widget, parent, false);
        editText = (EditText) rootView.findViewById(R.id.input_text);
        return rootView;
    }

    @Override
    public void onBindData(WidgetData widgetData) {
        List<WidgetItem<Value>> widgetList = widgetData.getWidgetList();
        if (widgetList != null && widgetList.size() > 0) {
            SimpleTextValue value;
            for (WidgetItem item : widgetList) {
                value = (SimpleTextValue) item.getValue();
                if (value != null) {
                    if (!TextUtils.isEmpty(value.getLable())) {
                        editText.setHint(value.getLable());
                    }
                    if (!TextUtils.isEmpty(value.getDefaultText())) {
                        editText.setText(value.getDefaultText());
                    }
                    if ("text".equalsIgnoreCase(value.getInputType())) {
                        editText.setInputType(InputType.TYPE_CLASS_TEXT);
                    } else if("number".equalsIgnoreCase(value.getInputType())){
                        editText.setInputType(InputType.TYPE_CLASS_NUMBER);
                    }
                }

                //Similarly for other fields
            }
        }

    }
}
