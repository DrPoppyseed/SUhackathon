package com.example.shimadaharuki.toolbar2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] name;
    String[] startTime;
    String[] endTime;

    public ItemAdapter(Context context, String[] name, String[] startTime, String[] endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return name[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_listview, null);
        TextView eventNameTextView1 = (TextView) v.findViewById(R.id.eventNameTextView1);
        TextView startTimeTextView1 = (TextView) v.findViewById(R.id.startTimeTextView1);
        TextView endTimeTextView1 = (TextView) v.findViewById(R.id.endTimeTextView1);
        TextView squiggleTextView = (TextView) v.findViewById(R.id.squiggleTextView);

        String n = name[position];
        String s = startTime[position];
        String e = endTime[position];

        eventNameTextView1.setText(n);
        startTimeTextView1.setText(s);
        endTimeTextView1.setText(e);
        squiggleTextView.setText("~");

        return v;
    }
}
