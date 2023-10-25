import java.util.Locale;
import java.util.Scanner;


public class Aula03 {

    public static void main(String[] args) {

        //declarando as variáveis
        String name;
        double height;
        int age;
        char sexo;

        //definindo o locale para US
        Locale.setDefault(Locale.US);
        //instanciando o scanner
        Scanner sc = new Scanner(System.in);

        //string
        System.out.println("Digite seu nome");
        name = sc.next();

        //int
        System.out.println("Digite sua idade");
        age = sc.nextInt();

        //double
        System.out.println("Digite sua altura");
        height = sc.nextDouble();

        //char
        System.out.println("Digite o seu sexo M ou F");
        sexo = sc.next().charAt(0); 

        //output
        System.out.println("Seu nome é " + name + " e você tem " + age + " anos!");
        System.out.printf("Sua altura é de %.2f metros!%n", height);
        
        //condicional
        if (sexo == 'M') System.out.println("você é do sexo Masculino");
        else if (sexo == 'F') System.out.println("Você é do sexo Feminino");
        else System.out.println("Sexo informado inválido");
    
        //fechando o scanner
        sc.close();

    }
}
