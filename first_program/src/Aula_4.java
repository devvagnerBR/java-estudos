import java.util.Scanner;

public class Aula_4 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x;
    String s1,s2,s3;

    //nextLine lê a linha inteira
    //next lê até o primeiro espaço em branco

    x= sc.nextInt(); 
    sc.nextLine(); //para consumir a quebra de linha do nextInt

    s1 = sc.nextLine();
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("Dados digitados:");
    System.out.println(x);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    sc.close();
    }
    
}
