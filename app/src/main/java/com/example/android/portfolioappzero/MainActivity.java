package com.example.android.portfolioappzero;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    //code referenced from stackoverflow.com

    public void onButtonClicked(View v)
    {
        if(v.getId() == R.id.spotify_button)
        {
            MessageBox("This Button will launch the Spotify Streamer App!");
        }

        if(v.getId() == R.id.score_app_button)
        {
            MessageBox("This Button will launch the Scores App!");
        }

        if(v.getId() == R.id.library_app_button)
        {
            MessageBox("This Button will launch Library App!");
        }

        if(v.getId() == R.id.build_it_bigger_app_button)
        {
            MessageBox("This Button will launch the Build It Bigger App!");
        }

        if(v.getId() == R.id.xyz_reader_app_button)
        {
            MessageBox("This Button will open the XYZ Reader App!");
        }

        if(v.getId() == R.id.capstone_app_button)
        {
            MessageBox("This Button will launch my capstone App!");
        }
    }

    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

