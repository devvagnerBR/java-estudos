// Aula - ESTRUTURA CONDICIONAL(IF-ELSE)

import java.util.Scanner;

public class aula34 {

    public static void main(String[] args) {

        int x = 5;

        //SIMPLES
        if(x == 5) System.out.println("Hora do café");

        //COMPOSTA
        if(x < 0) System.out.println("Boa Tarde");
        else {
            System.out.println("Bom dia");
            System.out.println("Boa Noite");
        }

        //EXEMPLO 2

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if(hora< 12) System.out.println("Bom dia");
        else if(hora < 18) System.out.println("Boa tarde");
        else System.out.println("Boa noite");

        sc.close();
    }
}
