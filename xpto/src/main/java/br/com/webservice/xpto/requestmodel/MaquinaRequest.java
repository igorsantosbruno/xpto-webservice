package br.com.webservice.xpto.requestmodel;

public class MaquinaRequest {

    private String serial;
    private String clienteHostname;

    public MaquinaRequest() {

        this.serial = "";
        this.clienteHostname = "";
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getClienteHostname() {
        return clienteHostname;
    }

    public void setClienteHostname(String clienteHostname) {
        this.clienteHostname = clienteHostname;
    }

    @Override
    public String toString() {
        return "Maquina [serial=" + serial + ", clienteHostname=" + clienteHostname + "]";
    }

}
