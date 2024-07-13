package main.java.models;

import java.util.ArrayList;
import java.util.List;

import main.java.interfaces.NavegadorInternet;

public class Navegador implements NavegadorInternet {

    private String paginaAtual;
    private List<String> historico;

    public Navegador() {
        this.historico = new ArrayList<>();
    }

    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        historico.add(paginaAtual);
        System.out.println("Navegando para: " + paginaAtual);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void mostrarHistorico() {
        if (!this.historico.isEmpty()) {
            System.out.println("Historico de navegacao: ");
            for (String pagina : historico) {
                System.out.println(pagina);
            }
        } else {
            System.out.println("Historico de navegacao vazio.");
        }
    }
    
}
