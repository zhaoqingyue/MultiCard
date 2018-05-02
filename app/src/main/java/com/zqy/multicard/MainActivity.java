package com.zqy.multicard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick({R.id.normal})
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.normal: {
                break;
            }
        }
    }
}
