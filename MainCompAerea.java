import javax.swing.*;

public class MainCompAerea {
    public static void main(String[] args) {
        CompAerea voo = new CompAerea();

        int menu = 0;
        do {
            String aux = JOptionPane.showInputDialog(null,"MENU:\n" +
                    "1. Primeira Classe\n" +
                    "2. Classe Economica\n" +
                    "3. Sair.");
            menu = Integer.parseInt(aux );

            switch (menu){
                case 1:
                    voo.cadastrarPrimeira();
                    break;

                case 2:
                    voo.cadastrarEconomica();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    break;

                    default:
                        JOptionPane.showMessageDialog(null,"Opcao errada.Tente novamente.");
            }

        } while (menu != 3);
    }
}
