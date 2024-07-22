package builder;

public class CarroImportadoBuilder extends CarroBuilder{
    @Override
    public void buildTipo() {
        carro.setTipo("Importado");
    }

    @Override
    public void buildTransmissao() {
        carro.setTransmissao("Automatica");
    }

    @Override
    public void buildBancos() {
        carro.setBancos("Couro");
    }

    @Override
    public void buildAcessorio() {
        carro.setAcessorio("Insulfilm e Friso Lateral");
    }

    @Override
    public void buildSensor() {
        carro.setSensor("Estacionamento");
    }
}
