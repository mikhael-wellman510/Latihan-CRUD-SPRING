package com.example.demo.DTO.Request;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class FilmRequest {

    private Long id;
    private String judulFilm;
    private Integer durasi;
    private String genreFilm;

}
