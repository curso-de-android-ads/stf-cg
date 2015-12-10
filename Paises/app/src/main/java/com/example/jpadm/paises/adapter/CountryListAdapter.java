package com.example.jpadm.paises.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jpadm.paises.R;
import com.example.jpadm.paises.model.Country;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jpadm on 09/12/2015.
 */
public class CountryListAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mInflater;
    List<Country> mCountries;

    public CountryListAdapter(Context mContext, List<Country> mCountries) {
        this.mContext = mContext;
        this.mCountries = mCountries;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mCountries.size();
    }

    @Override
    public Object getItem(int position) {
        return mCountries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        ViewHolder holder;


        if (convertView == null) {

            view = mInflater.inflate(R.layout.item_list_view_countries, null);

        } else {

            view = convertView;
        }

        holder = new ViewHolder(view);

        Country country = mCountries.get(position);

        holder.mTvCountryName.setText(country.getName());
        holder.mTvCountryCapital.setText(country.getCapital());
        holder.mTvCountryLanguage.setText(country.getLanguage());
        //holder.mIvCountryFlag.setBackgroundResource(R.drawable.esp);

        return view;
    }


    class ViewHolder {
        @Bind(R.id.iv_country_flag)
        ImageView mIvCountryFlag;

        @Bind(R.id.tv_country_name)
        TextView mTvCountryName;

        @Bind(R.id.tv_country_capital)
        TextView mTvCountryCapital;

        @Bind(R.id.tv_country_language)
        TextView mTvCountryLanguage;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }


    }
}
