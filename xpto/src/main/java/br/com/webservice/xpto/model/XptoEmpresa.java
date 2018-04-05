package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "xpto_empresa")
public class XptoEmpresa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "dominio_email")
    private String dominioEmail;

    @Column(name = "hostname")
    private String hostname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "xptoEmpresa")
    private List<XptoMaquina> listaDeMaquina;

    public XptoEmpresa(){

        this.id = 0;
        this.razaoSocial = "";
        this.cnpj = "";
        this.dominioEmail = "";
        this.hostname = "";
    }

    public XptoEmpresa(String razaoSocial, String cnpj, String dominioEmail, String hostname) {

        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dominioEmail = dominioEmail;
        this.hostname = hostname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDominioEmail() {
        return this.dominioEmail;
    }

    public void setDominioEmail(String dominioEmail) {
        this.dominioEmail = dominioEmail;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public List<XptoMaquina> getListaDeMaquina() {
        return this.listaDeMaquina;
    }

    public void setListaDeMaquina(List<XptoMaquina> listaDeMaquina) {
        this.listaDeMaquina = listaDeMaquina;
    }

    @Override
    public String toString() {
        return "XptoEmpresa{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dominioEmail='" + dominioEmail + '\'' +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
