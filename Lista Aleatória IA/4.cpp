/* Crie uma classe chamada “Retangulo” com os atributos “base” e “altura”. Crie 
um método chamado “calcularArea” que retorna a área do retângulo. */
#include <iostream>
#include <clocale>
#include <cwchar>

using namespace std;

class Retangulo {
    public:
        float base, altura;

        float calculaArea() {
            return base*altura;
        }
        void mostrarDados() {
            wcout << L"Base do retângulo: " << base << " m" << endl;
            wcout << L"Altura do retângulo: " << altura << " m" << endl;
            wcout << L"Área do retângulo: " << calculaArea() << " m" << endl;
        }
};

int main() {
    setlocale(LC_ALL, "Portuguese-Brazilian");

    Retangulo retangulo1;
    retangulo1.base = 2.5;
    retangulo1.altura = 4.3;
    retangulo1.calculaArea();
    retangulo1.mostrarDados();

    return 0;
}