package com.example.demo.DTO.Request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class BioskopRequest {

    private Long id;
    private String namaBioskop;
    private String alamat;
}
