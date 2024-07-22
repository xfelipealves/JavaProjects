package director;
import model.*;
import builder.CarroBuilder;

public class CarroDirector {
    private CarroBuilder builder;

    public CarroDirector(CarroBuilder builder) { this.builder = builder; }

    public void constructCarro() {
        builder.buildTipo();
        builder.buildTransmissao();
        builder.buildBancos();
        builder.buildAcessorio();
        builder.buildSensor();
    }

    public Carro getCarro() { return builder.getCarro(); }
}
