package Random;

import java.util.Random;

public class Radom {
    int seed;
    Radom(int seed) {
        this.seed = seed;
    }

    public static void random() {
        for (int i = 0; i < 51; i++) {
            Random rd = new Random();
            int number1 = rd.nextInt(100);
            System.out.println("number " + i + " : " + number1);
        }
    }
}
