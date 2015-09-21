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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            int b1press = sharedPreferences.getInt("button1", 0);
            @Override
            public void onClick(View v) {
                b1press = sharedPreferences.getInt("button1", 0);
                b1press ++;
                Toast.makeText(MainActivity.this, "B1 has been pressed "+ b1press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("B1", b1press + "");
                editor.putInt("B1", b1press);
                editor.apply();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            int b2press = sharedPreferences.getInt("button2", 0);

            @Override
            public void onClick(View v) {
                b2press = sharedPreferences.getInt("button2", 0);
                b2press++;
                Toast.makeText(MainActivity.this, "B2 has been pressed " + b2press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("B2", b2press + "");
                editor.putInt("button2", b2press);
                editor.apply();
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            int b3press = sharedPreferences.getInt("button3", 0);

            @Override
            public void onClick(View v) {
                b3press = sharedPreferences.getInt("button3", 0);
                b3press++;
                Toast.makeText(MainActivity.this, "B3 has been pressed " + b3press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("B3", b3press + "");
                editor.putInt("button3", b3press);
                editor.apply();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            int b4press = sharedPreferences.getInt("button4", 0);

            @Override
            public void onClick(View v) {
                b4press = sharedPreferences.getInt("button4", 0);
                b4press++;
                Toast.makeText(MainActivity.this, "B4 has been pressed " + b4press + " times.", Toast.LENGTH_SHORT).show();
                Log.i("B4", b4press + "");
                editor.putInt("button4", b4press);
                editor.apply();
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("button1", 0);
                editor.putInt("button2", 0);
                editor.putInt("button3", 0);
                editor.putInt("button4", 0);
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