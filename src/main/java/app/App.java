package main.java.app;

import main.java.models.iPhone;

public class App {
    public static void main(String[] args) throws Exception {

        iPhone iPhone1 = new iPhone();

        iPhone1.getNavegador().mostrarHistorico();
        iPhone1.getNavegador().exibirPagina("https://www.google.com.br/");
        iPhone1.getNavegador().adicionarNovaAba();
        iPhone1.getNavegador().exibirPagina("https://web.dio.me/track/coding-future-gft-desenvolvimento-java-com-ia");
        iPhone1.getNavegador().atualizarPagina();
        iPhone1.getNavegador().mostrarHistorico();

        iPhone1.getTelefonia().ligar("4002-8922");
        iPhone1.getTelefonia().encerrarLigacao();
        iPhone1.getTelefonia().atender("1234-5678");
        iPhone1.getTelefonia().encerrarLigacao();
        iPhone1.getTelefonia().iniciarCorreioVoz();

        iPhone1.getReprodutor().exibirPlaylist();
        iPhone1.getReprodutor().setMusicaAtual("Vogue");
        iPhone1.getReprodutor().tocar();
        iPhone1.getReprodutor().pausar();
        iPhone1.getReprodutor().parar();
        iPhone1.getReprodutor().exibirPlaylist();
        
    }
}
