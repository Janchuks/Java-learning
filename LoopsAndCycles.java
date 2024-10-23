import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);

        int i, a, b, d, e, f, c, g, h, j, k, l;
        int sum = 0;

        for (i = -5; i <= 5; i++) {
            System.out.println(Math.pow(i, 2));
        }
        System.out.println("pirmais uzd pabeigts");

        do {
            System.out.println("ievadiet pirmo skaitli");
            a = dati.nextInt();
            System.out.println("ievadiet otro skaitli");
            d = dati.nextInt();
        } while (a < d);

        if (a > d) {
            for (e = a; e >= d; e--) {
                System.out.println(e);
            }
        } else {
            for (e = d; e >= a; e--) {
                System.out.println(e);
            }
        }
        System.out.println("otrais uzd pabeigts");

        for (b = 10; b <= 99; b++) {
            f = b % 3;
            if (f == 0) {
                sum = sum + 1;
            }
        }
        System.out.println("ir " + sum + " skaitļi kas dalās ar 3 bez atlikuma");
        System.out.println("trešais uzd pabeigts");


        sum = 0;
        for (c = 10; c <= 99; c++) {
            if (c % 7 == 0) {
                System.out.println("šis ir skaitlis kurš dalās ar 7 bez atlikuma");
                System.out.println(c);
                sum = sum + c;
            }
        }
        System.out.println("šāda " + sum + " ir summa skaitļiem kuri dalās ar 7 bez atlikuma");
        System.out.println("ceturtais uzd pabeigts");

        g = 0;
        d = 0;
        for (j = 1; j <= 10; j++) {
            k = (int) (Math.random() * 5) - 2;
            System.out.println(k);
            l = k % 2;
            if (l == 0) {
                g = g + k;
            } else {
                d = d + k;
            }
        }
        System.out.println("visu nepāra skaitļu summa ir " + d);
        System.out.println("visu pāra skaitļu summa ir " + g);
        System.out.println("pēdējais uzdevums");
    }
}
