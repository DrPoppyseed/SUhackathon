package com.example.shimadaharuki.toolbar2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SecondItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] nameS;
    String[] startTimeS;
    String[] endTimeS;

    public SecondItemAdapter(Context context, String[] nameS, String[] startTimeS, String[] endTimeS) {
        this.nameS = nameS;
        this.startTimeS = startTimeS;
        this.endTimeS = endTimeS;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return nameS.length;
    }

    @Override
    public Object getItem(int position) {
        return nameS[position];
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

        String n = nameS[position];
        String s = startTimeS[position];
        String e = endTimeS[position];

        eventNameTextView1.setText(n);
        startTimeTextView1.setText(s);
        endTimeTextView1.setText(e);
        squiggleTextView.setText("~");

        return v;
    }
}

