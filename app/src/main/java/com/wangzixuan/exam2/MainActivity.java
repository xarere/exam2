package com.wangzixuan.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickbtn1(View view) {
        startActivity(new Intent(this, UC1Activity.class));
    }

    public void onClickbtn5(View view) {
        startActivity(new Intent(this,UC5Activity.class));

    }

    public void onClickbtn4(View view) {
        startActivity(new Intent(this,UC4Activity.class));

    }

    public void onClickbtn3(View view) {
        startActivity(new Intent(this,UC3Activity.class));

    }

    public void onClickbtn2(View view) {
        startActivity(new Intent(this,UC2Activity.class));

    }
}
