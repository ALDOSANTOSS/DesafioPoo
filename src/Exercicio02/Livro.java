package Exercicio02;

public  class Livro {

    String autor;
    String tema;

    public Livro() {
    }

    public Livro(String autor, String tema) {
        this.autor = autor;
        this.tema = tema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
