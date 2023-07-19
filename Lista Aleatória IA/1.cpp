/* Crie uma classe chamada “Pessoa” com os atributos “nome” e “idade”. Crie 
um método chamado “mostrarDados” que imprime o nome e a idade da pessoa. */
#include <iostream>

using namespace std;

class Pessoa {
    public:
        string nome;
        int idade;

        void mostrarDados() {
            cout << "Nome: " << nome << endl;
            cout << "Idade: " << idade << " anos" << endl;
        }
};

int main() {
    Pessoa eu;
    eu.nome = "Matheus Costa";
    eu.idade = 21;
    eu.mostrarDados();

    return 0;
}