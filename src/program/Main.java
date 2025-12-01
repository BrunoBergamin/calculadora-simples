package program;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Main {
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);

       String entrada = JOptionPane.showInputDialog(
               null,
               "Escolha: 1 - Multiplicação, 2 - Divisão, 3 - Soma ou 4 - Subtração"
       );

       if (entrada == null || entrada.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Operação inválida!");
           return;
       }

       char operacao = entrada.charAt(0);

       if (operacao != '1' && operacao != '2' && operacao != '3' && operacao != '4') {
           JOptionPane.showMessageDialog(null, "Operação inválida!");
           return;
       }

       double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
       double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

       double resultado;

       switch (operacao) {
           case '1':
               resultado = num1 * num2;
               JOptionPane.showMessageDialog(null, "A multiplicação é: " + resultado);
               break;

           case '2':
               if (num2 == 0) {
                   JOptionPane.showMessageDialog(null, "Divisão por 0 é inválida.");
               } else {
                   resultado = num1 / num2;
                   JOptionPane.showMessageDialog(null, "A divisão é: " + resultado);
               }
               break;

           case '3':
               resultado = num1 + num2;
               JOptionPane.showMessageDialog(null, "A soma é: " + resultado);
               break;

           case '4':
               resultado = num1 - num2;
               JOptionPane.showMessageDialog(null, "A subtração é: " + resultado);
               break;
       }
   }
}



