package com.wangyinbao.demonstration.demonstration;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_startFragment){
           FragmentManager fragmentManager = getSupportFragmentManager();
           fragmentManager.beginTransaction().add(R.id.)
        }
    }
}
