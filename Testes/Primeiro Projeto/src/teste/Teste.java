package teste;
public class Teste {
    public static void main(String[] args) throws Exception {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Cis Spiro";
        caneta1.cor = "Azul e Branco";
        caneta1.ponta = 0.7f;
        caneta1.carga = 70;
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();
    }
}