package com.example.demo.Controller;

import com.example.demo.Constant.AppPath;
import com.example.demo.DTO.Request.BioskopRequest;
import com.example.demo.DTO.Response.BioskopResponse;
import com.example.demo.DTO.Response.CommonResponse;
import com.example.demo.Service.BioskopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.BIOSKOP)
public class BioskopController {

    private final BioskopService bioskopService;

    @PostMapping("/addBioskop")
    ResponseEntity<?> addBioskop(@RequestBody BioskopRequest bioskopRequest){

        BioskopResponse bioskopResponse = bioskopService.addBioskop(bioskopRequest);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CommonResponse.<BioskopResponse>builder()
                        .statusCode(HttpStatus.CREATED.value())
                        .message("Succes Created")
                        .data(bioskopResponse)
                        .build()
                );

    }

    @PutMapping("/editBioskop")
    ResponseEntity<?> editBioskop(@RequestBody BioskopRequest bioskopRequest){

        BioskopResponse bioskopResponse = bioskopService.editBioskop(bioskopRequest);

        return ResponseEntity.status(HttpStatus.OK)
                .body(CommonResponse.<BioskopResponse>builder()
                        .statusCode(HttpStatus.OK.value())
                        .message("Edit Succes")
                        .data(bioskopResponse)
                        .build()
                );
    }


}
