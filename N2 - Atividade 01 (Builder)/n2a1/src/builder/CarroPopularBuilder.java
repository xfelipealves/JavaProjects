package builder;

public class CarroPopularBuilder extends CarroBuilder{
    @Override
    public void buildTipo() {
        carro.setTipo("Popular");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Manual");
    }

    @Override
    public void buildBancos() {
        carro.setBancos("Tecido");
    }

    @Override
    public void buildAcessorio() {
        carro.setAcessorio(null);
    }

    @Override
    public void buildSensor() {
        carro.setSensor(null);
    }
}
