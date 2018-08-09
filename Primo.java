import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero maior do que 1 :");
        int x = input.nextInt();
        int aux = 0;

        for (int i = 1; i <= x; i++) {

            if (x % i == 0 && i != x && i != 1){
                aux++;

                if (aux > 0){
                    break;
                }
            }
        }
        System.out.println(aux);
        if (aux == 0){
            System.out.println("numero primo");
        } else {
            System.out.println("Nao eh um numero primo");
        }

    }
}
