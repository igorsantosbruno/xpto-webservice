package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "xpto_fabricante")
public class XptoFabricante implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_fabricacao")
    private String dataFabricacao;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "modelo_especifico")
    private String modeloEspecifico;

    @ManyToOne
    private XptoMaquina xptoMaquina;

    public XptoFabricante(){

        this.id = 0;
        this.descricao = "";
        this.dataFabricacao = "";
        this.modelo = "";
        this.modeloEspecifico = "";
        this.xptoMaquina = new XptoMaquina();
    }

    public XptoFabricante(long id,
                          String descricao,
                          String dataFabricacao, String modelo, String modeloEspecifico, XptoMaquina xptoMaquina) {
        this.id = id;
        this.descricao = descricao;
        this.dataFabricacao = dataFabricacao;
        this.modelo = modelo;
        this.modeloEspecifico = modeloEspecifico;
        this.xptoMaquina = xptoMaquina;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
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

    public XptoMaquina getXptoMaquina() {
        return xptoMaquina;
    }

    public void setXptoMaquina(XptoMaquina xptoMaquina) {
        this.xptoMaquina = xptoMaquina;
    }
}
