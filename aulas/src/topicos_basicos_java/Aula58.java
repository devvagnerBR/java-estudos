// Aula - 54 - Funções interessantes para String

package topicos_basicos_java;

public class Aula58 {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // é usado para converter todos os caracteres da String original em
                                             // minúsculas.
        String s02 = original.toUpperCase(); // é usado para converter todos os caracteres da String original em
                                             // maiúsculas.
        String s03 = original.trim(); // é usado para remover os espaços em branco no início e no final da String
                                      // original.
        String s04 = original.substring(2); // é usado para extrair uma parte da String original, começando de uma
                                            // determinada posição.
        String s05 = original.substring(2, 9); // é usado para extrair uma parte da String original, começando de uma
                                               // determinada posição e indo até outra posição.
        String s06 = original.replace('a', 'x'); // é usado para substituir todas as ocorrências de um determinado
                                                 // caractere por outro caractere.
        String s07 = original.replace("abc", "xy"); // é usado para substituir todas as ocorrências de uma determinada
                                                    // String por outra String.
        int i = original.indexOf("bc"); // é usado para encontrar a primeira ocorrência de uma determinada String dentro
                                        // de outra String. Se a String não for encontrada, o método indexOf retorna -1.
        int j = original.lastIndexOf("bc"); // é usado para encontrar a última ocorrência de uma String dentro de outra
                                            // String. Se a String não for encontrada, o método lastIndexOf retorna -1.

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
        System.out.println("indexOf(\"bc\"): " + i);
        System.out.println("lastIndexOf(\"bc\"): " + j);

        // split

        String s = "potato apple lemon orange";

        String[] vetor = s.split(" ");
        String word1 = vetor[0];
        String word2 = vetor[1];
        String word3 = vetor[2];
        String word4 = vetor[3];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);

    }

}
