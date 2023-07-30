package br.com.playlists.model.filme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmeDTORequestTest {

    private FilmeDTORequest montarFilmeDTORequest(){
        return new FilmeDTORequest("Operação Cúpido",1998,128);
    }

    @Test
    public void converte_filme_para_filmeDTORequest(){
        FilmeDTORequest filmeDTORequest = montarFilmeDTORequest();
        Filme filme = filmeDTORequest.converter();
        Assertions.assertNotNull(filme);
        Assertions.assertEquals(filme.getAno(),1998);
        Assertions.assertEquals(filme.getDuracao(),128);
        Assertions.assertEquals(filme.getNome(),"Operação Cúpido");
    }
}
