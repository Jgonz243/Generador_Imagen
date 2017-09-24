package cargarimagen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jhon Gonzales
 */
public class ProcesamientoImagen {
    
    private BufferedImage imageActual;
    private int aleatorios = 0;
    private int puntosImagen;
    private int area_imagen;

    public BufferedImage abrirImagen() {
        
        BufferedImage bmp = null;        
        JFileChooser selector = new JFileChooser();       
        selector.setDialogTitle("Seleccione una imagen");        
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG & GIF & BMP & PNG", "jpg", "gif", "bmp","png");
        selector.setFileFilter(filtroImagen);      
        int flag = selector.showOpenDialog(null);    
        if (flag == JFileChooser.APPROVE_OPTION) {
            try {               
                File imagenSeleccionada = selector.getSelectedFile();               
                bmp = ImageIO.read(imagenSeleccionada);
            } catch (Exception e) {
            }

        }
        
        imageActual = bmp;       
        return bmp;
    }

    public BufferedImage simular(String rep) {
        aleatorios = Integer.parseInt(rep);
        aleatorios();
        return imageActual;
    }
    public int  aleatorios() {

        puntosImagen = 0;
        Color newColor = new Color(0, 0, 255);
        for (int i = 0; i < aleatorios; i++) {
            int x = generarAleatorio(0, imageActual.getWidth());
            int y = generarAleatorio(0, imageActual.getHeight());
            Color color = new Color(this.imageActual.getRGB(x, y));
            if (color.equals(new Color(0, 0, 0))) {
                puntosImagen++;
            }
            imageActual.setRGB(x, y, newColor.getRGB());
       area_imagen=imageActual.getWidth()*imageActual.getHeight()*puntosImagen/100;
        }
        System.out.println("Ancho: " + imageActual.getWidth());
        System.out.println("Alto: " + imageActual.getHeight());
        System.out.println("Aleatorios en imagen: " + puntosImagen);
        System.out.println("El area de la imagen es de: " + area_imagen);
     return area_imagen;   
    }
     public int  ancho() {
        puntosImagen = 0;
        Color newColor = new Color(0, 0, 255);
        for (int i = 0; i < aleatorios; i++) {
            int x = generarAleatorio(0, imageActual.getWidth());
            int y = generarAleatorio(0, imageActual.getHeight());
            Color color = new Color(this.imageActual.getRGB(x, y));
            if (color.equals(new Color(0, 0, 0))) {
                puntosImagen++;
            }
            imageActual.setRGB(x, y, newColor.getRGB());
       area_imagen=imageActual.getWidth()*imageActual.getHeight()*puntosImagen/100;
        }
        System.out.println("Ancho: " + imageActual.getWidth());
        System.out.println("Alto: " + imageActual.getHeight());
        System.out.println("Aleatorios en imagen: " + puntosImagen);
        System.out.println("El area de la imagen es de: " + area_imagen);
     return imageActual.getWidth();   
    }
      public int  alto() {

        puntosImagen = 0;
        Color newColor = new Color(0, 0, 255);
        for (int i = 0; i < aleatorios; i++) {
            int x = generarAleatorio(0, imageActual.getWidth());
            int y = generarAleatorio(0, imageActual.getHeight());
            Color color = new Color(this.imageActual.getRGB(x, y));
            if (color.equals(new Color(0, 0, 0))) {
                puntosImagen++;
            }
            imageActual.setRGB(x, y, newColor.getRGB());
       area_imagen=imageActual.getWidth()*imageActual.getHeight()*puntosImagen/100;
        }
        System.out.println("Ancho: " + imageActual.getWidth());
        System.out.println("Alto: " + imageActual.getHeight());
        System.out.println("Aleatorios en imagen: " + puntosImagen);
        System.out.println("El area de la imagen es de: " + area_imagen);
     return imageActual.getHeight();   
    }

       public int  puntos() {
        puntosImagen = 0;
        Color newColor = new Color(0, 0, 255);
        for (int i = 0; i < aleatorios; i++) {
            int x = generarAleatorio(0, imageActual.getWidth());
            int y = generarAleatorio(0, imageActual.getHeight());
            Color color = new Color(this.imageActual.getRGB(x, y));
            if (color.equals(new Color(0, 0, 0))) {
                puntosImagen++;
            }
            imageActual.setRGB(x, y, newColor.getRGB());
       area_imagen=imageActual.getWidth()*imageActual.getHeight()*puntosImagen/100;
        }
        System.out.println("Ancho: " + imageActual.getWidth());
        System.out.println("Alto: " + imageActual.getHeight());
        System.out.println("Aleatorios en imagen: " + puntosImagen);
        System.out.println("El area de la imagen es de: " + area_imagen);
     return puntosImagen;   
    }
    private int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
