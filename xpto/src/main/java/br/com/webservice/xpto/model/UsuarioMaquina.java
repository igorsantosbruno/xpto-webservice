package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "XPTOTBA04_USUARIOMAQUINA")
@Entity(name = "usuario_maquina")
public class UsuarioMaquina implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "maquina_serial", referencedColumnName = "serial")
    private Maquina maquina;

    public UsuarioMaquina(){

    }

    public UsuarioMaquina(int id, String email, Maquina maquina) {
        this.id = id;
        this.email = email;
        this.maquina = maquina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "UsuarioMaquina{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", maquina=" + maquina +
                '}';
    }
}
