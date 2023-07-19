/* Crie uma classe chamada “ContaBancaria” com os atributos “saldo” e “numero”. Crie 
um método chamado “sacar” que recebe um valor e subtrai do saldo da conta bancária. */
#include <iostream>
#include <clocale>
#include <cwchar>

using namespace std;

class ContaBancaria {
    public:
        int numero;
        float saldo;

        void sacar() {
            float valor;
            cout << "Valor do saque: ";
            cin >> valor;
            saldo -= valor;
        }
        void mostrarDados() {
            wcout << L"Número da conta: " << numero << endl;
            wcout << L"Saldo disponível: " << saldo << endl;
        }
};

int main() {
    setlocale(LC_ALL, "Portuguese-Brazilian");

    ContaBancaria minha_conta;
    minha_conta.numero = 12456789;
    minha_conta.saldo = 54.83;
    minha_conta.mostrarDados();
    minha_conta.sacar();
    minha_conta.mostrarDados();


    return 0;
}