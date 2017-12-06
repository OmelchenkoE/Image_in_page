package newpackage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author qwerty
 */
public class NewClass1{
    /* 
     public String Alert(){
     String str ="sdasda";
     return str;
     */

    public String Alert() {
        String str;
        BufferedImage screen = null;
        BufferedImage screen2 = null;
        
        try {
            screen = ImageIO.read(new File("C:\\Users\\qwerty\\Documents\\NetBeansProjects\\Image_in_page\\web\\images\\12.jpg"));
            screen2 = ImageIO.read(new File("C:\\Users\\qwerty\\Documents\\NetBeansProjects\\Image_in_page\\web\\images\\12_1.jpg"));
        } catch (IOException e) {
        }
        

        int w = screen.getWidth();
        int h = screen.getHeight();
        int w2 = screen2.getWidth();
        int h2 = screen2.getHeight();
        int[][] screenArray = new int[w][h];
        int[][] screenArray2 = new int[w2][h2];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                screenArray[i][j] = screen.getRGB(i, j);
            }
        }

        for (int i = 0; i < w2; i++) {
            for (int j = 0; j < h2; j++) {
                screenArray2[i][j] = screen2.getRGB(i, j);
            }
        }

        if (Arrays.deepEquals(screenArray, screenArray2)) {
            str = "image equals!";
        } else {
            System.out.println(screen.getClass().toString());
            str = "image not equals";
        }
        return str;
    }

}
