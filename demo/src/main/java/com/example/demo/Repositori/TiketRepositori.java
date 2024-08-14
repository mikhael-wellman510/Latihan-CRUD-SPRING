package com.example.demo.Repositori;

import com.example.demo.Entity.Tiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TiketRepositori extends JpaRepository<Tiket,Long> {



}
