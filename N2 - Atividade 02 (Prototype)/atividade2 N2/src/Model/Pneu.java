package Model;

public class Pneu implements Cloneable{
    private String tipo;
    private int aro;

    public Pneu(String tipo, int aro) {
        this.tipo = tipo;
        this.aro = aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "tipo='" + tipo + '\'' +
                ", aro=" + aro +
                '}';
    }
}