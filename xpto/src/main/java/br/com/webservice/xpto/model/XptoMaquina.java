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
    @JoinColumn(name = "id_empresa")
    private XptoEmpresa xptoEmpresa;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "xptoMaquina", cascade = CascadeType.ALL)
    private XptoSistemaOperacional sistemaOperacional;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "xptoMaquina", cascade = CascadeType.ALL)
    private XptoFabricante fabricante;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "xptoMaquina", cascade = CascadeType.ALL)
    private XptoCpu cpu;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xptoMaquina")
    private List<XptoHd> listaDeHd;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "xptoMaquina", cascade = CascadeType.ALL)
    private XptoProcesso processo;

    public XptoMaquina(){

        /*this.id = 0;
        this.numeroSerial = "";
        this.xptoEmpresa = new XptoEmpresa();
        this.sistemaOperacional = new XptoSistemaOperacional();
        this.fabricante = new XptoFabricante();
        this.cpu = new XptoCpu();
        this.processo = new XptoProcesso();
        this.listaDeHd = new ArrayList<XptoHd>();*/
    }

    public XptoMaquina(long id,
                       String numeroSerial,
                       XptoEmpresa xptoEmpresa,
                       XptoSistemaOperacional sistemaOperacional,
                       XptoFabricante fabricante,
                       XptoCpu cpu,
                       XptoProcesso processo,
                       List<XptoHd> listaDeHd) {
        this.id = id;
        this.numeroSerial = numeroSerial;
        this.xptoEmpresa = xptoEmpresa;
        this.sistemaOperacional = sistemaOperacional;
        this.fabricante = fabricante;
        this.cpu = cpu;
        this.processo = processo;
        this.listaDeHd = listaDeHd;
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

    public XptoSistemaOperacional getSistemaOperacional() {
        return this.sistemaOperacional;
    }

    public void setSistemaOperacional(XptoSistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public XptoFabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(XptoFabricante fabricante) {
        this.fabricante = fabricante;
    }

    public XptoCpu getCpu() {
        return this.cpu;
    }

    public void setCpu(XptoCpu cpu) {
        this.cpu = cpu;
    }

    public XptoProcesso getProcesso() {
        return this.processo;
    }

    public void setProcesso(XptoProcesso processo) {
        this.processo = processo;
    }

    public List<XptoHd> getListaDeHd() {
        return listaDeHd;
    }

    public void setListaDeHd(List<XptoHd> listaDeHd) {
        this.listaDeHd = listaDeHd;
    }
}
