package uppgift2;

import java.util.Random;

public enum Brand {
    BMW, Volvo, SAAB, Nissan, Audi, VolksWagnen, Honda, Bently, Cadillac;

    public static Brand getRandomBrand() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }
}
