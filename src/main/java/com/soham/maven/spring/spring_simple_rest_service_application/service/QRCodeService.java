package com.soham.maven.spring.spring_simple_rest_service_application.service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

@Service
public class QRCodeService {

    public BufferedImage generateQRCode(String text, int width, int height) throws WriterException {
        var qrCodeWritter=new QRCodeWriter();
        BitMatrix encode = qrCodeWritter.encode(text, BarcodeFormat.QR_CODE, width, height);
        return MatrixToImageWriter.toBufferedImage(encode);
    }
}
