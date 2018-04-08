package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Maquina")
public class Maquina implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "serial")
    private String serial;

    @ManyToOne
    @JoinColumn(name = "cliente_hostname", referencedColumnName = "hostname")
    private Cliente cliente;

    @OneToOne(mappedBy = "maquina")
    private UsuarioMaquina usuarioMaquina;

    @OneToOne(mappedBy = "maquina")
    private Processador processador;

    @OneToOne(mappedBy = "maquina")
    private SistemaOperacional sistemaOperacional;

    @OneToOne(mappedBy = "maquina")
    private Fabricante fabricante;

    @OneToOne(mappedBy = "maquina")
    private Processo processo;

    @OneToOne(mappedBy = "maquina")
    private Hd hd;

    public Maquina(){

    }

    public Maquina(int id,
                   String serial,
                   Cliente cliente,
                   UsuarioMaquina usuarioMaquina,
                   Processador processador,
                   SistemaOperacional sistemaOperacional,
                   Fabricante fabricante,
                   Processo processo,
                   Hd hd) {

        this.id = id;
        this.serial = serial;
        this.cliente = cliente;
        this.usuarioMaquina = usuarioMaquina;
        this.processador = processador;
        this.sistemaOperacional = sistemaOperacional;
        this.fabricante = fabricante;
        this.processo = processo;
        this.hd = hd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public UsuarioMaquina getUsuarioMaquina() {
        return usuarioMaquina;
    }

    public void setUsuarioMaquina(UsuarioMaquina usuarioMaquina) {
        this.usuarioMaquina = usuarioMaquina;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(SistemaOperacional sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", cliente=" + cliente +
                ", usuarioMaquina=" + usuarioMaquina +
                ", processador=" + processador +
                ", sistemaOperacional=" + sistemaOperacional +
                ", fabricante=" + fabricante +
                ", processo=" + processo +
                ", hd=" + hd +
                '}';
    }
}
