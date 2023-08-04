#include <iostream>
#include "Caneta.h"
#include <clocale>
#include <cwchar>

using namespace std;

int main() {
    setlocale(LC_ALL, "Portuguese-Brazilian");

    Caneta caneta1 = Caneta("Cis", "Azul e Branco", 0.7);
    caneta1.destampar();
    caneta1.rabiscar();
    caneta1.tampar();
    caneta1.status();

    return 0;
}