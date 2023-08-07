public class Tema {
    public List<string> Palavras { get; set; }

    public Tema(List<string> palavras) {
        Palavras = palavras;
    }
}
public class Forca {
    private Tema frutas;
    private Tema animais;
    private Tema cores;
    private Tema geografia;
    private Tema esportes;

    private List<char> letrasChutadas;
    private List<string> palavrasChutadas;
    private int erros;
    private int temaSorteado;
    private string palavraSorteada;
    private string progresso;

    private Random random;

    public Forca() {
        frutas = new Tema(new List<string> { "abacaxi", "jaca", "tanjerina", "acerola", "melancia", "banana", "uva", "laranja", "manga", "morango" });
        animais = new Tema(new List<string> { "cachorro", "gato", "tigre", "jabuti", "coelho", "bode", "tucano", "papagaio", "macaco", "girafa" });
        cores = new Tema(new List<string> { "laranja", "verde", "preto", "branco", "marrom", "azul", "vermelho", "amarelo", "roxo", "rosa" });
        geografia = new Tema(new List<string> { "brasil", "russia", "india", "china", "egito", "mexico", "argentina", "colombia", "uruguai", "paraguai" });
        esportes = new Tema(new List<string> { "futebol", "volei", "ciclismo", "calistenia", "canoagem", "basquete", "tenis", "natacao", "handebol", "atletismo" });  
        
        random = new Random();
        letrasChutadas = new List<char>();
        palavrasChutadas = new List<string>();
        erros = 0;
        palavraSorteada = "";
        progresso = "";
    }

    public void Jogar() {
        while (true) {
            Console.Write("\nJogar? (S/N): ");
            char opcao = Console.ReadKey().KeyChar;
            Console.WriteLine();
            
            if (opcao == 's' || opcao == 'S') {
                Console.WriteLine("Bem-Vindo ao Jogo da Forca!");
                IniciarJogo();
            } else if (opcao == 'n' || opcao == 'N') {
                Console.WriteLine("Saindo...");
                break;
            } else {
                Console.WriteLine("Opção Inválida!");
            }
        }
    }

    public void IniciarJogo() {
        temaSorteado = random.Next(5);

        switch (temaSorteado) {
            case 0:
                Console.WriteLine("Tema: Frutas");
                palavraSorteada = ObterPalavraAleatoria(frutas);
                break;
            case 1:
                Console.WriteLine("Tema: Animais");
                palavraSorteada = ObterPalavraAleatoria(animais);
                break;
            case 2:
                Console.WriteLine("Tema: Cores");
                palavraSorteada = ObterPalavraAleatoria(cores);
                break;
            case 3:
                Console.WriteLine("Tema: Geografia");
                palavraSorteada = ObterPalavraAleatoria(geografia);
                break;
            case 4:
                Console.WriteLine("Tema: Esportes");
                palavraSorteada = ObterPalavraAleatoria(esportes);
                break;
        }

        progresso = new string('_', palavraSorteada.Length);
            
        Console.WriteLine(palavraSorteada.Length + " letras\n");

        while (erros < 6) {
            Console.WriteLine("Palavra: " + progresso);
            Console.Write("\nL para chutar uma letra ou P para chutar a palavra: ");
            char opcao = Console.ReadKey().KeyChar;
            Console.WriteLine();

            switch (opcao) {
                case 'l':
                    char chute_letra = ChutarLetra();
                    VerificaLetra(chute_letra);
                    break;
                case 'p':
                    Console.Write("Palavra: ");
                    string chute_palavra = Console.ReadLine();
                    VerificaPalavra(chute_palavra);
                    break;
                default:
                    Console.WriteLine("Opção Inválida!");
                    break;
            }

           PrintLetras();
           PrintPalavras();
           PrintForca(erros);

            if (progresso == palavraSorteada) {
                Console.WriteLine("Parabéns! Você acertou a palavra: " + palavraSorteada);
                break;
            } else if (erros == 6) {
                Console.WriteLine("Você perdeu! A palavra era: " + palavraSorteada);
                break;
            }
        }
    }

    private string ObterPalavraAleatoria(Tema tema) {
        int index = random.Next(tema.Palavras.Count);

        return tema.Palavras[index];
    }

    private char ChutarLetra() {
        char letra;

        Console.Write("Letra: ");

        while (true) {
            letra = Console.ReadKey().KeyChar;

            Console.WriteLine();
            if (letrasChutadas.Contains(letra)) {
                Console.Write("Você já chutou essa letra! Tente outra: ");
            } else {
                letrasChutadas.Add(letra);
                break;
            }
        }
        return letra;
    }

    private void VerificaLetra(char chute) {
        bool acertou = false;

        for (int i = 0; i < palavraSorteada.Length; i++) {
            if (palavraSorteada[i] == chute) {
                progresso = progresso.Substring(0, i) + chute + progresso.Substring(i+1);
                acertou = true;
            }
        }
        if (!acertou) {
            erros++;
        }
    }

    private void VerificaPalavra(string chute) {
        if (palavraSorteada == chute) {
            progresso = palavraSorteada;
        } else {
            erros++;
        }
    }

    private void PrintLetras() {
        Console.Write("Letras chutadas: ");
        foreach (char letra in letrasChutadas) {
            Console.Write(letra + " ");
        }
        Console.WriteLine();
    }

    private void PrintPalavras() {
        Console.Write("Palavras chutadas: ");
        foreach (string palavra in palavrasChutadas) {
            Console.Write(palavra + " ");
        }
        Console.WriteLine();
    }

    private void PrintForca(int erros) {
        switch (erros) {
            case 0:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 1:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 2:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine("  |  |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 3:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine(" /|  |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 4:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine(" /|\\ |");
                Console.WriteLine("     |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 5:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine(" /|\\ |");
                Console.WriteLine(" /   |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
            case 6:
                Console.WriteLine("  ____");
                Console.WriteLine("  |  |");
                Console.WriteLine("  O  |");
                Console.WriteLine(" /|\\ |");
                Console.WriteLine(" / \\ |");
                Console.WriteLine("     |");
                Console.WriteLine("_____|____");
                break;
        }
    }
}