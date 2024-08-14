package com.example.demo.Service;

import com.example.demo.DTO.Request.FilmRequest;
import com.example.demo.DTO.Response.FilmResponse;

public interface FilmService {

    FilmResponse addFilm(FilmRequest filmRequest);
    FilmResponse updateFilm(FilmRequest filmRequest);
}
