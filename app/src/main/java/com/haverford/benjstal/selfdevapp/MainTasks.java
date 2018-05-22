package com.haverford.benjstal.selfdevapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainTasks extends AppCompatActivity {

    ImageButton profilebutton;
    String[] dates = {"May 21", "May22", "May 23"};
    ArrayAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tasks);

        profilebutton = (ImageButton) findViewById(R.id.profilebutton);
        profilebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openProfileScreen();
            }
        });

        ListAdapter testAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dates);
        ListView testListView = (ListView) findViewById(R.id.testListView);
        testListView.setAdapter(testAdapter);

        final TextView wordsmithTextView = (TextView) findViewById(R.id.wordsmithTextView);

        String[] title_type = {"Vagabond","Nomad","Charmer","Champion"};
        String Title = "Title:" + title_type[3];
        wordsmithTextView.setText(Title);


    }

    public void openProfileScreen() {
        Intent openProfileActivity = new Intent(this, ProfileScreen.class);
        startActivity(openProfileActivity);
    }

}
