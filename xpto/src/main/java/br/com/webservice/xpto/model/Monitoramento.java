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

    @Column(name = "consumo_cpu")
    private float consumoCpu;

    @Column(name = "temperatura_cpu")
    private float temperaturaCpu;

    @Column(name = "percentual_ram")
    private float percentualRam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    @OneToMany(targetEntity = MonitoramentoHd.class, mappedBy = "monitoramento", fetch = FetchType.LAZY)
    private List<MonitoramentoHd> monitoramentoHds;

    public Monitoramento(){

    }

    public Monitoramento(float consumoCpu, float percentualRam, float percentualHd) {

        this.id = 0;
        this.consumoCpu = consumoCpu;
        this.temperaturaCpu = 0;
        this.percentualRam = percentualRam;
        this.maquina = new Maquina();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getConsumoCpu() {
        return consumoCpu;
    }

    public void setConsumoCpu(float consumoCpu) {
        this.consumoCpu = consumoCpu;
    }

    public float getTemperaturaCpu() {
        return temperaturaCpu;
    }

    public void setTemperaturaCpu(float temperaturaCpu) {
        this.temperaturaCpu = temperaturaCpu;
    }

    public float getPercentualRam() {
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

    public List<MonitoramentoHd> getMonitoramentoHds() {
        return monitoramentoHds;
    }

    public void setMonitoramentoHds(List<MonitoramentoHd> monitoramentoHds) {
        this.monitoramentoHds = monitoramentoHds;
    }

    @Override
    public String toString() {
        return "Monitoramento{" +
                "id=" + id +
                ", consumoCpu=" + consumoCpu +
                ", temperaturaCpu=" + temperaturaCpu +
                ", percentualRam=" + percentualRam +
                ", maquina=" + maquina +
                '}';
    }
}
