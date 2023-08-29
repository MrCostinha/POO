import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n;
        do {
            n = scan.nextInt();

            if (n<2 || n>10000 || n%2 != 0) {
                System.out.println("Valor de N inválido!");
            }
        } while (n<2 || n>10000 || n%2 != 0);
        int m[] = new int[n];
        char l[] = new char[n];
        for (int i = 0; i < n; i++) {
            do {
                m[i] = scan.nextInt();
                l[i] = scan.next().charAt(0);

                if (m[i]<30 || m[i]>60) {
                    System.out.println("Valor de M inválido!");
                }
                if (l[i] != 'D' && l[i] != 'E') {
                    System.out.println("Valor de L inválido!");
                }
            } while (m[i]<30 || m[i]>60 || (l[i] != 'D' && l[i] != 'E'));
        }

        scan.close();

        Bota bota = new Bota(n, m, l);
    }
}