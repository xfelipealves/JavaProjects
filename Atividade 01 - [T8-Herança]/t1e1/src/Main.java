import ex1.Administrativo;
import ex1.Assistente;
import ex1.Funcionario;
import ex1.Tecnico;
import ex2.CamaroteInferior;
import ex2.CamaroteSuperior;
import ex3.Animal;
import ex3.Cachorro;
import ex3.Peixe;
import ex4.Empregado;
import ex4.Cliente;
import ex4.Vendedor;
import ex4.Pessoa;
import ex4.Gerente;

public class Main {
    public static void main(String[] args) {
        //Ex1 ---------------------------------------

        /* Resposta da Letra C -> Para resolver o problema, mudei os modificadores dos metodos GET/SET de Funcionario
                    e Assistente para PROTECTED */

        Tecnico tec = new Tecnico();
        Administrativo adm = new Administrativo();

        /* Resposta da Letra D -> Para resolver o problema, criei novos metodos SET para as classes Administrativo
                    e Tecnico, onde eles tem a unica funçao de chamar o metodo Set das classes herdadas */

        tec.setaNome("Pedro");
        tec.setaCpf("00000000000");
        tec.setaMatricula(123456);
        tec.setaBonus(200);

        adm.setaNome("Jonas");
        adm.setaCpf("00000000001");
        adm.setaMatricula(123458);
        adm.setaBonus(500);

        System.out.println(tec.imprimir());
        System.out.println(adm.imprimir());

        /* Resposta da Letra F -> Eh possivel criar objetos dessas classes, porem nao conseguimos utilizar
                nenhum metodo por serem do tipo Protected, e tambem por nao ter construtores implementados */

        Assistente as = new Assistente();
        Funcionario f = new Funcionario();

        //Ex2 ---------------------------------------
        CamaroteInferior ci = new CamaroteInferior("terreo", 200);
        CamaroteSuperior cs = new CamaroteSuperior("entrada", 200, 50);

        System.out.println(ci.imprime());
        System.out.println(cs.imprime());

        //Ex3 ---------------------------------------
        Animal peixe = new Peixe("Neon", 0.2, "ornamental");
        Animal cachorro = new Cachorro("Rex", 30, "Boxer");
        Animal animal = new Animal("Gato", 10);

        System.out.println(peixe.imprime());
        System.out.println(cachorro.imprime());
        System.out.println(animal.imprime());

        //Ex4 ---------------------------------------
        Pessoa pes = new Pessoa("Joao", 33, "Masculino");
        Empregado emp = new Empregado("Ana", 21, "Feminino", 5000.00, "1400");
        Cliente cli = new Cliente("Almir", 40, "Masculino", 2000.00, 1976);
        Gerente ger = new Gerente("Tania", 30, 15000.00, "1300", "Atendimento");
        Vendedor ven = new Vendedor("Igor", 7000.00, 140000.00, 120);

        System.out.println(pes.imprime());
        System.out.println(emp.imprime());
        System.out.println(cli.imprime());
        System.out.println(ger.imprime());
        System.out.println(ven.imprime());
    }
}