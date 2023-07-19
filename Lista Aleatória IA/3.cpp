/* Crie uma classe chamada “Circulo” com o atributo “raio”. Crie 
um método chamado “calcularArea” que retorna a área do círculo. */
#include <iostream>
#include <clocale>
#include <cwchar>

using namespace std;

class Circulo {
    public:
        float raio;

        float calculaArea() {
            return (3.14159 * (raio*raio));
        }
        void mostrarDados() {
            wcout << L"Raio do círculo: " << raio << " m" << endl;
            wcout << L"Área do círculo: " << calculaArea() << " m" << endl;
        }
};

int main() {
    setlocale(LC_ALL, "Portuguese-Brazilian");

    Circulo circulo1;
    circulo1.raio = 2.5;
    circulo1.mostrarDados();

    return 0;
}