package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "processador")
public class Processador implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "consumo_geral")
    private float consumoGeral;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "identificador")
    private String identificador;

    @Column(name = "quantidade_fisica")
    private int quantidadeFisica;

    @Column(name = "quantidade_logica")
    private int quantidadeLogica;

    @Column(name = "temperatura")
    private float temperatura;

    @OneToOne
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public Processador(){

    }

    public Processador(int id,
                       String codigo,
                       float consumoGeral,
                       String descricao,
                       String identificador,
                       int quantidadeFisica,
                       int quantidadeLogica,
                       float temperatura,
                       Maquina maquina) {

        this.id = id;
        this.codigo = codigo;
        this.consumoGeral = consumoGeral;
        this.descricao = descricao;
        this.identificador = identificador;
        this.quantidadeFisica = quantidadeFisica;
        this.quantidadeLogica = quantidadeLogica;
        this.temperatura = temperatura;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getConsumoGeral() {
        return consumoGeral;
    }

    public void setConsumoGeral(float consumoGeral) {
        this.consumoGeral = consumoGeral;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidadeFisica() {
        return quantidadeFisica;
    }

    public void setQuantidadeFisica(int quantidadeFisica) {
        this.quantidadeFisica = quantidadeFisica;
    }

    public int getQuantidadeLogica() {
        return quantidadeLogica;
    }

    public void setQuantidadeLogica(int quantidadeLogica) {
        this.quantidadeLogica = quantidadeLogica;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "ProcessadorRepository{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", consumoGeral=" + consumoGeral +
                ", descricao='" + descricao + '\'' +
                ", identificador='" + identificador + '\'' +
                ", quantidadeFisica=" + quantidadeFisica +
                ", quantidadeLogica=" + quantidadeLogica +
                ", temperatura=" + temperatura +
                ", maquina=" + maquina +
                '}';
    }
}


















