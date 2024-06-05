import javax.swing.*;
public class IfComElse {
    public static void main(String[] args){
        String aux = JOptionPane.showInputDialog("Fornece o numero mes: ");
        if (aux !=null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null, "Numero do mes valido!\n" + mes);
                }else {
                    JOptionPane.showMessageDialog(null, "Numero do mes invalido!\n"+ mes );
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite  apenas valores inteiros!"
                      + erro);
            }
        }
        else {
                     JOptionPane.showMessageDialog(null, "Opcao Cancelada");
        }
        System.exit(0);
    }
}
