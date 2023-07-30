package br.com.playlists.model.filme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmeDTOResponseTest {

    private Filme montarFilme(){
       Filme filme =  new Filme("Operação Cúpido",1998,128);
       filme.setId(1L);
       return filme;
    }

    @Test
    public void converte_filme_para_filmeDTOResponse(){
        Filme filme = montarFilme();
        FilmeDTOResponse filmeDTOResponse = FilmeDTOResponse.converter(filme);
        Assertions.assertNotNull(filmeDTOResponse);
        Assertions.assertEquals(filmeDTOResponse.getId(),1L);
        Assertions.assertEquals(filmeDTOResponse.getAno(),1998);
        Assertions.assertEquals(filmeDTOResponse.getDuracao(),128);
        Assertions.assertEquals(filmeDTOResponse.getNome(),"Operação Cúpido");
    }

}
