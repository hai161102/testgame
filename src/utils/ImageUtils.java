/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author vipvl
 */
public class ImageUtils {
    
    
    public static Image getBitmap(Object object) throws Exception {
        Image image = null;
        
        if (object instanceof File file) {
            image = ImageIO.read(file);
        }
        else if (object instanceof InputStream inputStream) {
            image = ImageIO.read(inputStream);
        }
        else if (object instanceof URL url) {
            image = ImageIO.read(url);
        }
        else if (object instanceof ImageInputStream imageInputStream) {
            image = ImageIO.read(imageInputStream);
        }
        return image;
    }
    
    @SuppressWarnings("null")
    public static Image getBitmap(String path) {
        Image image = null;
        try {
            File file = new File(path);
            //InputStream inputStream = new FileInputStream(path);
            //ImageInputStream imageInputStream = new FileImageInputStream(file);
            //URL url = new URL(path);
            if (file.exists()) {
                image = ImageIO.read(file);
            }
            //else if (inputStream != null) {
            //    image = ImageIO.read(inputStream);
            //}
            //else if (url != null) {
            //    image = ImageIO.read(url);
            //}
            //else if (imageInputStream != null) {
            //    image = ImageIO.read(imageInputStream);
            //}
        } catch (Exception e) {
        }
        
        
        return image;
    }
}
