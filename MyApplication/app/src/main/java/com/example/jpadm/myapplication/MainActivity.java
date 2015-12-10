package com.example.jpadm.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by jpadm on 07/12/2015.
 */
public class MainActivity extends AppCompatActivity {

   /* Button btnJellyBean;
    Button btnKitKat;

    @Bind(R.id.btn_lollipop)
    Button btnLollipop;

    @Bind(R.id.btn_mashmallow)
    Button btnMarshmallow;

    @BindString(R.string.lollipop)
    String lollipop;
    String kitkat;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

      /*  kitkat = getResources().getString(R.string.kit_kat);

        btnJellyBean = (Button) findViewById(R.id.btn_jelly_bean);
        btnKitKat = (Button) findViewById(R.id.btn_kitkat);

        btnLollipop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),
                        lollipop , Toast.LENGTH_LONG).show();
            }
        });*/

    }

  /*  @OnClick(R.id.btn_kitkat)
    public void btnKitkatListener(){

        Toast.makeText(getBaseContext(),
                kitkat , Toast.LENGTH_LONG).show();

    }*/
}
