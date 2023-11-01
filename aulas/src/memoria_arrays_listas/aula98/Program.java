package memoria_arrays_listas.aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista: " + list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        list.remove("Anna");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        // stream é um recurso para trabalhar com expressões lambda;
        // collect(Collectors.toList()) converte o resultado da expressão lambda em uma lista;

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);

        System.out.println(name);

        // findFirst() retorna o primeiro elemento da lista que satisfaz a expressão lambda;
        // orElse(null) retorna null caso não encontre nenhum elemento;


    }

}
