package com.example.madlec10_quiz;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gotonext1(View view) {
        Intent i = new Intent(this, Second.class);
       // final EditText userInput = findViewById(R.id.editText);
       // String messageToSend = userInput.getText().toString();
        i.putExtra("firstMessage", "Cricket News");
        loadfragment(new cricket());
        startActivity(i);
    }

    public void gotonext2(View view) {
        Intent i = new Intent(this, Second.class);
        // final EditText userInput = findViewById(R.id.editText);
        // String messageToSend = userInput.getText().toString();
        i.putExtra("firstMessage", "Football News");
        loadfragment(new football());
        startActivity(i);
    }

    public void gotonext3(View view) {
        Intent i = new Intent(this, Second.class);
        // final EditText userInput = findViewById(R.id.editText);
        // String messageToSend = userInput.getText().toString();
        i.putExtra("firstMessage", "Tennis News");
        loadfragment(new tennis());
        startActivity(i);
    }


    private void loadfragment(Fragment fragment)
    {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.commit();
    }

}
