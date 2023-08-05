package teste;
public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = 100;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void status() {
        System.out.println("Modelo:  " + this.getCarga());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta() + "mm");
        System.out.println("Carga: " + this.getCarga() + "%");
        System.out.println("Tampada: " + this.tampada);
    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Caneta tampada não rabisca!");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}