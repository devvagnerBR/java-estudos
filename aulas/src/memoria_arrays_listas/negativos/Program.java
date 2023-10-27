package memoria_arrays_listas.negativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você vai digitar? ");

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }

}
