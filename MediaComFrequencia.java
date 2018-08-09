import java.util.Scanner;

public class MediaComFrequencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de alunos da turma: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a primeira nota:");
            double n1 = input.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double n2 = input.nextDouble();
            System.out.println("Digite o numero de aulas assistidas :");
            double aulas = input.nextDouble();

            MediaComFrequencia medias = new MediaComFrequencia();

            double freq = medias.calcularFreq(aulas);

            MediaComFrequencia[] mediaFinal = new MediaComFrequencia[n];
            mediaFinal[i] = new MediaComFrequencia(n1,n2,freq);
            System.out.println("Frequencia :"+mediaFinal[i].freq+"%" +
                    "\nNota 1:"+mediaFinal[i].n1+"" +
                    "\nNota 2:"+mediaFinal[i].n2);


        }




    }
    public double n1;
    public double n2;
    public double freq;

    public MediaComFrequencia(double n1, double n2, double freq){
        this.n1 = n1;
        this.n2 = n2;
        this.freq = freq;

    }
    public MediaComFrequencia(){

    }
    public double calcularFreq(double aula){
        double aux = (aula/18)*100;
        return aux;
    }
    public mediaFinal(double n1, double n2, double freq){
        double media = (n1+n2)/2;

        if (media >= 6 && freq >= 75){
            System.out.println("Aprovado!");
        } else{
            System.out.println("Reprovado!");
        }


    }

}
