package memoria_arrays_listas.vetorII;

import java.util.Locale;
import java.util.Scanner;

import construtores_sobrecarga_encapsulamento.encapsulamento.entities.Product;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many products will be entered? ");
        int n = sc.nextInt();
        
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {

            sc.nextLine();

            System.out.println("Enter product name: ");
            String name = sc.nextLine();

            System.out.println("Enter product price: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);

        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();
    }

}
