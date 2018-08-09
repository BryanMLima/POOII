import java.util.Scanner;

public class MediaAlunos {
    public int aprovados;
    public int reprovados;
    public int recuperacao;

    public MediaAlunos(){
        this.aprovados = 0;
        this.recuperacao = 0;
        this.reprovados = 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MediaAlunos media = new MediaAlunos();
        double mediaTotal=0;


        int line = 6, column = 2;
        double [][] notas = new double[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Digite a nota do aluno:");
                notas[i][j] = input.nextDouble();
            }

        }
        for (int i = 0; i < line; i++) {
            int j = 0;
            double medias = media.calcularMedia(notas[i][j],notas[i][j+1]);


            mediaTotal += medias;
            System.out.println("A media do aluno "+(i+1)+" eh : "+medias);
            media.mediaFinal(medias);
        }
        System.out.println("A media total da turma eh : "+mediaTotal/6);
        media.conceitoAlunos();

    }

    public double calcularMedia(double x, double y){
        double media = (x+y)/2;

        return media;

    }
    public void conceitoAlunos(){
        System.out.println("Alunos aprovados: "+this.aprovados+"" +
                "\nAlunos em recuperacao: "+this.recuperacao+"" +
                "\nAlunos reprovados: "+this.reprovados);

    }
    public void mediaFinal(double nota){
        if (nota > 6 && nota <= 10){
            System.out.print("----------------Aprovado!");
            this.aprovados++;
        }
        else if (nota >= 3 && nota < 6){
            System.out.print("----------------Recuperacao!");
            this.recuperacao++;
        } else {
            System.out.print("----------------Reprovado!");
            this.reprovados++;
        }
    }



}
