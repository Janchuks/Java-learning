import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        int a, b, c, per;
        double nLauk, Lauk, bk, ck, ak, cosa, cosb, cosc, y, radievilkt, radapvilkt, pi, pper;

        String izvele;
        do {
            System.out.println("Ievadiet pirmo garumu(AB)");
            a = dati.nextInt();
            System.out.println("Ievadiet otro garumu(BC)");
            b = dati.nextInt();
            System.out.println("Ievadiet trešo garumu(CA)");
            c = dati.nextInt();
            if ((a >= (b + c) || c >= (b + a) || b >= (a + c)))
                System.out.println("Trijstūris neeksistē");
            System.out.println("************");
        } while ((a >= (b + c) || c >= (b + a) || b >= (a + c)));

        dati.nextLine();

        do {
            System.out.println("Ko jūs vēlaties izrēķināt?");
            System.out.println("A - perimetru");
            System.out.println("B - laukumu");
            System.out.println("C - trijstūra veidu");
            System.out.println("D - ievilkta riņķa līnijas rādiusu un riņķa laukumu");
            System.out.println("E - apvilkta riņķa līnijas rādiusu un riņķa laukumu");
            System.out.println("X - iziet no aprēķiniem");
            izvele = dati.nextLine();
            System.out.println("************");

        } while (!izvele.equalsIgnoreCase("A") && !izvele.equalsIgnoreCase("B") && !izvele.equalsIgnoreCase("C")
                && !izvele.equalsIgnoreCase("D") && !izvele.equalsIgnoreCase("E") && !izvele.equalsIgnoreCase("X"));

        switch (izvele.toUpperCase()) {
            case "A":
                System.out.println("Perimetrs ir " + (per = a + b + c));
                break;

            case "B":
                per = a + b + c;
                pper = per / 2.0;
                nLauk = pper * (pper - a) * (pper - b) * (pper - c);
                Lauk = Math.sqrt(nLauk);
                System.out.println("Laukums ir " + Lauk);
                break;

            case "C":
                bk = Math.pow(b, 2);
                ck = Math.pow(c, 2);
                ak = Math.pow(a, 2);
                cosa = (ak - bk - ck) / (-2.0 * b * c);
                cosb = (bk - ak - ck) / (-2.0 * a * c);
                cosc = (ck - ak - bk) / (-2.0 * a * b);

                if (cosa == cosb && cosa == cosc) {
                    System.out.println("Šaurlenķa");
                } else if (a > b && a > c) {
                    System.out.println("A " + cosa);
                    y = cosa;
                } else if (b > a && b > c) {
                    System.out.println("B " + cosb);
                    y = cosb;
                } else {
                    System.out.println("C " + cosc);
                    y = cosc;
                }

                if (y == 0) {
                    System.out.println("Taisnlenķa");
                } else if (y < 0) {
                    System.out.println("Platlenķa");
                } else {
                    System.out.println("Šaurlenķa (Vienādmalu)");
                }
                break;

            case "D":
                per = a + b + c;
                pper = per / 2.0;
                nLauk = pper * (pper - a) * (pper - b) * (pper - c);
                Lauk = Math.sqrt(nLauk);
                radievilkt = Lauk / pper;
                System.out.println("Ieviltā riņķa radius " + radievilkt);
                pi = 3.14;
                System.out.println("Riņķa laukums " + pi * (radievilkt * radievilkt));
                break;

            case "E":
                per = a + b + c;
                pper = per / 2.0;
                nLauk = pper * (pper - a) * (pper - b) * (pper - c);
                Lauk = Math.sqrt(nLauk);
                radapvilkt = (a * b * c) / (4.0 * Lauk);
                System.out.println("Apvilkta riņķa līnijas radiuss " + radapvilkt);
                pi = 3.14;
                System.out.println("Riņķa laukums " + pi * (radapvilkt * radapvilkt));
                break;
        }

        System.out.println("Paldies par lietošanu!");

        final int size = 4;
        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("#");
            }
            System.out.print(System.lineSeparator());
        }
    }
}
