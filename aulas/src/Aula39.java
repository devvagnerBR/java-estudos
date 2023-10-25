// Aula - CONDICIONAL TERNÁRIO

public class Aula39 {

    public static void main(String[] args) {

        double preco = 34.5;
        double desconto;

        if (preco < 20.0)
            desconto = preco * 0.1;
        else
            desconto = preco * 0.05;
        System.out.println(desconto);

        // O mesmo código acima, mas usando o operador ternário:

        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }

}