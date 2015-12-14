package com.stfcg.gestordedemandas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.stfcg.gestordedemandas.R;
import com.stfcg.gestordedemandas.adapter.DemandaListAdapter;
import com.stfcg.gestordedemandas.model.Demanda;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jpadm on 11/12/2015.
 */
public class StatusDemandaFragment extends Fragment {

    @Bind(R.id.lv_status_demanda)
    ListView mLvStatusDemanda;

    DemandaListAdapter mAdapter;

    List<Demanda> mDemandas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status_demanda, null);
        ButterKnife.bind(this, view);

        mAdapter = new DemandaListAdapter(getmDemandas(), getActivity().getBaseContext());
        mLvStatusDemanda.setAdapter(mAdapter);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public List<Demanda> getmDemandas() {
        if (mDemandas == null) {
            mDemandas = new ArrayList<>();
        }

        return mDemandas;
    }

    public void setmDemandas(List<Demanda> mDemandas) {
        this.mDemandas = mDemandas;
    }
}
