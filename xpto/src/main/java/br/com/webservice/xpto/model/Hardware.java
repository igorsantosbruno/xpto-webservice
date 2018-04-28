package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "hardware")
public class Hardware implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data_fabricacao")
    private String dataFabricacao;

    @Column(name = "descricao_fabricante")
    private String descricaoFabricante;

    @Column(name = "modelo_fabricante")
    private String modeloFabricante;

    @Column(name = "modelo_especifico_fabricante")
    private String modeloEspecificoFabricante;

    @Column(name = "codigo_processador")
    private String codigoProcessador;

    @Column(name = "descricao_processador")
    private String descricaoProcessador;

    @Column(name = "identificador_processador")
    private String identificadorProcessador;

    @Column(name = "quantidade_fisica_processador")
    private String quantidadeFisicaProcessador;

    @Column(name = "quantidade_logica_processador")
    private String quantidadeLogicaProcessador;

    @Column(name = "espaco_total_ram")
    private String espacoTotalRam;

    @Column(name = "arquiteura_sistema_operacional")
    private String arquiteturaSistemaOperacional;

    @Column(name = "descricao_sistema_operacional")
    private String descricaoSistemaOperacional;

    @Column(name = "usuario_logado")
    private String usuarioLogado;

    @OneToOne
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public Hardware(){

    }

    public Hardware(String dataFabricacao,
                    String descricaoFabricante,
                    String modeloFabricante,
                    String modeloEspecificoFabricante,
                    String codigoProcessador,
                    String descricaoProcessador,
                    String identificadorProcessador,
                    String quantidadeFisicaProcessador,
                    String quantidadeLogicaProcessador,
                    String espacoTotalRam,
                    String arquiteturaSistemaOperacional,
                    String descricaoSistemaOperacional,
                    String usuarioLogado,
                    Maquina maquina) {

        this.dataFabricacao = dataFabricacao;
        this.descricaoFabricante = descricaoFabricante;
        this.modeloFabricante = modeloFabricante;
        this.modeloEspecificoFabricante = modeloEspecificoFabricante;
        this.codigoProcessador = codigoProcessador;
        this.descricaoProcessador = descricaoProcessador;
        this.identificadorProcessador = identificadorProcessador;
        this.quantidadeFisicaProcessador = quantidadeFisicaProcessador;
        this.quantidadeLogicaProcessador = quantidadeLogicaProcessador;
        this.espacoTotalRam = espacoTotalRam;
        this.arquiteturaSistemaOperacional = arquiteturaSistemaOperacional;
        this.descricaoSistemaOperacional = descricaoSistemaOperacional;
        this.usuarioLogado = usuarioLogado;
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

    public String getDescricaoFabricante() {
        return descricaoFabricante;
    }

    public void setDescricaoFabricante(String descricaoFabricante) {
        this.descricaoFabricante = descricaoFabricante;
    }

    public String getModeloFabricante() {
        return modeloFabricante;
    }

    public void setModeloFabricante(String modeloFabricante) {
        this.modeloFabricante = modeloFabricante;
    }

    public String getModeloEspecificoFabricante() {
        return modeloEspecificoFabricante;
    }

    public void setModeloEspecificoFabricante(String modeloEspecificoFabricante) {
        this.modeloEspecificoFabricante = modeloEspecificoFabricante;
    }

    public String getCodigoProcessador() {
        return codigoProcessador;
    }

    public void setCodigoProcessador(String codigoProcessador) {
        this.codigoProcessador = codigoProcessador;
    }

    public String getDescricaoProcessador() {
        return descricaoProcessador;
    }

    public void setDescricaoProcessador(String descricaoProcessador) {
        this.descricaoProcessador = descricaoProcessador;
    }

    public String getIdentificadorProcessador() {
        return identificadorProcessador;
    }

    public void setIdentificadorProcessador(String identificadorProcessador) {
        this.identificadorProcessador = identificadorProcessador;
    }

    public String getQuantidadeFisicaProcessador() {
        return quantidadeFisicaProcessador;
    }

    public void setQuantidadeFisicaProcessador(String quantidadeFisicaProcessador) {
        this.quantidadeFisicaProcessador = quantidadeFisicaProcessador;
    }

    public String getQuantidadeLogicaProcessador() {
        return quantidadeLogicaProcessador;
    }

    public void setQuantidadeLogicaProcessador(String quantidadeLogicaProcessador) {
        this.quantidadeLogicaProcessador = quantidadeLogicaProcessador;
    }

    public String getEspacoTotalRam() {
        return espacoTotalRam;
    }

    public void setEspacoTotalRam(String espacoTotalRam) {
        this.espacoTotalRam = espacoTotalRam;
    }

    public String getArquiteturaSistemaOperacional() {
        return arquiteturaSistemaOperacional;
    }

    public void setArquiteturaSistemaOperacional(String arquiteturaSistemaOperacional) {
        this.arquiteturaSistemaOperacional = arquiteturaSistemaOperacional;
    }

    public String getDescricaoSistemaOperacional() {
        return descricaoSistemaOperacional;
    }

    public void setDescricaoSistemaOperacional(String descricaoSistemaOperacional) {
        this.descricaoSistemaOperacional = descricaoSistemaOperacional;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "id=" + id +
                ", dataFabricacao='" + dataFabricacao + '\'' +
                ", descricaoFabricante='" + descricaoFabricante + '\'' +
                ", modeloFabricante='" + modeloFabricante + '\'' +
                ", modeloEspecificoFabricante='" + modeloEspecificoFabricante + '\'' +
                ", codigoProcessador='" + codigoProcessador + '\'' +
                ", descricaoProcessador='" + descricaoProcessador + '\'' +
                ", identificadorProcessador='" + identificadorProcessador + '\'' +
                ", quantidadeFisicaProcessador='" + quantidadeFisicaProcessador + '\'' +
                ", quantidadeLogicaProcessador='" + quantidadeLogicaProcessador + '\'' +
                ", espacoTotalRam='" + espacoTotalRam + '\'' +
                ", arquiteturaSistemaOperacional='" + arquiteturaSistemaOperacional + '\'' +
                ", descricaoSistemaOperacional='" + descricaoSistemaOperacional + '\'' +
                ", usuarioLogado='" + usuarioLogado + '\'' +
                ", maquina=" + maquina +
                '}';
    }
}
