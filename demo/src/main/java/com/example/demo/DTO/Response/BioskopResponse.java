package com.example.demo.DTO.Response;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class BioskopResponse {

    private Long id;
    private String namaBioskop;
    private String alamat;

    @Override
    public String toString() {
        return "BioskopResponse{" +
                "id=" + id +
                ", namaBioskop='" + namaBioskop + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
