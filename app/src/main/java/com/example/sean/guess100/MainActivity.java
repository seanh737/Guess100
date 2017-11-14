package com.example.sean.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int r = new Random().nextInt(100)+1;

    public void findViews(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void send(View view){
        TextView txt_s = (TextView) findViewById(R.id.secret);
        TextView txt_info = (TextView) findViewById(R.id.info);
        EditText ed_num = (EditText) findViewById(R.id.number);
        int number = Integer.parseInt(ed_num.getText().toString());
        txt_s.setText(Integer.toString(r));

        if(number<r){
            ed_num.setText(Integer.toString(number));
            new AlertDialog.Builder(this)
                    .setMessage(number+" to 100")
                    .setTitle("Number")
                    .setPositiveButton("OK",null)
                    .show();
        }else if(number>r){
            new AlertDialog.Builder(this)
                    .setMessage("0 to "+number)
                    .setTitle("Number")
                    .setPositiveButton("OK",null)
                    .show();
        }
        if (number == r){
            new AlertDialog.Builder(this)
                    .setMessage("答對拉")
                    .setTitle("恭喜!")
                    .setPositiveButton("OK",null)
                    .show();
        }

    }
}
