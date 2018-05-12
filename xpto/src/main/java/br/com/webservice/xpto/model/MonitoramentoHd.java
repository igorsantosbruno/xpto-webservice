package br.com.webservice.xpto.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "XPTOTBA08_MONITORAMENTOHD")
@Entity(name = "MonitoramentoHd")
public class MonitoramentoHd implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "percentual_utilizado")
    private double percentualUtilizado;

    @Column(name = "caminho_absoluto")
    private String caminhoAbsoluto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "monitoramento_id", referencedColumnName = "id")
    private Monitoramento monitoramento;

    public MonitoramentoHd(){

    }

    public MonitoramentoHd(int id,
                           double percentualUtilizado,
                           String caminhoAbsoluto,
                           Monitoramento monitoramento) {

        this.id = id;
        this.percentualUtilizado = percentualUtilizado;
        this.caminhoAbsoluto = caminhoAbsoluto;
        this.monitoramento = monitoramento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPercentualUtilizado() {
        return percentualUtilizado;
    }

    public void setPercentualUtilizado(double percentualUtilizado) {
        this.percentualUtilizado = percentualUtilizado;
    }

    public String getCaminhoAbsoluto() {
        return caminhoAbsoluto;
    }

    public void setCaminhoAbsoluto(String caminhoAbsoluto) {
        this.caminhoAbsoluto = caminhoAbsoluto;
    }

    public Monitoramento getMonitoramento() {
        return monitoramento;
    }

    public void setMonitoramento(Monitoramento monitoramento) {
        this.monitoramento = monitoramento;
    }

    @Override
    public String toString() {
        return "MonitoramentoHd{" +
                "id=" + id +
                ", percentualUtilizado=" + percentualUtilizado +
                ", caminhoAbsoluto='" + caminhoAbsoluto + '\'' +
                ", monitoramento=" + monitoramento +
                '}';
    }
}
