package com.example.amangupta.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //working with buttons
        Button button1 = (Button) findViewById(R.id.app1) ;
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch Spotify Streamer app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.app2) ;
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch Scores App";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button button3 = (Button) findViewById(R.id.app3) ;
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch Library App";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        Button button4 = (Button) findViewById(R.id.app4) ;
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch Build It Bigger App";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button5 = (Button) findViewById(R.id.app5) ;
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch XYZ Reader";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button button6 = (Button) findViewById(R.id.app6) ;
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //show toast
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my app";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
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
