import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\images\\Pokémon_Pikachu_art.png");
        Color color;
        if (file.exists()) {
            System.out.println("Ok");
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {

                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    int everege = (red + green + blue) / 3;
                    Color nextColor = new Color(green, blue, red);
                    image.setRGB(x, y, nextColor.getRGB());
                    System.out.println("ddd");
                    //פה נגדיר פילטר שמדגיש את הצבעים
                }


            }


            File output = new File("C:\\images\\1.png");
            ImageIO.write(image, "png", output);
        }



    }
    public static Color increeaseContras(Color color){

        return color;
    }
    }







