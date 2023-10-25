// Aula - 49 - estrutura repetitiva for

package estrutura_de_repeticao;

import java.util.Scanner;

public class Aula49 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números vão ser informados ? ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("soma total dos números: " + soma);
        sc.close();


    }

}
