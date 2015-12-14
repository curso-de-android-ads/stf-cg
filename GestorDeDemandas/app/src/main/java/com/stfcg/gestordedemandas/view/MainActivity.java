package com.stfcg.gestordedemandas.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.stfcg.gestordedemandas.R;

import butterknife.Bind;
import butterknife.ButterKnife;
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
    public void btnCadastrarListener() {

        Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intent);

    }

    @OnClick(R.id.btn_listar)
    public void btnListarListener() {

        Intent intent = new Intent(MainActivity.this, ListarDemandasActivity.class);
        startActivity(intent);

    }
}
