package memoria_arrays_listas.aula96;

public class Program {

    public static void main(String[] args) {

        String[] arr = new String[] { "Maria", "Bob", "Alex" };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("1: " + arr[i]);
        }

        for (String nome : arr) {
            System.out.println("2: " + nome);
        }

    }

}
