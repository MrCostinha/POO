namespace JogoDaVelha {
    class Program {
        static void Main(string[] args) {
            Game jogo = new Game();

            while (!jogo.CheckWin("X") && !jogo.CheckWin("O") && !jogo.CheckStalemate("X", "O")) {
                jogo.Show();
                jogo.Play("X");
                jogo.Show();

                if (jogo.CheckWin("X")) {
                    Console.WriteLine("Jogador 1: X venceu!");
                    break;
                }
                if (jogo.CheckStalemate("X", "O")) {
                    Console.WriteLine("Deu Velha!");
                    break;
                }

                jogo.Show();
                jogo.Play("O");
                jogo.Show();

                if (jogo.CheckWin("O")) {
                    Console.WriteLine("Jogador 2: O venceu!");
                    break;
                }
                if (jogo.CheckStalemate("X", "O")) {
                    Console.WriteLine("Deu Velha!");
                    break;
                }
            }
        }
    }
}