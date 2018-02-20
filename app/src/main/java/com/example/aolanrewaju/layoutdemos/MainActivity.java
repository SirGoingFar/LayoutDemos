package com.example.aolanrewaju.layoutdemos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attach listener to the category views
        //Linear Layout TextView
        TextView linearLayout = (TextView) findViewById(R.id.linear_layout_textview);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearLayoutIntent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(linearLayoutIntent);
            }
        });

        //Relative Layout TextView
        TextView relativeLayout = (TextView) findViewById(R.id.relative_layout_textview);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativeLayoutIntent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(relativeLayoutIntent);
            }
        });

        //Frame Layout TextView
        TextView frameLayout = (TextView) findViewById(R.id.frame_layout_textview);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frameLayoutIntent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(frameLayoutIntent);
            }
        });

        //Constraint Layout TextView
        TextView constraintLayout = (TextView) findViewById(R.id.constraint_layout_textview);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent constraintLayoutIntent = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
                startActivity(constraintLayoutIntent);
            }
        });
    }
}
