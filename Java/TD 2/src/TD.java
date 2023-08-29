import java.util.Scanner;
import java.util.Random;

public class TD {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Questão: ");
        int questao = scanner.nextInt();

        switch (questao) {
            case 1:
                System.out.print("X: ");
                float x = scanner.nextFloat();
                System.out.print("Y: ");
                float y = scanner.nextFloat();
                System.out.print("Operação: ");
                char operacao = scanner.next().charAt(0);

                switch (operacao) {
                    case '+':
                        System.out.println("Soma: " + (x+y));
                        break;
                    case '-':
                        System.out.println("Subtração: " + (x-y));
                        break;
                    case '*':
                        System.out.println("Multiplicação: " + (x*y));
                        break;
                    case '/':
                        if (y == 0) {
                            System.out.println("Erro! Divisão por zero");
                            break;
                        }
                        System.out.println("Divisão: " + (x/y));
                        break;
                    default:
                        System.out.println("Operação inválida!");
                }
                break;
            case 2:
                System.out.print("N: ");
                int N2 = scanner.nextInt();
                int A2[] = new int[N2];
                int pares = 0, impares = 0, positivos = 0, negativos = 0, neutros = 0;

                for (int i = 0; i < N2; i++) {
                    A2[i] = scanner.nextInt();
                }
                for (int i = 0; i < N2; i++) {
                    if (A2[i] > 0) {
                        positivos++;
                        if (A2[i] % 2 == 0) {
                            pares++;
                        } else {
                            impares++;
                        }
                    } else if (A2[i] < 0) {
                        negativos++;
                    } else {
                        neutros++;
                        pares++;
                    }
                }

                System.out.println("Pares: " + pares);
                System.out.println("Ímpares: " + impares);
                System.out.println("Positivos: " + positivos);
                System.out.println("Negativos: " + negativos);
                System.out.println("Neutros: " + neutros);
                break;
            case 3:
                System.out.print("N: ");
                int N3 = scanner.nextInt();
                int A3[] = new int[N3];
                int maior = 0;

                for (int i = 0; i < N3; i++) {
                    A3[i] = random.nextInt();
                }
                for (int i = 1; i < N3; i++) {
                    if (A3[i] > A3[maior]) {
                        maior = i;
                    }
                }

                System.out.println("Maior: " + A3[maior]);
                break;
            case 4:
                String senha;

                do {
                    System.out.print("Senha: ");
                    senha = scanner.next();

                    if (senha.equals("a76dk09")) {
                        System.out.println("ACESSO PERMITIDO");
                    } else {
                        System.out.println("SENHA INVÁLIDA");
                    }
                } while (senha.equals("a76dk09") == false);
                break;
            case 5:
                float X, S, somaM = 0, somaD = 0;

                System.out.println("n: ");
                int N5 = scanner.nextInt();
                
                float[] v = new float[N5];
                for (int i = 0; i < N5; i++) {
                    v[i] = scanner.nextFloat();
                }
                
                for (int i = 0; i < N5; i++) {
                    somaM += v[i];
                }
                X = somaM/N5;

                for (int i = 0; i < N5; i++) {
                    somaD += (float) Math.pow(v[i] - X, 2);
                }
                S = (float) Math.sqrt(somaD/(N5-1));

                System.out.println("Média: " + X);
                System.out.println("Desvio padrão: " + S);
                break;
            default:
                System.out.println("Questão inválida!");
        }

        scanner.close();
    }
}
