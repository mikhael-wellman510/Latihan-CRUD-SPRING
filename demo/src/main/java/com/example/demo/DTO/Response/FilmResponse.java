package com.example.demo.DTO.Response;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class FilmResponse {
    private Long id;
    private String judulFilm;
    private Integer durasi;
    private String genreFilm;

    @Override
    public String toString() {
        return "FilmResponse{" +
                "id=" + id +
                ", judulFilm='" + judulFilm + '\'' +
                ", durasi=" + durasi +
                ", genreFilm='" + genreFilm + '\'' +
                '}';
    }
}
