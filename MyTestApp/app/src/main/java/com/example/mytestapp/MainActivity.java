package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //TextView vText = findViewById(R.id.act_text1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView vText = findViewById(R.id.act_text1);
        vText.setTextColor((int) 0xFFFF0000);

        View.OnClickListener oncl1 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("tag", "Pressed!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                TextView vText1 = findViewById(R.id.act_text1);
                intent.putExtra("tag1", vText1.getText() );
                startActivityForResult(intent,0);
            }
        };
        vText.setOnClickListener(oncl1);
        Log.e("tag", "Created!");
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode, data);

        if (data!=null) {
            String str="2334";
           if (data.getStringExtra("tag2")==null) {
               str = "empty";
           }
           else {
               str = data.getStringExtra("tag2");
           }

               Log.e("tag",str);
               TextView vText2 = findViewById(R.id.act_text1);
               vText2.setText(str);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
