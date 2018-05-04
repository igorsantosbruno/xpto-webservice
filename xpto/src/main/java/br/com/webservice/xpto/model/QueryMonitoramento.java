package br.com.webservice.xpto.model;

import java.io.Serializable;

public class QueryMonitoramento implements Serializable{

    private static final long serialVersionUID = 1L;

    private float consumoCpu;
    private float percentualRam;
    private float percentualHd;

    public QueryMonitoramento(){

    }

    public QueryMonitoramento(float consumoCpu, float percentualRam, float percentualHd) {
        this.consumoCpu = consumoCpu;
        this.percentualRam = percentualRam;
        this.percentualHd = percentualHd;
    }

    public float getConsumoCpu() {
        return consumoCpu;
    }

    public void setConsumoCpu(float consumoCpu) {
        this.consumoCpu = consumoCpu;
    }

    public float getPercentualRam() {
        return percentualRam;
    }

    public void setPercentualRam(float percentualRam) {
        this.percentualRam = percentualRam;
    }

    public float getPercentualHd() {
        return percentualHd;
    }

    public void setPercentualHd(float percentualHd) {
        this.percentualHd = percentualHd;
    }

    @Override
    public String toString() {
        return "QueryMonitoramento{" +
                "consumoCpu=" + consumoCpu +
                ", percentualRam=" + percentualRam +
                ", percentualHd=" + percentualHd +
                '}';
    }
}
