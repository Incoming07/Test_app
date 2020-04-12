package com.example.mytestapp;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        final EditText edText = findViewById(R.id.act2_edit_text_f);
        findViewById(R.id.act2_btn_f).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Log.e("tag", edText.getText().toString());
                intent.putExtra("tag2", edText.getText().toString());
                setResult(0,intent);
                finish();
            }
        });
        //
        String str = getIntent().getStringExtra("tag1");

        edText.setText(str);
    }
}
