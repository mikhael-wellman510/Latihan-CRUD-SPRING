package com.example.demo.Controller;

import com.example.demo.Constant.AppPath;
import com.example.demo.DTO.Request.FilmRequest;
import com.example.demo.DTO.Response.CommonResponse;
import com.example.demo.DTO.Response.FilmResponse;
import com.example.demo.Service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.FILM)
public class FilmController {

    private final FilmService filmService;

    @PostMapping("/addFilm")
    ResponseEntity<?> addFilm(@RequestBody FilmRequest filmRequest){
        FilmResponse filmResponse = filmService.addFilm(filmRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<FilmResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Succes Created")
                        .data(filmResponse)
                        .build()
                );
    }

    @PutMapping("/updateFilm")
    ResponseEntity<?> updateFilm(@RequestBody FilmRequest filmRequest){
        FilmResponse filmResponse = filmService.updateFilm(filmRequest);

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<FilmResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Succes Updated")
                        .data(filmResponse)
                        .build()
                );
    }
}
