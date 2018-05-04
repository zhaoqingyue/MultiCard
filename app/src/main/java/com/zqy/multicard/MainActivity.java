package com.zqy.multicard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.normal})
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.normal: {
                Toast.makeText(this, "点击效果", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
