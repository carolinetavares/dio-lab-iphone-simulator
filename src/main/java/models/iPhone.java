package main.java.models;


public class iPhone {

    private Navegador navegador;
    private Reprodutor reprodutor;
    private Telefonia telefonia;

    public iPhone() {
        this.navegador = new Navegador();
        this.telefonia = new Telefonia();
        this.reprodutor = new Reprodutor();
    }

    public Navegador getNavegador() {
        return navegador;
    }

    public Reprodutor getReprodutor(){
        return reprodutor;
    }

    public Telefonia getTelefonia() {
        return telefonia;
    }

}
