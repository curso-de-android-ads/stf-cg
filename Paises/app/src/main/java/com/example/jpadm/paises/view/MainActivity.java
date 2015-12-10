package com.example.jpadm.paises.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.jpadm.paises.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_grid)
    public void btnGridListener() {
        Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_list)
    public void btnListListener() {
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);

    }
}
