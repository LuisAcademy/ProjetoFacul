package Serviços;

import Entidades.Frequencia;
import Repositorios.RepositorioFrequencia;

import java.util.List;

public class ServicoFrequencia {
    private final RepositorioFrequencia repositorio;

    public ServicoFrequencia(RepositorioFrequencia repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(Frequencia frequencia) {
        if (frequencia != null) {
            repositorio.adicionarFrequencia(frequencia);
        } else {
            System.out.println("Não é possível adicionar uma frequência nula.");
        }
    }

    public List<Frequencia> listar() {
        return repositorio.listarFrequencias();
    }

    
}