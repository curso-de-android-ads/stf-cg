package com.stfcg.gestordedemandas.view;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.stfcg.gestordedemandas.R;
import com.stfcg.gestordedemandas.fragment.SelecionarDataDialog;
import com.stfcg.gestordedemandas.model.Demanda;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by jpadm on 08/12/2015.
 */
public class CadastroActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    @Bind(R.id.et_num_demanda)
    EditText mEtNumDemanda;

    @Bind(R.id.et_responsavel_demanda)
    EditText mEtRespDemanda;

    @Bind(R.id.et_titulo_demanda)
    EditText mEtTituloDemanda;

    @Bind(R.id.et_prazo_demanda)
    EditText mEtPrazoDemanda;

    @Bind(R.id.et_observacao_demanda)
    EditText mEtObservacaoDemanda;

    @Bind(R.id.sp_nome_gp)
    Spinner mSpNomeGerente;

    @Bind(R.id.sp_status_demanda)
    Spinner mSpStatusDemanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        ButterKnife.bind(this);

        mEtPrazoDemanda.setOnKeyListener(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item_cancelar:
                return true;

            case R.id.item_salvar:
                salvarDemanda();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    @OnClick(R.id.et_prazo_demanda)
    public void selecionarData() {
        SelecionarDataDialog dialog = new SelecionarDataDialog();
        dialog.show(getSupportFragmentManager(), "selecionarData");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String dataSelecionada = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
        mEtPrazoDemanda.setText(dataSelecionada);
    }

    private void salvarDemanda() {

        Demanda demanda = new Demanda();

        demanda.setmNomeGerenteProjetos(mSpNomeGerente.getSelectedItem() == null ? "" : mSpNomeGerente.getSelectedItem().toString());
        demanda.setmStatus(mSpStatusDemanda.getSelectedItem() == null ? "" : mSpStatusDemanda.getSelectedItem().toString());
        demanda.setmTitulo(mEtTituloDemanda.getText() == null ? "" : mEtTituloDemanda.getText().toString());
        demanda.setmNumero(mEtNumDemanda.getText() == null ? 0 : Integer.parseInt(mEtNumDemanda.getText().toString()));
        demanda.setmPrazo(mEtPrazoDemanda.getText() == null ? "" : mEtPrazoDemanda.getText().toString());
        demanda.setmObservacoes(mEtObservacaoDemanda.getText() == null ? "" : mEtObservacaoDemanda.getText().toString());
        demanda.setmResponsavel(mEtRespDemanda.getText() == null ? "" : mEtRespDemanda.getText().toString());

        Toast.makeText(this, demanda.toString(), Toast.LENGTH_LONG).show();
    }
}
