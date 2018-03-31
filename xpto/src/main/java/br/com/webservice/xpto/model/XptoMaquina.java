package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "xpto_maquina")
public class XptoMaquina implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "numero_serial")
    private String numeroSerial;

    @ManyToOne
    private XptoEmpresa xptoEmpresa;

    @OneToMany
    private List<XptoSistemaOperacional> listaDeSistemaOperacional;

    @OneToMany
    private List<XptoFabricante> listaDeFabricante;

    @OneToMany
    private List<XptoCpu> listaDeCpu;

    @OneToMany
    private List<XptoProcesso> listaDeProcesso;

    public XptoMaquina(){

        this.id = 0;
        this.numeroSerial = "";
        this.xptoEmpresa = new XptoEmpresa();
        this.listaDeSistemaOperacional = new ArrayList<XptoSistemaOperacional>();
        this.listaDeFabricante = new ArrayList<XptoFabricante>();
        this.listaDeCpu = new ArrayList<XptoCpu>();
        this.listaDeProcesso = new ArrayList<XptoProcesso>();
    }

    public XptoMaquina(long id,
                       String numeroSerial,
                       XptoEmpresa xptoEmpresa,
                       List<XptoSistemaOperacional> listaDeSistemaOperacional,
                       List<XptoFabricante> listaDeFabricante,
                       List<XptoCpu> listaDeCpu,
                       List<XptoProcesso> listaDeProcesso) {
        this.id = id;
        this.numeroSerial = numeroSerial;
        this.xptoEmpresa = xptoEmpresa;
        this.listaDeSistemaOperacional = listaDeSistemaOperacional;
        this.listaDeFabricante = listaDeFabricante;
        this.listaDeCpu = listaDeCpu;
        this.listaDeProcesso = listaDeProcesso;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroSerial() {
        return this.numeroSerial;
    }

    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public XptoEmpresa getXptoEmpresa() {
        return this.xptoEmpresa;
    }

    public void setXptoEmpresa(XptoEmpresa xptoEmpresa) {
        this.xptoEmpresa = xptoEmpresa;
    }

    public List<XptoSistemaOperacional> getListaDeSistemaOperacional() {
        return this.listaDeSistemaOperacional;
    }

    public void setListaDeSistemaOperacional(List<XptoSistemaOperacional> listaDeSistemaOperacional) {
        this.listaDeSistemaOperacional = listaDeSistemaOperacional;
    }

    public List<XptoFabricante> getListaDeFabricante() {
        return this.listaDeFabricante;
    }

    public void setListaDeFabricante(List<XptoFabricante> listaDeFabricante) {
        this.listaDeFabricante = listaDeFabricante;
    }

    public List<XptoCpu> getListaDeCpu() {
        return this.listaDeCpu;
    }

    public void setListaDeCpu(List<XptoCpu> listaDeCpu) {
        this.listaDeCpu = listaDeCpu;
    }

    public List<XptoProcesso> getListaDeProcesso() {
        return this.listaDeProcesso;
    }

    public void setListaDeProcesso(List<XptoProcesso> listaDeProcesso) {
        this.listaDeProcesso = listaDeProcesso;
    }
}
