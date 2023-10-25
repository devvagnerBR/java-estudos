// Aula 44 - Estrutura de repetição while

package estrutura_de_repeticao;

import java.util.Scanner;

public class Aula44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            System.out.println("digite outro numero: ");
            x = sc.nextInt();
        }

        System.out.println("resultado: " + soma);
        sc.close();
    }

}
