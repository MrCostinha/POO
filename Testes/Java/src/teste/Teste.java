package teste;
public class Teste {
    public static void main(String[] args) throws Exception {
        Caneta caneta1 = new Caneta("Cis Spiro", "Azul e Branco", 0.7f);
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.tampar();
        caneta1.status();
    }
}