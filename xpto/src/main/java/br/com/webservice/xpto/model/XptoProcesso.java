package br.com.webservice.xpto.model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import org.hibernate.annotations.Parameter;

@Entity(name = "xpto_processo")
public class XptoProcesso implements Serializable {

    private static final long serialVersionUID = 1L;

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "xptoMaquina"))
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private XptoMaquina xptoMaquina;

    public XptoProcesso(){

        /*this.id = 0;
        this.descricao = "";*/
    }

    public XptoProcesso(long id, String descricao, XptoMaquina xptoMaquina) {

        this.id = id;
        this.descricao = descricao;
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
