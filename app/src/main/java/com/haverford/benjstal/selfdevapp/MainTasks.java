package com.haverford.benjstal.selfdevapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tasks);

        String[] dates = {"May 21", "May22", "May 23"};
        ListAdapter testAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dates);
        ListView testListView = (ListView) findViewById(R.id.testListView);
        testListView.setAdapter(testAdapter);

        final TextView wordsmithTextView = (TextView) findViewById(R.id.wordsmithTextView);

        String[] title_type = {"Vagabond","Nomad","Charmer","Champion"};
        String Title = "Title:" + title_type[3];
        wordsmithTextView.setText(Title);


    }

}
