package br.com.webservice.xpto.model;

import javax.persistence.*;

@Entity(name = "xpto_hd")
public class XptoHd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    private XptoMaquina xptoMaquina;

    public XptoHd(){

        this.id = 0;
        this.descricao = "";
        this.xptoMaquina = new XptoMaquina();
    }

    public XptoHd(long id, String descricao, XptoMaquina xptoMaquina) {
        this.id = id;
        this.descricao = descricao;
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

    public XptoMaquina getXptoMaquina() {
        return this.xptoMaquina;
    }

    public void setXptoMaquina(XptoMaquina xptoMaquina) {
        this.xptoMaquina = xptoMaquina;
    }
}
