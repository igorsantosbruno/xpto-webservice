package br.com.webservice.xpto.model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity(name = "xpto_sistema_operacional")
public class XptoSistemaOperacional {

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "xptoMaquina"))
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "arquitetura")
    private String arquitetura;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private XptoMaquina xptoMaquina;

    public XptoSistemaOperacional(){

        /*this.id = 0;
        this.descricao = "";
        this.arquitetura = "";
        this.xptoMaquina = new XptoMaquina();*/
    }

    public XptoSistemaOperacional(long id, String descricao, String arquitetura, XptoMaquina xptoMaquina) {

        this.id = id;
        this.descricao = descricao;
        this.arquitetura = arquitetura;
        this.xptoMaquina = xptoMaquina;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArquitetura() {
        return this.arquitetura;
    }

    public void setArquitetura(String arquitetura) {
        this.arquitetura = arquitetura;
    }

    public XptoMaquina getXptoMaquina() {
        return this.xptoMaquina;
    }

    public void setXptoMaquina(XptoMaquina xptoMaquina) {
        this.xptoMaquina = xptoMaquina;
    }
}
