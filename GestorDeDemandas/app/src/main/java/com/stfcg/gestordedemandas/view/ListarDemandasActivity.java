package com.stfcg.gestordedemandas.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import com.stfcg.gestordedemandas.R;
import com.stfcg.gestordedemandas.adapter.DemandaPagerAdapter;
import com.stfcg.gestordedemandas.model.Demanda;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jpadm on 11/12/2015.
 */
public class ListarDemandasActivity extends AppCompatActivity {

    @Bind(R.id.vp_demandas)
    ViewPager mVpDemandas;

    List<Demanda> mDemandas;

    DemandaPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_demandas);
        ButterKnife.bind(this);

        mDemandas = new ArrayList<>();
        populateData();
        mPagerAdapter = new DemandaPagerAdapter(getSupportFragmentManager(), mDemandas, getBaseContext());
        mVpDemandas.setAdapter(mPagerAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_listar, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item_lista:
                Toast.makeText(this, "Lista", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item_grade:
                Toast.makeText(this, "Grade", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }


    public void populateData() {


        Demanda demanda = new Demanda();

        demanda.setmTitulo("Hackathon - Tela Cadastro");
        demanda.setmResponsavel("Manoel");
        demanda.setmObservacoes("Fazer a tela de cadastro pra o app do Hackathon");
        demanda.setmPrazo("17/12/15");
        demanda.setmNomeGerenteProjetos("Miguel Prazeres");
        demanda.setmNumero(02335);
        demanda.setmStatus("Em homologação");

        mDemandas.add(demanda);

        Demanda demandaUm = new Demanda();

        demandaUm.setmTitulo("Hackathon - Tela Listar");
        demandaUm.setmResponsavel("Manoel");
        demandaUm.setmObservacoes("Fazer a tela de listagem pra o app do Hackathon");
        demandaUm.setmPrazo("18/12/15");
        demandaUm.setmNomeGerenteProjetos("Miguel Prazeres");
        demandaUm.setmNumero(02343);
        demandaUm.setmStatus("Em desenvolvimento");

        mDemandas.add(demandaUm);

        Demanda demandaDois = new Demanda();

        demandaDois.setmTitulo("Hackathon - Tela Gerentes");
        demandaDois.setmResponsavel("Manoel");
        demandaDois.setmObservacoes("Fazer a tela de Cadastro de gerentes pra o app do Hackathon");
        demandaDois.setmPrazo("18/12/15");
        demandaDois.setmNomeGerenteProjetos("Miguel Prazeres");
        demandaDois.setmNumero(02322);
        demandaDois.setmStatus("Em impedimento");

        mDemandas.add(demandaDois);

        Demanda demandaTres = new Demanda();

        demandaTres.setmTitulo("Hackathon - Home");
        demandaTres.setmResponsavel("Manoel");
        demandaTres.setmObservacoes("Fazer a tela de Home pra o app do Hackathon");
        demandaTres.setmPrazo("10/12/15");
        demandaTres.setmNomeGerenteProjetos("Miguel Prazeres");
        demandaTres.setmNumero(12342);
        demandaTres.setmStatus("Finalizada");

        mDemandas.add(demandaTres);

        Demanda demandaQuatro = new Demanda();

        demandaQuatro.setmTitulo("Hackathon - Protótipo");
        demandaQuatro.setmResponsavel("Manoel");
        demandaQuatro.setmObservacoes("Fazer a protótipo pra o app do Hackathon");
        demandaQuatro.setmPrazo("08/12/15");
        demandaQuatro.setmNomeGerenteProjetos("Miguel Prazeres");
        demandaQuatro.setmNumero(12323);
        demandaQuatro.setmStatus("Finalizada");

        mDemandas.add(demandaQuatro);


    }

}
