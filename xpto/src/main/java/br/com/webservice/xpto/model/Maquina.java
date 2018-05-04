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

    @ManyToOne
    @JoinColumn(name = "cliente_hostname", referencedColumnName = "hostname")
    private Cliente cliente;

    @OneToOne(targetEntity = Hardware.class, mappedBy = "maquina")
    private Hardware hardware;

    @OneToMany(targetEntity = Monitoramento.class,cascade = CascadeType.ALL,mappedBy = "maquina")
    private List<Monitoramento> monitoramentos;

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

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public List<Monitoramento> getMonitoramentos() {
        return monitoramentos;
    }

    public void setMonitoramentos(List<Monitoramento> monitoramentos) {
        this.monitoramentos = monitoramentos;
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
