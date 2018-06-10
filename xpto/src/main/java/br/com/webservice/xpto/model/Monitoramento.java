package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "XPTOTBA07_MONITORAMENTO")
@Entity(name = "monitoramento")
public class Monitoramento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "temperatura_cpu")
    private double temperaturaCpu;

    @Column(name = "percentual_ram")
    private double percentualRam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    @OneToMany(targetEntity = MonitoramentoHd.class, mappedBy = "monitoramento", fetch = FetchType.LAZY)
    private List<MonitoramentoHd> listaMonitoramentoHd;

    public Monitoramento(){

    }

    public Monitoramento(
                         double temperaturaCpu,
                         double percentualRam,
                         Maquina maquina) {

        this.temperaturaCpu = temperaturaCpu;
        this.percentualRam = percentualRam;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPercentualRam(float percentualRam) {
        this.percentualRam = percentualRam;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public List<MonitoramentoHd> getListaMonitoramentoHd() {
        return listaMonitoramentoHd;
    }

    public void setListaMonitoramentoHd(List<MonitoramentoHd> listaMonitoramentoHd) {
        this.listaMonitoramentoHd = listaMonitoramentoHd;
    }
}
