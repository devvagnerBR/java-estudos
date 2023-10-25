//37 - Aula: OPERADORES DE ATRIBUIÇÃO CUMULATIVA

import java.util.Locale;
import java.util.Scanner;

public class Aula37 {

    // a += b;  a = a + b;
    // a -= b;  a = a - b;
    // a *= b;  a = a * b;
    // a /= b;  a = a / b;
    // a %= b;  a = a % b;
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta  = 50.0;

        if(minutos > 100 ) conta += (minutos - 100) * 2.0;
        System.out.println("Valor da conta = R$ " + String.format("%.2f", conta));
        
        sc.close();

    }
    
}
