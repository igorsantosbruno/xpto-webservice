package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

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

    @Column(name = "percentual_hd")
    private float percentualHd;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public Monitoramento(){

    }

    public Monitoramento(float consumoCpu, float percentualRam, float percentualHd) {

        this.id = 0;
        this.consumoCpu = consumoCpu;
        this.temperaturaCpu = 0;
        this.percentualRam = percentualRam;
        this.percentualHd = percentualHd;
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

    public float getPercentualHd() {
        return percentualHd;
    }

    public void setPercentualHd(float percentualHd) {
        this.percentualHd = percentualHd;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Monitoramento{" +
                "id=" + id +
                ", consumoCpu=" + consumoCpu +
                ", temperaturaCpu=" + temperaturaCpu +
                ", percentualRam=" + percentualRam +
                ", percentualHd=" + percentualHd +
                ", maquina=" + maquina +
                '}';
    }
}
