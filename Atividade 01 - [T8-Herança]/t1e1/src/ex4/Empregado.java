package ex4;

public class Empregado extends Pessoa{
    private double salario;
    private String matricula;
    protected double valorINSS()
    {
        return salario - salario * 0.05;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public Empregado(String nome, int idade, double salario, String matricula) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
    }

    public Empregado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public String imprime() {
        String s = super.imprime() + ' ' + Double.toString(salario) + ' ' + matricula;
        return s;
    }
}
