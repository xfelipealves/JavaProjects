package model;

public class Carro {
    private String tipo;

    private String transmissao;

    private String bancos;

    private String acessorio;

    private String sensor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getBancos() {
        return bancos;
    }

    public void setBancos(String bancos) {
        this.bancos = bancos;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo +
                "\nTransmissão: " + transmissao +
                "\nBancos: " + bancos +
                "\nAcessório: " + acessorio +
                "\nSensor: " + sensor ;
    }
}
