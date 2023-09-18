namespace JogoDaVelha {
    class Program {
        static void Main(string[] args) {
            Game jogo = new Game();

            while (!jogo.CheckWin("X") && !jogo.CheckWin("O") && !jogo.CheckStalemate("X", "O")) {
                jogo.Show();
                jogo.Play("X");

                if (jogo.CheckWin("X")) {
                    Console.WriteLine("\nX venceu!");
                    break;
                }
                if (jogo.CheckStalemate("X", "O")) {
                    Console.WriteLine("\nDeu Velha!");
                    break;
                }

                jogo.Show();
                
                jogo.Play("O");
                jogo.Show();

                if (jogo.CheckWin("O")) {
                    Console.WriteLine("\nO venceu!");
                    break;
                }
                if (jogo.CheckStalemate("X", "O")) {
                    Console.WriteLine("\nDeu Velha!");
                    break;
                }
            }
        }
    }
}