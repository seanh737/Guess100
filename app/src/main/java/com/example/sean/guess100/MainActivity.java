package com.example.sean.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    public void findViews(){
        TextView txt_s = (TextView) findViewById(R.id.secret);
        TextView txt_info = (TextView) findViewById(R.id.info);
        EditText ed_num = (EditText) findViewById(R.id.number);
        int number = Integer.parseInt(ed_num.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void send(View view){

    }
}
