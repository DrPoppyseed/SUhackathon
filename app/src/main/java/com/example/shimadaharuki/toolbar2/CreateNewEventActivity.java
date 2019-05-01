package com.example.shimadaharuki.toolbar2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateNewEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_event);

        Button confirmButton = (Button) findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText eventNameEditText = findViewById(R.id.eventNameEditText);
                EditText startDateTimeEditText = findViewById(R.id.startDateTimeEditText);
                EditText endDateTimeEditText = findViewById(R.id.endDateTimeEditText);

                String eventName = eventNameEditText.getText().toString();
                String startDateTime = startDateTimeEditText.getText().toString();
                String endDateTime = endDateTimeEditText.getText().toString();



                finish();
            }
        });
    }
}
