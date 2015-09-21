package com.example.kgadde.buttonlayoutsave;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int b1press;
    int b2press;
    int b3press;
    int b4press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            int t1Press = sharedPreferences.getInt("t1", 0);
            @Override
            public void onClick(View v) {
                t1Press = sharedPreferences.getInt("t1", 0);
                t1Press ++;
                Toast.makeText(MainActivity.this, "T1 has been pressed "+t1Press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("T1", t1Press + "");
                editor.putInt("t1", t1Press);
                editor.apply();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            int t2Press = sharedPreferences.getInt("t2", 0);

            @Override
            public void onClick(View v) {
                t2Press = sharedPreferences.getInt("t2", 0);
                t2Press++;
                Toast.makeText(MainActivity.this, "T2 has been pressed " + t2Press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("T2", t2Press + "");
                editor.putInt("t2", t2Press);
                editor.apply();
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            int t3Press = sharedPreferences.getInt("t3", 0);

            @Override
            public void onClick(View v) {
                t3Press = sharedPreferences.getInt("t3", 0);
                t3Press++;
                Toast.makeText(MainActivity.this, "T3 has been pressed " + t3Press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("T3", t3Press + "");
                editor.putInt("t3", t3Press);
                editor.apply();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            int t4Press = sharedPreferences.getInt("t4", 0);

            @Override
            public void onClick(View v) {
                t4Press = sharedPreferences.getInt("t4", 0);
                t4Press++;
                Toast.makeText(MainActivity.this, "T4 has been pressed " + t4Press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("T4", t4Press + "");
                editor.putInt("t4", t4Press);
                editor.apply();
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("t1", 0);
                editor.putInt("t2", 0);
                editor.putInt("t3", 0);
                editor.putInt("t4", 0);
                editor.commit();
                Toast.makeText(MainActivity.this, "Values Reset", Toast.LENGTH_SHORT).show();
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