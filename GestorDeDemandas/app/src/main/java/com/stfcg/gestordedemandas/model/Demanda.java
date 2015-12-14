package com.stfcg.gestordedemandas.model;

import java.io.Serializable;

/**
 * Created by jpadm on /12/2015.
 */
public class Demanda implements Serializable {

    private String mNomeGerenteProjetos;
    private Integer mNumero;
    private String mTitulo;
    private String mStatus;
    private String mResponsavel;
    private String mPrazo;
    private String mObservacoes;


    public Demanda() {
    }

    public Demanda(String mNomeGerenteProjetos, Integer mNumero, String mTitulo, String mStatus, String mResponsavel, String mPrazo, String mObservacoes) {
        this.mNomeGerenteProjetos = mNomeGerenteProjetos;
        this.mNumero = mNumero;
        this.mTitulo = mTitulo;
        this.mStatus = mStatus;
        this.mResponsavel = mResponsavel;
        this.mPrazo = mPrazo;
        this.mObservacoes = mObservacoes;
    }

    public String getmNomeGerenteProjetos() {
        return mNomeGerenteProjetos;
    }

    public void setmNomeGerenteProjetos(String mNomeGerenteProjetos) {
        this.mNomeGerenteProjetos = mNomeGerenteProjetos;
    }

    public Integer getmNumero() {
        return mNumero;
    }

    public void setmNumero(Integer mNumero) {
        this.mNumero = mNumero;
    }

    public String getmTitulo() {
        return mTitulo;
    }

    public void setmTitulo(String mTitulo) {
        this.mTitulo = mTitulo;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getmResponsavel() {
        return mResponsavel;
    }

    public void setmResponsavel(String mResponsavel) {
        this.mResponsavel = mResponsavel;
    }

    public String getmPrazo() {
        return mPrazo;
    }

    public void setmPrazo(String mPrazo) {
        this.mPrazo = mPrazo;
    }

    public String getmObservacoes() {
        return mObservacoes;
    }

    public void setmObservacoes(String mObservacoes) {
        this.mObservacoes = mObservacoes;
    }

    @Override
    public String toString() {
        return "Demanda{" +
                "mNomeGerenteProjetos='" + mNomeGerenteProjetos + '\'' +
                ", mNumero=" + mNumero +
                ", mTitulo='" + mTitulo + '\'' +
                ", mStatus='" + mStatus + '\'' +
                ", mResponsavel='" + mResponsavel + '\'' +
                ", mPrazo='" + mPrazo + '\'' +
                ", mObservacoes='" + mObservacoes + '\'' +
                '}';
    }

}
