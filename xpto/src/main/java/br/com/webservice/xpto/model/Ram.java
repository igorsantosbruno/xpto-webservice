package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "ram")
public class Ram implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "espaco_total")
    private String espacoTotal;

    @Column(name = "espaco_disponivel")
    private String espacoDisponivel;

    @OneToOne
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public Ram(){

    }

    public Ram(int id, String espacoTotal, String espacoDisponivel, Maquina maquina) {
        this.id = id;
        this.espacoTotal = espacoTotal;
        this.espacoDisponivel = espacoDisponivel;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspacoTotal() {
        return espacoTotal;
    }

    public void setEspacoTotal(String espacoTotal) {
        this.espacoTotal = espacoTotal;
    }

    public String getEspacoDisponivel() {
        return espacoDisponivel;
    }

    public void setEspacoDisponivel(String espacoDisponivel) {
        this.espacoDisponivel = espacoDisponivel;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "id=" + id +
                ", espacoTotal='" + espacoTotal + '\'' +
                ", espacoDisponivel='" + espacoDisponivel + '\'' +
                ", maquina=" + maquina +
                '}';
    }
}
