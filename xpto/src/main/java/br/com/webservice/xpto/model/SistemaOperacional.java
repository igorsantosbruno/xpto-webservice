package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "sistema_operacional")
public class SistemaOperacional implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "arquitetura")
    private String arquitetura;

    @Column(name = "descricao")
    private String descricao;

    @OneToOne
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public SistemaOperacional(){

    }

    public SistemaOperacional(int id,
                              String arquitetura,
                              String descricao,
                              Maquina maquina) {
        this.id = id;
        this.arquitetura = arquitetura;
        this.descricao = descricao;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArquitetura() {
        return arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "SistemaOperacional{" +
                "id=" + id +
                ", arquitetura='" + arquitetura + '\'' +
                ", descricao='" + descricao + '\'' +
                ", maquina=" + maquina +
                '}';
    }
}
