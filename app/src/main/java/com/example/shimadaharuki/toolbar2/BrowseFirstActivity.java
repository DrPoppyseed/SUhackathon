package com.example.shimadaharuki.toolbar2;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class BrowseFirstActivity extends AppCompatActivity {

    ListView otherListView;
    String[] nameS;
    String[] startTimeS;
    String[] endTimeS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_first);

        Resources res = getResources();

        otherListView = findViewById(R.id.otherListView);
        nameS = res.getStringArray(R.array.nameS);
        startTimeS = res.getStringArray(R.array.startTimeS);
        endTimeS = res.getStringArray(R.array.endTimeS);

        SecondItemAdapter secondItemAdapter = new SecondItemAdapter(this, nameS, startTimeS, endTimeS);
        otherListView.setAdapter(secondItemAdapter);
    }
}
