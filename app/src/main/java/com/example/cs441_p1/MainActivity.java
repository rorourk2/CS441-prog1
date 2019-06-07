package com.example.cs441_p1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView t=(TextView)findViewById(R.id.textView);
        final TextView t2=(TextView)findViewById(R.id.textView2);
        final TextView t3=(TextView)findViewById(R.id.textView3);
        final TextView t4=(TextView)findViewById(R.id.textView4);
        final TextView t5=(TextView)findViewById(R.id.textView5);
        FloatingActionButton f = findViewById(R.id.f);
        FloatingActionButton f2 = findViewById(R.id.f2);
        FloatingActionButton f3 = findViewById(R.id.f3);
        FloatingActionButton f4 = findViewById(R.id.f4);
        FloatingActionButton f5 = findViewById(R.id.f5);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setVisibility((t.getVisibility() ==View.VISIBLE) ? View.GONE : View.VISIBLE);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setVisibility((t2.getVisibility() ==View.VISIBLE) ? View.GONE : View.VISIBLE);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setVisibility((t3.getVisibility() ==View.VISIBLE) ? View.GONE : View.VISIBLE);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setVisibility((t4.getVisibility() ==View.VISIBLE) ? View.GONE : View.VISIBLE);
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5.setVisibility((t5.getVisibility() ==View.VISIBLE) ? View.GONE : View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
