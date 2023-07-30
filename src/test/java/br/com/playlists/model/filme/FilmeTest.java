package br.com.playlists.model.filme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.UUID;

public class FilmeTest {
    
    private Filme montarFilme(){
        return  new Filme("Operação Cúpido",1998,128);
    }

    private Filme montarFilmeSemConstrutor(){
        return  new Filme();
    }

    @Test
    public void sucesso_construtor_vazio(){
        Filme filme = montarFilmeSemConstrutor();
        Assertions.assertNotNull(filme);
    }

    @Test
    public void sucesso_construtor(){
        Filme filme = montarFilme();
        Assertions.assertEquals(filme.getNome(),"Operação Cúpido");
        Assertions.assertEquals(filme.getAno(),1998);
        Assertions.assertEquals(filme.getDuracao(),128);
    }


    @Test
    public void sucesso_set_nome(){
        Filme filme = montarFilme();
        filme.setNome("Operação Cúpido: 2");
        Assertions.assertEquals(filme.getNome(),"Operação Cúpido: 2");
    }

    @Test
    public void sucesso_set_ano(){
        Filme filme = montarFilme();
        filme.setAno(2010);
        Assertions.assertEquals(filme.getAno(),2010);
    }

    @Test
    public void sucesso_set_duracao(){
        Filme filme = montarFilme();
        filme.setDuracao(110);
        Assertions.assertEquals(filme.getDuracao(),110);
    }

    @Test
    public void sucesso_set_id(){
        Filme filme = montarFilme();
        filme.setId(1L);
        Assertions.assertEquals(filme.getId(),1L);
    }
}
