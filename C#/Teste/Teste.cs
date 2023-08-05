using System;

namespace Teste {
    class Program {
        static void Main(string[] args) {
            Caneta caneta1 = new Caneta("Cis", "Azul e Branco", 0.7f);
            caneta1.Destampar();
            caneta1.Rabiscar();
            caneta1.Tampar();
            caneta1.Status();
        }
    }
}