import javax.swing.JOptionPane;
public class MatrizeVetor {


    public static void main(String[] args) {

        int[] vetor5 = new int[5];
        int[] vetor10 = new int[10];
        int[][] matrix = new int[4][3];

        //MONTANDO VETOR N = 5
        for (int i = 0; i < vetor5.length; i++) {
            String value = JOptionPane.showInputDialog("Digite um valor:");
            int valor = Integer.parseInt(value);
            vetor5[i] = valor;
        }
        //MOSTRANDO VETOR 5
        String output = "";
        for (int i = 0; i < vetor5.length; i++) {
            if (i != vetor5.length-1){
                output += vetor5[i]+ " , ";
            } else {
                output += vetor5[i];
            }

        }
        JOptionPane.showMessageDialog(null,output);

        //MONTANDO VETOR N = 10
        for (int i = 0; i < vetor10.length; i++) {
            String value = JOptionPane.showInputDialog("Digite um valor:");
            int valor = Integer.parseInt(value);
            vetor10[i] = valor;
        }
        //MOSTRANDO VETOR 10
        output = "";
        for (int i = 0; i < vetor10.length; i++) {
            if (i != vetor10.length-1){
                output += vetor10[i]+ " , ";
            } else {
                output += vetor10[i];
            }

        }
        JOptionPane.showMessageDialog(null,output);

        //MONTANDO MATRIZ 4X3
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String value = JOptionPane.showInputDialog("Digite um valor:");
                int valor = Integer.parseInt(value);
                matrix[i][j] = valor;
            }
        }
        //MOSTRANDO MATRIZ
        output = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j != matrix[i].length - 1){
                    output += matrix[i][j]+" , ";
                } else {
                    output += matrix[i][j];
                }

            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null,output);


        //LOGICA
        int max = 0, min = vetor10[0];

        for (int i = 0; i < vetor5.length; i++) {
            if (max < vetor5[i]){
                max = vetor5[i];
            }
        }
        for (int i = 0; i < vetor10.length; i++) {
            if (min <= vetor10[i]){
                min = vetor10[i];
            }
        }
        int aux = max * min;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += aux;

            }
        }
        //MOSTRANDO MATRIZ
        output = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j != matrix[i].length - 1){
                    output += matrix[i][j]+" , ";
                } else {
                    output += matrix[i][j];
                }

            }
            output += "\n";
        }
        JOptionPane.showMessageDialog(null,output);

        //NUMEROS PARES
        for (int i = 0; i < matrix.length; i++) {
            int par = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2 == 0){
                    par+= matrix[i][j];
                }
            }
            JOptionPane.showMessageDialog(null,"A soma dos numeros pares da linha "+(i+1)+" eh de: "+par);
        }
        //NUMEROS ENTRE 1 E 5
        for (int i = 0; i < 3; i++) {
            int aux2 = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[j][i] > 1 && matrix[j][i] < 5){
                    aux2++;
                }
            }
            JOptionPane.showMessageDialog(null, "a quantidade de numeros entre 1 e 5 na coluna "+(i+1)+" eh de : "+aux2);

        }

    }

}
