#include <iostream>
#include <string>

using namespace std;

class Caneta {
    private:
        bool tampada;
    protected:
        int carga;
    public:
        string modelo;
        string cor;
        float ponta;

        Caneta(string modelo, string cor, float ponta) {
            this->modelo = modelo;
            this->cor = cor;
            this->ponta = ponta;
            this->carga = 100;
            this->tampar();
        }

        string getModelo() {
            return modelo;
        }
        void setModelo(string modelo) {
            this->modelo = modelo;
        }
        string getCor() {
            return cor;
        }
        void setCor(string cor) {
            this->cor = cor;
        }
        float getPonta() {
            return ponta;
        }
        void setPonta(float ponta) {
            this->ponta = ponta;
        }
        int getCarga() {
            return carga;
        }
        void setCarga(int carga) {
            this->carga = carga;
        }

        void rabiscar() {
            if (this->tampada) {
                cout << "Caneta tampada não rabisca!" << endl;
            } else {
                cout << "Rabiscando..." << endl;
            }
        }
        void status() {
            cout << "Modelo: " << this->modelo << endl;
            cout << "Cor: " << this->cor << endl;
            cout << "Ponta: " << this->ponta << "mm" << endl;
            cout << "Carga: " << this->carga << "%" << endl;
            cout << "Tampada: " << this->tampada << endl;
        }
        void tampar() {
            this->tampada = true;
        }
        void destampar() {
            this->tampada = false;
        }
};