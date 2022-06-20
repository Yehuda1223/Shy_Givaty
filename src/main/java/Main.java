import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Integer.MAX_VALUE);
        Mirror();
        Contrast();
        BlackAndWhite();
        Darker();
        Lighter();
        EliminateRedOrGreenOrBlue();
    }


    public static Color increeaseContras(Color color) {

        return color;
    }

    public static void Mirror() throws IOException {//זה פילטר ניגודיות

        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            BufferedImage image = ImageIO.read(file);
            BufferedImage outputeImage = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    Color nextColor = new Color(pixel);
                    outputeImage.setRGB(image.getWidth() - x - 1, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\1.jpg");
            ImageIO.write(outputeImage, "jpg", output);
        }

    }

    public static void Contrast() throws IOException {//זה פילטר שעושה שחור לבן

        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            Color color;
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color nextColor = new Color(255 - red, 255 - green, 255 - blue);
                    image.setRGB(x, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\2.jpg");
            ImageIO.write(image, "jpg", output);
        }

    }

    public static void BlackAndWhite() throws IOException {//זה פילטר שעושה שחור לבן

        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            Color color;
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    int average = (red + green + blue) / 3;

                    Color nextColor = new Color(average, average, average);
                    image.setRGB(x, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\3.jpg");
            ImageIO.write(image, "jpg", output);
        }

    }

    public static void Darker() throws IOException {//זה פילטר שעושה שחור לבן

        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            Color color;
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color nextColor = new Color(intenseColor(green, 0.5), intenseColor(red, 0.5), intenseColor(blue, 0.5));
                    image.setRGB(x, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\4.jpg");
            ImageIO.write(image, "jpg", output);
        }

    }

    public static void Lighter() throws IOException {//זה פילטר שעושה שחור לבן

        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            Color color;
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    Color nextColor = new Color(intenseColor(green, 2), intenseColor(red, 2), intenseColor(blue, 2));
                    image.setRGB(x, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\5.jpg");
            ImageIO.write(image, "jpg", output);
        }

    }

    public static void EliminateRedOrGreenOrBlue() throws IOException {//זה פילטר שעושה שחור לבן
        Random random = new Random();
        int temp = random.nextInt();
        File file = new File("C:\\images\\chile2(1).jpg");
        if (file.exists()) {
            Color color;
            BufferedImage image = ImageIO.read(file);
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int pixel = image.getRGB(x, y);
                    color = new Color(pixel);
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    if (temp < 0) {
                        green = color.getGreen();
                        blue = color.getBlue();
                        red = 0;
                    }
                    if (temp > 715827882 && temp < 715827882 * 2) {
                        red = color.getRed();
                        green = color.getGreen();
                        blue = 0;
                    }
                    if (temp >= 715827882 * 2) {
                        red = color.getRed();
                        blue = color.getBlue();
                        green = 0;
                    }
                    Color nextColor = new Color(red, blue, green);
                    image.setRGB(x, y, nextColor.getRGB());
                }
            }
            File output = new File("C:\\images\\6.jpg");
            ImageIO.write(image, "jpg", output);
            System.out.println(temp);
        }

    }


    public static int intenseColor(int original, double by) {
        original *= by;
        if (original >= 255)
            original = 255;
        return original;
    }
}







