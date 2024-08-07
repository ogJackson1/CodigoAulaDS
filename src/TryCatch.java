import javax.swing.JOptionPane;
public class TryCatch {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1° numero");
            int num1 = Integer.parseInt(aux1);
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2° numero");
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtraçao = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicaçao = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisao = " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null, "Erro de divisao por Zero'\n" + erro.toString(),
                   "Erro",JOptionPane.ERROR_MESSAGE );
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de Conversao'\n" + erro.toString(),
                    "Erro",JOptionPane.ERROR_MESSAGE );
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Tecla Cancel pressionada\n" + erro.toString(),
                    "Cancelado pelo usuario", JOptionPane.ERROR_MESSAGE );
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execuçao ");
        }
        System.exit(0);
    }
}
