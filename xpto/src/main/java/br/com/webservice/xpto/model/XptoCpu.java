package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "xpto_cpu")
public class XptoCpu implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quantidade_fisica")
    private String quantidadeFisica;

    @Column(name = "quantidade_logica")
    private String quantidadeLogica;

    @Column(name = "identificador")
    private String identificador;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "consumo_geral")
    private String consumoGeral;

    @Column(name = "temperatura")
    private String temperatura;

    @ManyToOne
    private XptoMaquina xptoMaquina;

    public XptoCpu(){

        this.id = 0;
        this.descricao = "";
        this.quantidadeFisica = "";
        this.quantidadeLogica = "";
        this.identificador = "";
        this.codigo = "";
        this.consumoGeral = "";
        this.temperatura = "";
        this.xptoMaquina = new XptoMaquina();
    }

    public XptoCpu(long id,
                   String descricao,
                   String quantidadeFisica,
                   String quantidadeLogica,
                   String identificador,
                   String codigo,
                   String consumoGeral,
                   String temperatura,
                   XptoMaquina xptoMaquina) {

        this.id = id;
        this.descricao = descricao;
        this.quantidadeFisica = quantidadeFisica;
        this.quantidadeLogica = quantidadeLogica;
        this.identificador = identificador;
        this.codigo = codigo;
        this.consumoGeral = consumoGeral;
        this.temperatura = temperatura;
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

    public String getQuantidadeFisica() {
        return this.quantidadeFisica;
    }

    public void setQuantidadeFisica(String quantidadeFisica) {
        this.quantidadeFisica = quantidadeFisica;
    }

    public String getQuantidadeLogica() {
        return this.quantidadeLogica;
    }

    public void setQuantidadeLogica(String quantidadeLogica) {
        this.quantidadeLogica = quantidadeLogica;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConsumoGeral() {
        return this.consumoGeral;
    }

    public void setConsumoGeral(String consumoGeral) {
        this.consumoGeral = consumoGeral;
    }

    public String getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public XptoMaquina getXptoMaquina() {
        return this.xptoMaquina;
    }

    public void setXptoMaquina(XptoMaquina xptoMaquina) {
        this.xptoMaquina = xptoMaquina;
    }
}








