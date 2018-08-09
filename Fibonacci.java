public class Fibonacci {
    public static void main(String[] args) {
        
        int[] x = new int[60];
        x[1] = 1;

        for (int i = 2; i < x.length-1; i++) {
            x[i] += (x[i-1]+ x[i-2]);

            System.out.println(x[i]);
        }
    }
}
