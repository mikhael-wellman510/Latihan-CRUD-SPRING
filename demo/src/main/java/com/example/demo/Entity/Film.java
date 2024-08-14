package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_film")
@Builder(toBuilder = true)
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "judul_film" , nullable = false, length = 100 , unique = true)
    private String judulFilm;

    @Column(name = "durasi" , nullable = false, length = 100)
    private Integer durasi;

    @Column(name = "genre_film" , nullable = false , length = 100)
    private String genreFilm;

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", judulFilm='" + judulFilm + '\'' +
                ", durasi=" + durasi +
                ", genreFilm='" + genreFilm + '\'' +
                '}';
    }
}
