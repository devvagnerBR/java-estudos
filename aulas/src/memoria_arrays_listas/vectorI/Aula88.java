package memoria_arrays_listas.vectorI;

import java.util.Locale;
import java.util.Scanner;

public class Aula88 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many heights will be entered? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height #" + (i + 1) + ": ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }

}
