package memoria_arrays_listas.aula93;

import java.util.Locale;
import java.util.Scanner;

import memoria_arrays_listas.aula93.entities.Rent;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many rooms will be rented? ");

        int n = sc.nextInt();
        Rent[] rooms = new Rent[10];

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Rent #" + i + ":");

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");

            int room = sc.nextInt();
            rooms[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i]);
            }
        }




        sc.close();

    }

}
