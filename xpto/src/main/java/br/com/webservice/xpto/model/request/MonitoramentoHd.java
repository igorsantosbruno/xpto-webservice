package br.com.webservice.xpto.model.request;

import java.io.Serializable;

public class MonitoramentoHd implements Serializable {

    private static final long serialVersionUID = 1L;

    private float percentualUtilizado;

    private String caminhoAbsoluto;

    public MonitoramentoHd(){

    }

    public MonitoramentoHd(float percentualUtilizado, String caminhoAbsoluto) {
        this.percentualUtilizado = percentualUtilizado;
        this.caminhoAbsoluto = caminhoAbsoluto;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public float getPercentualUtilizado() {
        return percentualUtilizado;
    }

    public void setPercentualUtilizado(float percentualUtilizado) {
        this.percentualUtilizado = percentualUtilizado;
    }

    public String getCaminhoAbsoluto() {
        return caminhoAbsoluto;
    }

    public void setCaminhoAbsoluto(String caminhoAbsoluto) {
        this.caminhoAbsoluto = caminhoAbsoluto;
    }
}
