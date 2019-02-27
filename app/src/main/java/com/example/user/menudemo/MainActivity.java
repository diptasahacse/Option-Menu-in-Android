package com.example.user.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //////////////////////////Menu//////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menudesign,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //////////////////////////.......................//


    ///////////////Add Llistener///////////.......................//

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.Settingid)
        {
            Toast.makeText(MainActivity.this,"Setting is Clicked",Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.feedbackid)
        {
            Toast.makeText(MainActivity.this,"Feedback is Clicked",Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.aboutid)
        {
            Toast.makeText(MainActivity.this,"About Us is Clicked",Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }
}
