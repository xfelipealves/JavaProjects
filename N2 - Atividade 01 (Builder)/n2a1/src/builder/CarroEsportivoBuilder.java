package builder;

public class CarroEsportivoBuilder extends CarroBuilder {
    @Override
    public void buildTipo() {
        carro.setTipo("Esportivo");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Paddle Shift");
    }

    @Override
    public void buildBancos() {
        carro.setBancos("Couro");
    }

    @Override
    public void buildAcessorio() {
        carro.setAcessorio("Aerofolio");
    }

    @Override
    public void buildSensor() {
        carro.setSensor(null);
    }
}
