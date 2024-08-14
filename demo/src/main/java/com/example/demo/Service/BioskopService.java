package com.example.demo.Service;

import com.example.demo.DTO.Request.BioskopRequest;
import com.example.demo.DTO.Response.BioskopResponse;

public interface BioskopService {

    BioskopResponse addBioskop(BioskopRequest bioskopRequest);
    BioskopResponse editBioskop(BioskopRequest bioskopRequest);
}
