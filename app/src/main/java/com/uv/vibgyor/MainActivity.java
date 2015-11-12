package com.uv.vibgyor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static String TAG = "MainActivity";

    TextView violet, indigo, blue, green, yellow, orange, red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClickListeners();


    }

    private void setOnClickListeners() {
        violet = (TextView) findViewById(R.id.violet);

        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Violet is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Violet is clicked");
            }
        });

        indigo = (TextView) findViewById(R.id.indigo);

        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Indigo is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Indigo is clicked");
            }
        });

        blue = (TextView) findViewById(R.id.blue);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Blue is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Blue is clicked");
            }
        });

        green = (TextView) findViewById(R.id.green);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Green is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Green is clicked");
            }
        });

        yellow = (TextView) findViewById(R.id.yellow);

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Yellow is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Yellow is clicked");
            }
        });

        orange = (TextView) findViewById(R.id.orange);

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Orange is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Orange is clicked");
            }
        });

        red = (TextView) findViewById(R.id.red);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Red is clicked", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Red is clicked");
            }
        });
    }


}
