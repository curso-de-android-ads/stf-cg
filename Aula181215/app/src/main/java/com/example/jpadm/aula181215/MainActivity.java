package com.example.jpadm.aula181215;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_cadastro)
    Button btnCadastrar;

    @Bind(R.id.btn_listar)
    Button btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_cadastro)
    public void btnCadastrarListener(){

        Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intent);

    }
}
