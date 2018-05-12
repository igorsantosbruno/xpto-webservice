package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "XPTOTBA01_CLIENTE")
@Entity(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "hostname")
    private String hostname;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "dominio_email")
    private String dominioEmail;

    @OneToMany(targetEntity = Maquina.class,cascade = CascadeType.ALL,mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Maquina> maquinas;

    @OneToMany(targetEntity = Analista.class,cascade = CascadeType.ALL,mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Analista> analistas;

    public Cliente(){

    }

    public Cliente(String razaoSocial,
                   String codigo,
                   String dominioEmail,
                   String hostname,
                   List<Maquina> maquinas) {

        this.razaoSocial = razaoSocial;
        this.codigo = codigo;
        this.dominioEmail = dominioEmail;
        this.hostname = hostname;
        this.maquinas = maquinas;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public List<Analista> getAnalistas() {
        return analistas;
    }

    public void setAnalistas(List<Analista> analistas) {
        this.analistas = analistas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", codigo='" + codigo + '\'' +
                ", dominioEmail='" + dominioEmail + '\'' +
                ", hostname='" + hostname + '\'' +
                '}';
    }
}
