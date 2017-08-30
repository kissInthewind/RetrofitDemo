package com.hesm.refrofitdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hesm.refrofitdemo.R;

/**
 * 跳转页面
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_tech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tech = (Button) findViewById(R.id.btn_tech);
        btn_tech.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_tech:
                TechActivity.launch(this);
                break;
            default:
                break;
        }
    }
}
