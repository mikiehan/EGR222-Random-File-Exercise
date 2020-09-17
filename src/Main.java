import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        //generate random odd numbers ranging from 57 to 301

        //generate random whole numbers that are multiples of 6 ranging from -24 to 18

        //generate random real numbers that ranges from -1.3 to 2.5

        //generate random real numbers that ranges from -0.01 to 0.05

    }

    public static int getRandomInt(int v1, int v2, int v3) {
        Random rand = new Random();
        return rand.nextInt(v1) * v2  + v3;
    }

    public static double getRandomDouble(double v1, double v2) {
        Random rand = new Random();
        return rand.nextDouble()*v1 + v2;
    }

}
