package ex1;

public class Tecnico extends Assistente{
    private double bonus;

    protected double getBonus() {
        return bonus;
    }

    protected void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String imprimir()
    {
        return new String(getNome() + " "
                + getCpf() + " " + getMatricula()
                + " " + getBonus());
    }

    public void setaMatricula(int matricula)
    {
        setMatricula(matricula);
    }

    public void setaNome(String nome)
    {
        setNome(nome);
    }

    public void setaCpf(String cpf)
    {
        setCpf(cpf);
    }

    public void setaBonus(double bonus)
    {
        setBonus(bonus);
    }
}
