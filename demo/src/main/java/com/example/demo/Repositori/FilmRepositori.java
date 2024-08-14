package com.example.demo.Repositori;

import com.example.demo.DTO.Request.FilmRequest;
import com.example.demo.Entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepositori extends JpaRepository<Film,Long> {

//    @Query(value = "insert into m_film(durasi,genre_film,judul_film) values(:filmRequest.getDurasi , :filmRequest.getGenreFilm , :filmRequest.getJudulFilm)" , nativeQuery = true)
//    Film addFilms(@Param("filmRequest")FilmRequest filmRequest);

        @Query(value = "update m_film set durasi = :durasi , genre_film = :genre , judul_film = :judul , where id = :id" , nativeQuery = true)
        Film updateFilm(@Param("id")Long id , @Param("durasi")Integer durasiFilm , @Param("genre") String genreFilm, @Param("judul")String judul);

}
