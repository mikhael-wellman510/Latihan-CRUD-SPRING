package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "m_tiket")
@Builder(toBuilder = true)
public class Tiket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bioskop_id")
    private Bioskop bioskop;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Override
    public String toString() {
        return "Tiket{" +
                "id=" + id +
                ", bioskop=" + bioskop +
                ", film=" + film +
                '}';
    }
}
