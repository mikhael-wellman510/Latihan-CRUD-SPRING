package com.example.demo.Service.Impl;

import com.example.demo.DTO.Request.FilmRequest;
import com.example.demo.DTO.Response.FilmResponse;
import com.example.demo.Entity.Film;
import com.example.demo.Repositori.FilmRepositori;
import com.example.demo.Service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepositori filmRepositori;
    @Override
    public FilmResponse addFilm(FilmRequest filmRequest) {
        Film film = Film.builder()
                .durasi(filmRequest.getDurasi())
                .genreFilm(filmRequest.getGenreFilm())
                .judulFilm(filmRequest.getJudulFilm())
                .build();

        Film addFilm = filmRepositori.saveAndFlush(film);

        return FilmResponse.builder()
                .id(addFilm.getId())
                .durasi(addFilm.getDurasi())
                .judulFilm(addFilm.getJudulFilm())
                .genreFilm(addFilm.getGenreFilm())
                .build();
    }

    @Override
    public FilmResponse updateFilm(FilmRequest filmRequest) {

//        Film film = filmRepositori.findById(filmRequest.getId()).orElse(null);
//
//        film.setDurasi(film.getDurasi());
//        film.setGenreFilm(film.getGenreFilm());
//        film.setJudulFilm(film.getJudulFilm());
//
//        Film update = filmRepositori.
        Film updated = filmRepositori.updateFilm(filmRequest.getId(), filmRequest.getDurasi(), filmRequest.getGenreFilm(), filmRequest.getJudulFilm());
        System.out.println("Hasil : " + updated);
        return null;
    }
}
