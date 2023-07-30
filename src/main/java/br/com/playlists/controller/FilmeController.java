package br.com.playlists.controller;

import br.com.playlists.model.filme.Filme;
import br.com.playlists.model.filme.FilmeDTORequest;
import br.com.playlists.model.filme.FilmeDTOResponse;
import br.com.playlists.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody FilmeDTORequest filmeDTORequest){
        Filme filme = filmeDTORequest.converter();
        filmeRepository.save(filme);
        return ResponseEntity.ok().body(FilmeDTOResponse.converter(filme));
    }
}
