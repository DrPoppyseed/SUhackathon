package com.example.shimadaharuki.toolbar2;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TodayFirstActivity extends AppCompatActivity {

    ListView myListView;
    String[] name;
    String[] startTime;
    String[] endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_first);

        TextView currentTimeTextView = (TextView) findViewById(R.id.currentTimeTextView);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy / MM / dd ");
        String strDate = "" + mdformat.format(calendar.getTime());
        currentTimeTextView.setText(strDate);

        Button createEventButton = findViewById(R.id.createNewEventButton);
        createEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createNewEventIntent = new Intent(getApplicationContext(), CreateNewEventActivity.class);
                startActivity(createNewEventIntent);
            }
        });

        Resources res = getResources();

        myListView = findViewById(R.id.myListView);
        name = res.getStringArray(R.array.name);
        startTime = res.getStringArray(R.array.startTime);
        endTime = res.getStringArray(R.array.endTime);

        Button refreshButton = (Button) findViewById(R.id.refreshButton);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemAdapter itemAdapter = new ItemAdapter(getApplicationContext(), name, startTime, endTime);
                myListView.setAdapter(itemAdapter);
            }
        });
    }
}
