// Aula - OPERADORES LÓGICOS

public class aula33 {

    // && - E
    // || - OU
    // ! - NÃO

        public static void main(String[] args) {

            // &&
            int X = 5;
            boolean c1 = X < 20 && X == 10;
            boolean c2 = X > 0 && X != 3;
            System.out.println("c1 é: " + c1); // false
            System.out.println("c2 é: " + c2); // true

            // ||
            boolean c3 = X == 10 || X <=20;
            boolean c4 = X <= 0  || X != 3 || X != 5;
            System.out.println("c3 é: " + c3); // true
            System.out.println("c4 é: " + c4); // true

            // !
            boolean c5 = !(X == 10);	
            boolean c6 = !(X >= 2);
            boolean c7 = !(X <= 20 && X == 10);
            System.out.println("c5 é: " + c5); // true
            System.out.println("c6 é: " + c6); // false
            System.out.println("c7 é: " + c7); // true

       }
}
