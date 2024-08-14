package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_bioskop")
@Builder(toBuilder = true)
public class Bioskop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_bioskop" , nullable = false , length = 100 , unique = true)
    private String namaBioskop;

    @Column(name = "alamat" , nullable = false , length = 100)
    private String alamat;

    @Override
    public String toString() {
        return "Bioskop{" +
                "id=" + id +
                ", namaBioskop='" + namaBioskop + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
