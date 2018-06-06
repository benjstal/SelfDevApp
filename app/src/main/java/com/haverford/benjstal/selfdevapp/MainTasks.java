package com.haverford.benjstal.selfdevapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.support.constraint.ConstraintSet;
import java.util.HashMap;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;


public class MainTasks extends AppCompatActivity {
    private Context blocka;
    public HashMap<String,Task> ctasks = new HashMap<>();

    public HashMap<String,Task> btasks = new HashMap<>();

    public HashMap<String,Task> stasks = new HashMap<>();

    public HashMap<String,Task> dtasks = new HashMap<>();

    //Task talktostrange = new Task("Compliment Shoes", 30, 'C' ,"When in public, walk to a stranger and compliment them on their shoes. Be genuine. Find one detail to point out why you like them.", 'E');

    ImageButton profilebutton;
    //String[] dates = {"May 21", "May22", talktostrange.description};
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


        setContentView(R.layout.activity_main_tasks);
        LinearLayout mlayout = findViewById(R.id.mlayout);
        LayoutInflater inflator = getLayoutInflater();
        View cardview = inflator.inflate(R.layout.cardview,mlayout,false);
        mlayout.addView(cardview);

        /*ConstraintLayout MT_Constraint = findViewById(R.id.MT_Constraint);
        ConstraintSet CS1 = new ConstraintSet();
        CS1.clone(MT_Constraint);

        CardView card = new CardView(this,null,R.style.CardView);
        card.setId(R.id.TaskCard_id);
        LayoutParams params = new LayoutParams(
                MATCH_PARENT,
                MATCH_PARENT);
        card.setLayoutParams(params);
        // Set CardView corner radius
        card.setRadius(20);
        CS1.setMargin(R.id.TaskCard_id,ConstraintSet.RIGHT,8);
        CS1.setMargin(R.id.TaskCard_id,ConstraintSet.START,8);
        CS1.setMargin(R.id.TaskCard_id,ConstraintSet.LEFT,8);
        CS1.setMargin(R.id.TaskCard_id,ConstraintSet.END,8);
        CS1.setMargin(R.id.TaskCard_id,ConstraintSet.TOP,20);
        CS1.connect(card.getId(), ConstraintSet.END,ConstraintSet.PARENT_ID,ConstraintSet.END,8);
        CS1.connect(card.getId(), ConstraintSet.START,ConstraintSet.PARENT_ID,ConstraintSet.START,8);
        CS1.connect(card.getId(), ConstraintSet.START,R.id.nestedScrollView,ConstraintSet.START,20);



        // Set cardView content padding


        // Set the CardView maximum elevation

        TextView tv = new TextView(this);
        tv.setLayoutParams(params);
        tv.setText("CardView\nPrograatically");
        tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
        tv.setTextColor(Color.RED);
        card.addView(tv);
        mlayout.addView(card);*/


    }

    public void openProfileScreen() {
        Intent openProfileActivity = new Intent(this, ProfileScreen.class);
        startActivity(openProfileActivity);


    }


}
