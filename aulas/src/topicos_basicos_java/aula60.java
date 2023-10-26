// Aula - 60 - Funções (Sintaxe)

package topicos_basicos_java;

import java.util.Scanner;

public class aula60 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    private static int max(int x, int y, int z) {

        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    private static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

}
