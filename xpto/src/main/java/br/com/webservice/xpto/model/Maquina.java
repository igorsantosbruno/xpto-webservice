package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "Maquina")
public class Maquina implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "serial")
    private String serial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_hostname", referencedColumnName = "hostname")
    private Cliente cliente;

    @OneToMany(targetEntity = Hardware.class, mappedBy = "maquina", fetch = FetchType.LAZY)
    private List<Hardware> hardwares;

    @OneToMany(targetEntity = UsuarioMaquina.class, mappedBy = "maquina", fetch = FetchType.LAZY)
    private List<UsuarioMaquina> usuariosMaquina;

    @OneToMany(targetEntity = Monitoramento.class,cascade = CascadeType.ALL,mappedBy = "maquina", fetch = FetchType.LAZY)
    private List<Monitoramento> monitoramentos;

    @OneToMany(targetEntity = Hd.class,cascade = CascadeType.ALL,mappedBy = "maquina", fetch = FetchType.LAZY)
    private List<Hd> hds;

    public Maquina(){

    }

    public Maquina(String serial, Cliente cliente) {

        this.serial = serial;
        this.cliente = cliente;
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

    public List<Hardware> getHardware() {
        return hardwares;
    }

    public void setHardware(List<Hardware> hardwares) {
        this.hardwares = hardwares;
    }

    public List<UsuarioMaquina> getUsuariosMaquina() {
        return usuariosMaquina;
    }

    public void setUsuariosMaquina(List<UsuarioMaquina> usuariosMaquina) {
        this.usuariosMaquina = usuariosMaquina;
    }

    public List<Monitoramento> getMonitoramentos() {
        return monitoramentos;
    }

    public void setMonitoramentos(List<Monitoramento> monitoramentos) {
        this.monitoramentos = monitoramentos;
    }

    public List<Hd> getHds() {
        return hds;
    }

    public void setHds(List<Hd> hds) {
        this.hds = hds;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
