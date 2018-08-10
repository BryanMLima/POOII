import javax.swing.*;

public class CompAerea {

    private boolean[] voo = new boolean[10];

    public CompAerea (){

    }
    public void cadastrarEconomica(){
        //MOSTRANDO VAGAS
        String vagas ="";
        for (int i = 5; i < voo.length; i++) {
            if (voo[i] == true){
                vagas += "\n"+(i+1)+"( x )";
            } else {
                vagas += "\n"+(i+1)+"(   )";
            }
        }
        JOptionPane.showMessageDialog(null,vagas);

        //CADASTRAR VAGA ECONOMICA
        int full = 0;
        for (int i = 5; i < voo.length; i++) {
            if (voo[i] == true){
                full++;
            }
            if (full == 5){
                String aux = JOptionPane.showInputDialog(null,"Classe Economica lotada!\nDeseja Comprar na Primeira Classe?(Caso sim digite 1)");
                int aux2 = Integer.parseInt(aux );
                if (aux2 == 1){
                    cadastrarPrimeira();
                }
            }
        }
        String num = JOptionPane.showInputDialog(null,"Digite o numero da poltrona desejada:");
        int poltrona = Integer.parseInt(num);
        if (poltrona < 5 || poltrona > 10){
            JOptionPane.showMessageDialog(null,"Numero da poltrona inexistente");
        } else {
            if (voo[poltrona - 1] == true) {
                JOptionPane.showMessageDialog(null, "Vaga Ocupada!");
            } else {
                voo[poltrona - 1] = true;
                JOptionPane.showMessageDialog(null, "CARTAO DE EMBARQUE\n" +
                        "Classe Economica\n" +
                        "Numero do assento: " + poltrona);
            }
        }
    }

    public void cadastrarPrimeira(){
        //MOSTRANDO VAGAS
        String vagas ="";
        for (int i = 0; i < 5; i++) {
            if (voo[i] == true){
                vagas += "\n"+(i+1)+"( x )";
            } else {
                vagas += "\n"+(i+1)+"(   )";
            }
        }
        JOptionPane.showMessageDialog(null,vagas);

        //CADASTRAR VAGA PRIMEIRA
        int full = 0;
        for (int i = 0; i < 5; i++) {
            if (voo[i] == true){
                full++;
            }
            if (full == 5){
                String aux = JOptionPane.showInputDialog(null,"Primeira Classe lotada!\nDeseja Comprar na Classe Economica?(Caso sim digite 1)");
                int aux2 = Integer.parseInt(aux );

                if (aux2 == 1){
                    cadastrarEconomica();
                }
            }
        }
        String num = JOptionPane.showInputDialog(null,"Digite o numero da poltrona desejada:");
        int poltrona = Integer.parseInt(num);

        if (poltrona < 1 || poltrona > 5){
            JOptionPane.showMessageDialog(null,"Numero da poltrona inexistente");
        } else {

            if (voo[poltrona-1] == true){
                JOptionPane.showMessageDialog(null,"Vaga Ocupada!");
            } else {
                voo[poltrona-1] = true;
                JOptionPane.showMessageDialog(null,"CARTAO DE EMBARQUE\n" +
                        "Primeira Classe\n" +
                        "Numero do assento: "+poltrona);
            }
        }
    }


}
