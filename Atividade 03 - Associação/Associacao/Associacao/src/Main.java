import Ex1.*;
import Ex2.*;
import Ex3.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //EX1------------------------------------------------------------------------
        Curso curso1 = new Curso("Java", "30");
        Instrutor instrutor1 = new Instrutor("Felipe");

        Curso curso2 = new Curso("Android", "20");
        Instrutor instrutor2 = new Instrutor("Ivan");

        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", "1001"));
        alunos.add(new Aluno("Jose", "1002"));
        alunos.add(new Aluno("Nelson", "1003"));
        alunos.add(new Aluno("Jaqueline", "1004"));
        alunos.add(new Aluno("Thais", "1005"));
        alunos.add(new Aluno("Jhon", "1006"));

        ArrayList<Aluno> alunosCurso1 = new ArrayList<>();
        ArrayList<Aluno> alunosCurso2 = new ArrayList<>();

        //Associa alunos aos cursos
        alunosCurso1.add(alunos.get(0));
        alunosCurso1.add(alunos.get(1));
        alunosCurso1.add(alunos.get(2));
        alunosCurso1.add(alunos.get(3));

        alunosCurso2.add(alunos.get(0));
        alunosCurso2.add(alunos.get(1));
        alunosCurso2.add(alunos.get(4));
        alunosCurso2.add(alunos.get(5));

        System.out.println("Nome do Curso: " + curso1.getNomeCurso());
        System.out.println("Nome do Instrutor: " + instrutor1.getNomeInstrutor());
        System.out.println("Nome dos Alunos: \n");
        for (Aluno aluno: alunosCurso1) {
            System.out.println(aluno.getNomeAluno() + " " + aluno.getMatricula());
        }

        System.out.println("\nNome do Curso: " + curso2.getNomeCurso());
        System.out.println("Nome do Instrutor: " + instrutor2.getNomeInstrutor());
        System.out.println("Nome dos Alunos: \n");
        for (Aluno aluno: alunosCurso2) {
            System.out.println(aluno.getNomeAluno() + " " + aluno.getMatricula());
        }

        System.out.printf("\nAlunos que fazem os dois Cursos: \n");
        for (Aluno aluno: alunos) {
            if (alunosCurso1.contains(aluno))
                System.out.println(aluno.getNomeAluno() + " " + aluno.getMatricula());
        }

        //EX2------------------------------------------------------------------------
        Hospital hospital = new Hospital("Albert Einsten");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.printf("\nDigite o nome do paciente " + (i+1) + ": ");
            String nome = scanner.nextLine();
            System.out.printf("\nDigite o nome da doenca do paciente " + (i+1) + ": ");
            String doenca = scanner.nextLine();
            hospital.addPacientes(new Paciente(nome, doenca));
        }
        for (Paciente paciente: hospital.getPacientes()) {
            System.out.println("\nNome Paciente: " + paciente.getNome());
            System.out.println("Doenca Paciente: " + paciente.getDoenca());
        }

        //EX3------------------------------------------------------------------------
        ArrayList<Aluno3> alunosEx3 = new ArrayList<Aluno3>();
        for (int i=0; i<4; i++) {
            System.out.printf("\n Digite o nome do Aluno " + (i+1) + ": ");
            String nome = scanner.nextLine();

            ArrayList<Materia> materias = new ArrayList<Materia>();
            for (int j=0; j<3; j++) {
                System.out.printf("\n Digite o nome da " + (j+1) + " Materia: ");
                String nomeMateria = scanner.nextLine();
                materias.add(new Materia(nomeMateria));
            }
            alunosEx3.add(new Aluno3(nome, materias));
        }

        for (Aluno3 aluno3: alunosEx3) {
            System.out.printf("\nNome do Aluno: " + aluno3.getNome());
            ArrayList<Materia> materias = aluno3.getMaterias();
            for (Materia materia: materias) {
                System.out.printf(" Nome da Materia: " + materia.getNome());
            }
        }
    }
}