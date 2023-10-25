// Aula - 45 - Teste de mesa com estrutura repetitiva while

package estrutura_de_repeticao;

public class Aula45 {

    public static void main(String[] args) {

        int x = 0;
        int y = 4;

        while (x < 3) {
            y += 2;
            x += 1;
            System.out.println(x + " - " + y);
        }

        System.out.println("fim do programa");
    }

}
