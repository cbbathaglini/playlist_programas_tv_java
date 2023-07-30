package br.com.playlists.model.filme;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int ano;

    private int duracao;

    public Filme() {

    }
    public Filme(String nome, int ano, int duracao){
        this.nome = nome;
        this.duracao = duracao;
        this.ano = ano;
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

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
