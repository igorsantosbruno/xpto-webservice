package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "cliente")
public class Cliente implements Serializable {

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

    @OneToMany(targetEntity = Maquina.class,fetch=FetchType.EAGER,mappedBy = "cliente")
    private List<Maquina> listaDeMaquina;

    public Cliente(){

    }

    public Cliente(int id,
                   String razaoSocial,
                   String cnpj,
                   String dominioEmail,
                   String hostname,
                   List<Maquina> listaDeMaquina) {

        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dominioEmail = dominioEmail;
        this.hostname = hostname;
        this.listaDeMaquina = listaDeMaquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDominioEmail() {
        return dominioEmail;
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

    public List<Maquina> getListaDeMaquina() {
        return listaDeMaquina;
    }

    public void setListaDeMaquina(List<Maquina> listaDeMaquina) {
        this.listaDeMaquina = listaDeMaquina;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dominioEmail='" + dominioEmail + '\'' +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
