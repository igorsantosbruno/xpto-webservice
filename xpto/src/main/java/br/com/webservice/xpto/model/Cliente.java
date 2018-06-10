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

    @Column(name = "canal")
    private String canal;

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

    public String getHostname() {

        return this.hostname;
    }

    public void setHostname(String hostname) {

        this.hostname = hostname;
    }

    public String getRazaoSocial() {

        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {

        this.razaoSocial = razaoSocial;
    }

    public String getCodigo() {

        return this.codigo;
    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;
    }

    public String getDominioEmail() {

        return this.dominioEmail;
    }

    public void setDominioEmail(String dominioEmail) {

        this.dominioEmail = dominioEmail;
    }

    public String getCanal() {

        return this.canal;
    }

    public void setCanal(String canal) {

        this.canal = canal;
    }

    public List<Maquina> getMaquinas() {

        return this.maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {

        this.maquinas = maquinas;
    }

    public List<Analista> getAnalistas() {

        return this.analistas;
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
