package main.java.models;

import main.java.interfaces.AparelhoTelefonico;

public class Telefonia implements AparelhoTelefonico {

    private String ligacaoAtual;

    @Override
    public void ligar(String numero) {
        ligacaoAtual = numero;
        System.out.println("Ligando para: " + ligacaoAtual);
    }

    @Override
    public void atender(String numero) {
        ligacaoAtual = numero;
        System.out.println("Atendendo numero: " + ligacaoAtual);
    }

    @Override
    public void encerrarLigacao() {
        ligacaoAtual = null;
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
