package com.example.demo.Repositori;

import com.example.demo.Entity.Bioskop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BioskopRepositori extends JpaRepository<Bioskop, Long> {
}
