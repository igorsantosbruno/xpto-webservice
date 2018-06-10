package br.com.webservice.xpto.model.request;

import java.io.Serializable;
import java.util.List;

public class GravarMonitoramento implements Serializable{

    private static final long serialVersionUID = 1L;

    private double temperaturaCpu;
    private double percentualRam;

    private String serial;

    private List<MonitoramentoHd> listaDisco;

    public GravarMonitoramento(){

    }

    public GravarMonitoramento(double temperaturaCpu, double percentualRam, String serial, List<MonitoramentoHd> listaDisco) {
        this.temperaturaCpu = temperaturaCpu;
        this.percentualRam = percentualRam;
        this.serial = serial;
        this.listaDisco = listaDisco;
    }

    public double getTemperaturaCpu() {
        return temperaturaCpu;
    }

    public void setTemperaturaCpu(double temperaturaCpu) {
        this.temperaturaCpu = temperaturaCpu;
    }

    public double getPercentualRam() {
        return percentualRam;
    }

    public void setPercentualRam(double percentualRam) {
        this.percentualRam = percentualRam;
    }

    public List<MonitoramentoHd> getListaDisco() {
        return listaDisco;
    }

    public void setListaDisco(List<MonitoramentoHd> listaDisco) {
        this.listaDisco = listaDisco;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "GravarMonitoramento{" +
                "temperaturaCpu=" + temperaturaCpu +
                ", percentualRam=" + percentualRam +
                ", serial='" + serial + '\'' +
                ", listaDisco=" + listaDisco +
                '}';
    }
}
