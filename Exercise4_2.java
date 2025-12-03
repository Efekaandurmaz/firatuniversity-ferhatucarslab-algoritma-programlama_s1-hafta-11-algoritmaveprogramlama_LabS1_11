import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenar: ");
        double a = input.nextDouble();

        System.out.print("2. Kenar: ");
        double b = input.nextDouble();

        System.out.print("3. Kenar: ");
        double c = input.nextDouble();

        double cevre = cevreHesapla(a, b, c);
        double alan = alanHesapla(a, b, c);

        System.out.println("Çevre = " + cevre);
        System.out.println("Alan = " + alan);
    }

    public static double cevreHesapla(double a, double b, double c) {
        return a + b + c;
    }

    public static double alanHesapla(double a, double b, double c) {
        double u = (a + b + c) / 2.0;
        return Math.sqrt(u * (u - a) * (u - b) * (u - c));
    }
}
