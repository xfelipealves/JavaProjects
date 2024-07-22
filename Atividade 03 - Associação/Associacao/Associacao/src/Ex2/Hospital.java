package Ex2;

import java.util.ArrayList;

public class Hospital {
    private String nome;
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        pacientes = new ArrayList<Paciente>();
    }

    public Hospital(String nome) {
        pacientes = new ArrayList<Paciente>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPacientes(Paciente paciente) {
        pacientes.add(paciente);
    }
}
