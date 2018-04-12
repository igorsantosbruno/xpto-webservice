package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "fabricante")
public class Fabricante implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data_fabricacao")
    private String dataFabricacao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "modelo_especifico")
    private String modeloEspecifico;

    @OneToOne
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public Fabricante(){

    }

    public Fabricante(int id,
                      String dataFabricacao,
                      String descricao,
                      String modelo,
                      String modeloEspecifico,
                      Maquina maquina) {
        this.id = id;
        this.dataFabricacao = dataFabricacao;
        this.descricao = descricao;
        this.modelo = modelo;
        this.modeloEspecifico = modeloEspecifico;
        this.maquina = maquina;
    }

    public Fabricante(String descricao, String modelo, String dataDeFabricacao, String modeloEspecifico, Maquina maquina){

        this.descricao = descricao;
        this.modelo = modelo;
        this.dataFabricacao = dataDeFabricacao;
        this.modeloEspecifico = modeloEspecifico;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModeloEspecifico() {
        return modeloEspecifico;
    }

    public void setModeloEspecifico(String modeloEspecifico) {
        this.modeloEspecifico = modeloEspecifico;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "FabricanteRepository{" +
                "id=" + id +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                ", descricao='" + descricao + '\'' +
                ", modelo='" + modelo + '\'' +
                ", modeloEspecifico='" + modeloEspecifico + '\'' +
                ", maquina=" + maquina +
                '}';
    }
}
