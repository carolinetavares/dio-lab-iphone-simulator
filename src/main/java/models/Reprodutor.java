package main.java.models;

import java.util.ArrayList;
import java.util.List;

import main.java.interfaces.ReprodutorMusical;

public class Reprodutor implements ReprodutorMusical {

    private String musicaAtual;
    private List<String> playList;

    public Reprodutor() {
        this.playList = new ArrayList<>();
    }
    
    @Override
    public void tocar() {
        if(this.musicaAtual.isEmpty()) {
            System.out.println("Nenhuma musica na fila.");
        } else {
            System.out.println("Tocando \"" + musicaAtual + "\".");
        }
    }

    @Override
    public void pausar() {
        if(this.musicaAtual.isEmpty()) {
            System.out.println("Nenhuma musica na fila.");
        } else {
            System.out.println("Musica \"" + musicaAtual + "\" pausada.");
        }
    }

    @Override
    public void parar() {
        if(this.musicaAtual.isEmpty()) {
            System.out.println("Nenhuma musica na fila.");
        } else {
            System.out.println("Musica \"" + musicaAtual + "\" parada.");
        }
    }

    @Override
    public void setMusicaAtual(String musica) {
        this.musicaAtual = musica;
        this.playList.add(musica);
    }

    @Override
    public void exibirPlaylist() {
        if (!this.playList.isEmpty()) {
            System.out.println("Playlist: ");
            for (String musica : this.playList) {
                System.out.println(musica);
            }
    
        } else {
            System.out.println("Playlist vazia.");
        }
    }

}
