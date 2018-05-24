package com.haverford.benjstal.selfdevapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.HashMap;


public class MainTasks extends AppCompatActivity {

    public HashMap<String,Task> ctasks = new HashMap<>();

    public HashMap<String,Task> btasks = new HashMap<>();

    public HashMap<String,Task> stasks = new HashMap<>();

    public HashMap<String,Task> dtasks = new HashMap<>();

    Task talktostrange = new Task("Compliment Shoes", 30, 'C' ,"When in public, walk to a stranger and compliment them on their shoes. Be genuine. Find one detail to point out why you like them.", 'E');

    ImageButton profilebutton;
    String[] dates = {"May 21", "May22", talktostrange.description};
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
