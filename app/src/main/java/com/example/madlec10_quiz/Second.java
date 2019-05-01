package com.example.madlec10_quiz;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView myText = findViewById(R.id.textView);

        Bundle dataFromSecond = getIntent().getExtras();
        {
            if(dataFromSecond == null)
                return;
        }
        String theMessage = dataFromSecond.getString("firstMessage");
        myText.setText (theMessage);
    }
    public void chooseFragment(View v)
    {
        switch (v.getId()){
            case (R.id.button8):
                loadfragment(new football());

                final TextView myText = findViewById(R.id.textView);
                myText.setText ("Football News");
                break;
            case (R.id.button9):
                loadfragment(new cricket());

                final TextView myText1 = findViewById(R.id.textView);
                myText1.setText ("Cricket News");
              break;

            case (R.id.button10):
                loadfragment(new tennis());

                final TextView myText2 = findViewById(R.id.textView);
                myText2.setText ("Tennis News");
                break;
        }
    }

    private void loadfragment(Fragment fragment)
    {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.commit();
    }
}