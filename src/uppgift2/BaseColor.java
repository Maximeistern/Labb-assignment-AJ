package uppgift2;

import java.util.Random;

public enum BaseColor {
    Red, Blue, Green, Brown, White, Black, Pink, Purple, Orange;


    public static BaseColor getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }
}