package com.example.jpadm.paises.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jpadm.paises.R;
import com.example.jpadm.paises.adapter.CountryListAdapter;
import com.example.jpadm.paises.model.Country;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ListViewActivity extends AppCompatActivity {

    @Bind(R.id.lv_countries)
    ListView mLvCountries;

    List<Country> mCountries;
    CountryListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ButterKnife.bind(this);

        mCountries = new ArrayList<>();
        populateData();
        mAdapter = new CountryListAdapter(this, mCountries);
        mLvCountries.setAdapter(mAdapter);

    }

    public void populateData() {

        Country brazil = new Country();
        brazil.setName(getResources().getString(R.string.bra_name));
        brazil.setCapital(getResources().getString(R.string.bra_capital));
        brazil.setLanguage(getResources().getString(R.string.bra_language));
        brazil.setFlagResourceId(R.drawable.bra);

        Country argentina = new Country();
        argentina.setName(getResources().getString(R.string.arg_name));
        argentina.setCapital(getResources().getString(R.string.arg_capital));
        argentina.setLanguage(getResources().getString(R.string.arg_language));
        argentina.setFlagResourceId(R.drawable.arg);

        mCountries.add(argentina);
        mCountries.add(brazil);
        mCountries.add(argentina);
        mCountries.add(brazil);
        mCountries.add(argentina);
        mCountries.add(brazil);
    }
}
