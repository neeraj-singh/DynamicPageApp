package com.neerajsingh.dynamicpageapp;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.neerajsingh.dynamicpageapp.ItemFragment.OnListFragmentInteractionListener;
import com.neerajsingh.dynamicpageapp.data.WidgetData;
import com.neerajsingh.dynamicpageapp.data.WidgetItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link WidgetData} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.WidgetViewHolder> {

    private final List<WidgetData> mValues;
    private final OnListFragmentInteractionListener mListener;

    Mapper mapper;

    public MyItemRecyclerViewAdapter(List<WidgetData> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
        setHasStableIds(true);
        mapper = Mapper.registerWidgets();
    }

    @Override
    public WidgetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        WidgetInterface widgetInterface = mapper.get(viewType);
        return new WidgetViewHolder(parent,widgetInterface);
    }

    @Override
    public void onBindViewHolder(WidgetViewHolder holder, int position) {
        holder.widgetInterface.onBindData(mValues.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        String type = mValues.get(position).getWidgetType();
        return mapper.get(type).getId();
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class WidgetViewHolder extends RecyclerView.ViewHolder {

        WidgetInterface widgetInterface;

        public WidgetViewHolder(ViewGroup parent, WidgetInterface widgetInterface) {
            super(widgetInterface.onCreateView(parent));
            this.widgetInterface = widgetInterface;
        }
    }
}
