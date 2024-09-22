package Serviços;

import Repositorios.RepositorioProfessor;

import java.util.List;

import Entidades.Professor;

public class ProfessorServico {
    private RepositorioProfessor repositorio;

    public ProfessorServico(RepositorioProfessor repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(String nome, String disciplina, int salario) {
        int id = gerarId(); // Método para obter o próximo ID
        repositorio.adicionar(new Professor(id, nome, disciplina, salario));
    }

    public List<Professor> listar() {
        return repositorio.listar();
    }

    public void atualizar(int id, Professor novoProfessor) { 
        repositorio.atualizar(id, novoProfessor);
    }

    public boolean remover(int id) { 
        return repositorio.remover(id);
    }
    
    private int gerarId() {
        // Lógica para gerar um novo ID único. Por exemplo:
        return repositorio.listar().size() + 1; // Simplesmente incrementa baseado no tamanho da lista
    }
}