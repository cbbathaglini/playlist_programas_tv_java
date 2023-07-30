package br.com.playlists.model.filme;

public class FilmeDTORequest {
    private String nome;
    private int ano;
    private int duracao;

    public FilmeDTORequest(String nome, int ano, int duracao){
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
    }
    public Filme converter(){
        return new Filme(this.nome, this.ano, this.duracao);
    }
}
