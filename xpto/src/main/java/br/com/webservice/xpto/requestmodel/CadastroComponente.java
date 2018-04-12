package br.com.webservice.xpto.requestmodel;

import java.io.Serializable;

public class CadastroComponente implements Serializable{

    private static final long serialVersionUID = 1L;

    private String descricaoFabricante;
    private String modeloFabricante;
    private String dataDeFabricacao;
    private String modeloEspecifico;
    private String descricaoCpu;
    private int quantidadeFisicaCpu;
    private int quantidadeLogicaCpu;
    private String identificador;
    private String codigo;
    private String serial;

    public CadastroComponente(){

        this.descricaoFabricante = "";
        this.modeloFabricante = "";
        this.dataDeFabricacao = "";
        this.modeloEspecifico = "";
        this.descricaoCpu = "";
        this.quantidadeFisicaCpu = 0;
        this.quantidadeLogicaCpu = 0;
        this.identificador = "";
        this.codigo = "";
        this.serial = "";
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

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String getModeloEspecifico() {
        return modeloEspecifico;
    }

    public void setModeloEspecifico(String modeloEspecifico) {
        this.modeloEspecifico = modeloEspecifico;
    }

    public String getDescricaoCpu() {
        return descricaoCpu;
    }

    public void setDescricaoCpu(String descricaoCpu) {
        this.descricaoCpu = descricaoCpu;
    }

    public int getQuantidadeFisicaCpu() {
        return quantidadeFisicaCpu;
    }

    public void setQuantidadeFisicaCpu(int quantidadeFisicaCpu) {
        this.quantidadeFisicaCpu = quantidadeFisicaCpu;
    }

    public int getQuantidadeLogicaCpu() {
        return quantidadeLogicaCpu;
    }

    public void setQuantidadeLogicaCpu(int quantidadeLogicaCpu) {
        this.quantidadeLogicaCpu = quantidadeLogicaCpu;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "CadastroComponente{" +
                "descricaoFabricante='" + descricaoFabricante + '\'' +
                ", modeloFabricante='" + modeloFabricante + '\'' +
                ", dataDeFabricacao='" + dataDeFabricacao + '\'' +
                ", modeloEspecifico='" + modeloEspecifico + '\'' +
                ", descricaoCpu='" + descricaoCpu + '\'' +
                ", quantidadeFisicaCpu=" + quantidadeFisicaCpu +
                ", quantidadeLogicaCpu=" + quantidadeLogicaCpu +
                ", identificador='" + identificador + '\'' +
                ", codigo='" + codigo + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
