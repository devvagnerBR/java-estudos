import java.util.Locale;

public class Aulas {

    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        
        System.out.println("===== Exemplos =====");
        System.out.println("[1] Valor de y: " + y); // 32
        System.out.println("[2] Valor de x(normal): " + x); // 10.35784
        System.out.printf("[3] Valor de x(2 casas): %.2f%n", x);  // 10,36
        System.out.printf("[4] Valor de x(4 casas): %.4f%n", x);  // 10,3578
        
        Locale.setDefault(Locale.US); // formata para a linguagem padrão dos EUA usando ponto ao invés de vírgula

        System.out.printf("[5] Valor de x(4 casas): %.4f%n", x);  // 10.3578
        System.out.println("[6] Resultado = " + x + " metros"); // Resultado = 10.35784 metros
        System.out.printf("[7] Resultado = %.2f metros%n", x); // Resultado = 10.36 metros

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("[8] %s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // Maria tem 31 anos e ganha R$ 4000,00 reais

        System.out.println("===== Exercícios =====");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.print("Record: ");
        System.out.print(age + " years old, " + "code " + code + " and gender: " + gender);

        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
