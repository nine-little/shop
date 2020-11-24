package io.renren.common.utils;

import com.spire.pdf.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PDFtoimage {
    public static void main(String[] args) throws IOException {

        PdfDocument pdf = new PdfDocument("D:\\1.pdf");
        BufferedImage image;
        for (int i = 0; i < pdf.getPages().getCount(); i++) {
            image = pdf.saveAsImage(i);
            File file = new File(String.format("ToImage-img-%d.png", i));
            ImageIO.write(image, "PNG", file);
        }
        pdf.close();
    }
}