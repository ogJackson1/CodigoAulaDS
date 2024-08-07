import javax.swing.JOptionPane;
public class If {
    public static void main(String[] args){
        Object[] op = {"masculino", "feminino"};
        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino");

        if (resp==null) {
            JOptionPane.showMessageDialog(null, "você pressionou Cancel!");
        }
        if (resp.equals("Masculino")) {
            JOptionPane.showMessageDialog(null, "Você é homem!");
        }
        if (resp.equals("Feminino")) {
            JOptionPane.showMessageDialog(null, "Você é mulher!");
        }
        System.exit(  0);
    }
}