package Exercicio02;

import java.util.List;

public class Loja {
    String nome;
    String cnpj;
    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    void listraLivros(){

    }

    void VideoGames(){

    }

    void calculaPatrimonio(){

    }
}
