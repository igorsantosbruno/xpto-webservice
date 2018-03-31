package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "xpto_processo")
public class XptoProcesso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    private XptoMaquina xptoMaquina;

    public XptoProcesso(){

        this.id = 0;
        this.descricao = "";
        this.xptoMaquina = new XptoMaquina();
    }

    public XptoProcesso(long id, String descricao, XptoMaquina xptoMaquina) {

        this.id = id;
        this.descricao = descricao;
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

    public XptoMaquina getXptoMaquina() {
        return xptoMaquina;
    }

    public void setXptoMaquina(XptoMaquina xptoMaquina) {
        this.xptoMaquina = xptoMaquina;
    }
}
