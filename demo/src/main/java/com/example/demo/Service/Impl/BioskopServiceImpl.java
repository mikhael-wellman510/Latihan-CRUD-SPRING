package com.example.demo.Service.Impl;

import com.example.demo.DTO.Request.BioskopRequest;
import com.example.demo.DTO.Response.BioskopResponse;
import com.example.demo.Entity.Bioskop;
import com.example.demo.Repositori.BioskopRepositori;
import com.example.demo.Service.BioskopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BioskopServiceImpl implements BioskopService {

    private final BioskopRepositori bioskopRepositori;

    @Override
    public BioskopResponse addBioskop(BioskopRequest bioskopRequest) {

        Bioskop bioskop = Bioskop.builder()
                .namaBioskop(bioskopRequest.getNamaBioskop())
                .alamat(bioskopRequest.getAlamat())
                .build();

        Bioskop saveBioskop = bioskopRepositori.saveAndFlush(bioskop);

       return BioskopResponse.builder()
                .id(saveBioskop.getId())
                .namaBioskop(saveBioskop.getNamaBioskop())
                .alamat(saveBioskop.getAlamat())
                .build();

    }

    @Override
    public BioskopResponse editBioskop(BioskopRequest bioskopRequest) {

        Bioskop bioskop = bioskopRepositori.findById(bioskopRequest.getId()).orElse(null);
        bioskop.setNamaBioskop(bioskopRequest.getNamaBioskop());
        bioskop.setAlamat(bioskopRequest.getAlamat());

        Bioskop updateBioskop = bioskopRepositori.saveAndFlush(bioskop);

        return BioskopResponse.builder()
                .id(updateBioskop.getId())
                .namaBioskop(updateBioskop.getNamaBioskop())
                .alamat(updateBioskop.getAlamat())
                .build();
    }
}
