package com.soham.maven.spring.spring_simple_rest_service_application.controller;

import com.google.zxing.WriterException;
import com.soham.maven.spring.spring_simple_rest_service_application.service.QRCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@CrossOrigin(origins ={"*"})
@RequestMapping("qr-code")

@RequiredArgsConstructor
public class QrCodeController {
    private final QRCodeService qrCodeService;

    @GetMapping(path="/generate",produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> generateQRCode(@RequestParam("q") String text, @RequestParam(name="s", required = false, defaultValue = "200") int size) throws WriterException, IOException {
        BufferedImage qrCodeImage = qrCodeService.generateQRCode(text,size,size);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(qrCodeImage, "png", outputStream);
        return ResponseEntity.ok( outputStream.toByteArray());

    }
}
