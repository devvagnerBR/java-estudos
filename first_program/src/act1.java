import javax.swing.JOptionPane;

public class act1 {
    public static void main(String[] args) {

        int number1, number2;
        double quotient, power;
        String result;

        String input1 = JOptionPane.showInputDialog("Write the first number: ");
        number1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Write the second number: ");
        number2 = Integer.parseInt(input2);

        quotient = (double) number1 / number2;

        power = Math.pow(number1, number2);

        result = "Quotient result of the two numbers entered: " + quotient + "\n"
                  + "Result of the power between the two numbers: " + power;

        JOptionPane.showMessageDialog(null, "requested results.\n" + result, "AtividadePratica14", JOptionPane.INFORMATION_MESSAGE);
    }
}