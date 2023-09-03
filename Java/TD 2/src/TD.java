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
                System.out.print("Primeiro valor: ");
                float valor1 = scanner.nextFloat();
                System.out.print("Segundo valor: ");
                float valor2 = scanner.nextFloat();
                System.out.print("Operação: ");
                char operacao = scanner.next().charAt(0);

                switch (operacao) {
                    case '+':
                        System.out.println("Soma: " + (valor1+valor2));
                        break;
                    case '-':
                        System.out.println("Subtração: " + (valor1-valor2));
                        break;
                    case '*':
                        System.out.println("Multiplicação: " + (valor1*valor2));
                        break;
                    case '/':
                        if (valor2 == 0) {
                            System.out.println("Erro! Divisão por zero");
                            break;
                        }
                        System.out.println("Divisão: " + (valor1/valor2));
                        break;
                    default:
                        System.out.println("Operação inválida!");
                }
                break;
            case 2:
                System.out.print("Quantidade: ");
                int tamanho = scanner.nextInt();
                int inteiros[] = new int[tamanho];
                int pares = 0, impares = 0, positivos = 0, negativos = 0, neutros = 0;

                for (int i = 0; i < tamanho; i++) {
                    System.out.print("Valor " + (i+1) + ": ");
                    inteiros[i] = scanner.nextInt();
                }
                for (int i = 0; i < tamanho; i++) {
                    if (inteiros[i] > 0) {
                        positivos++;
                        if (inteiros[i] % 2 == 0) {
                            pares++;
                        } else {
                            impares++;
                        }
                    } else if (inteiros[i] < 0) {
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
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                int elementos[] = new int[quantidade];
                int maior = 0;

                for (int i = 0; i < quantidade; i++) {
                    elementos[i] = random.nextInt();
                }
                for (int i = 1; i < quantidade; i++) {
                    if (elementos[i] > elementos[maior]) {
                        maior = i;
                    }
                }

                System.out.println("Maior: " + elementos[maior]);
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
