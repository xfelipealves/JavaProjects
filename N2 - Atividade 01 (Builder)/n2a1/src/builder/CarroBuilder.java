package builder;

import model.Carro;

public abstract class CarroBuilder {
    protected Carro carro;

    public CarroBuilder() { carro = new Carro(); }
    public Carro getCarro() { return carro; }

    public abstract void buildTipo();

    public abstract void buildTransmissao();

    public abstract void buildBancos();

    public abstract void buildAcessorio();

    public abstract void buildSensor();
}
