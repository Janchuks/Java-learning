import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
        int n, m, vertiba, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[][] a;
        int mazR = 0, mazK = 0, lielR = 0, lielK = 0;

        do {
            System.out.print("Norādiet masīva rindu skaitu (max=20): ");
            n = dati.nextInt();
        } while (n < 1 || n > 20);

        do {
            System.out.print("Norādiet masīva kolonnu skaitu (max=20): ");
            m = dati.nextInt();
        } while (m < 1 || m > 20);

        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("ievdiet elementus[" + i + "][" + j + "]: ");
                vertiba = dati.nextInt();
                a[i][j] = vertiba;
                if (vertiba < min) {
                    min = vertiba;
                    mazR = i;
                    mazK = j;
                }
                if (vertiba > max) {
                    max = vertiba;
                    lielR = i;
                    lielK = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Elementu summa: " + sum);
        System.out.println("Vidējais: " + (sum / (n * m)));

        System.out.println("Mazākā vērtība atrodas [" + mazR + "][" + mazK + "]");
        
        ArrayList<Integer> rsum = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int r = 0;
            for (int j = 0; j < m; j++) {
                r += a[i][j];
            }
            rsum.add(r);
        }

        ArrayList<Integer> csum = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int ssum = 0;
            for (int j = 0; j < n; j++) {
                ssum += a[j][i];
            }
            csum.add(ssum);
        }

        System.out.println("Vislielākā rinda summa: " + Collections.max(rsum) + " atrodas rindā [" + lielR + "] un kolonnā [" + lielK + "]");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Masīvs pirms kārtošanas:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        if (a[i][j] > a[k][l]) {
                            int temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Masīvs pēc kārtošanas:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
