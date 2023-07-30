package br.com.playlists.model.filme;

public class FilmeDTOResponse {

    private long id;
    private String nome;
    private int ano;
    private int duracao;

    public FilmeDTOResponse(long id, String nome, int ano, int duracao){
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
    }

    public static FilmeDTOResponse converter(Filme filme){
        return new FilmeDTOResponse(
                filme.getId(),
                filme.getNome(),
                filme.getAno(),
                filme.getDuracao()
        );
    }

    public long getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public int getAno(){
        return this.ano;
    }
    public int getDuracao(){
        return this.duracao;
    }

}
