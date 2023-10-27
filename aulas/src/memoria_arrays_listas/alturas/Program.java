package memoria_arrays_listas.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas alturas você vai digitar? ");

        int n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += heights[i];
        }

        double avg = sum / n;

        System.out.printf("Altura média: %.2f%n", avg);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                count++;
            }
        }

        double percent = (double) count / n * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        sc.close();

    }
}
