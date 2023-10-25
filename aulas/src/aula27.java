// AULA - FUNÇÕES MATEMÁTICAS EM JAVA

import java.util.Scanner;

public class aula27 {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;

        // raiz quadrada
        A= Math.sqrt(x); // raiz quadrada de x
        B = Math.sqrt(y);   // raiz quadrada de y
        C = Math.sqrt(25.0);    // raiz quadrada de 25
    
 
        System.out.println("Raiz quadrada de " + x  + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        // potencia
        A = Math.pow(x,y);  // x elevado a y
        B = Math.pow(x,2.0); // x elevado ao quadrado
        C = Math.pow(5.0,2.0); // 5 elevado ao quadrado

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        // valor absoluto
        A = Math.abs(y); // valor absoluto de y
        B = Math.abs(z); // valor absoluto de z

        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);


        // BHASKARA
        
        double a , b, c;
        double delta,x1,x2;

        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        sc.close();

        delta = (int) (Math.pow(b,2.0) - 4 * a * c);
        System.out.println("delta: " + delta);

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.printf("x1 = %.2f", x1);
        System.out.println();
        System.out.printf("x2 = %.2f", x2);

    }
}
