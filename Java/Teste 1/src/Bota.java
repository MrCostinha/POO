public class Bota {
    private int N; // número de botas
    private int M[] = new int[N]; // número do tamanho
    private char L[] = new char[N]; // lado do pé (D ou E)
    
    public Bota(int n, int m[], char l[]) {
        setN(n);
        setM(m);
        setL(l);

        FormarPares(n, m, l);
    }

    public int getN() {
        return N;
    }
    public void setN(int n) {
        N = n;
    }
    public int[] getM() {
        return M;
    }
    public void setM(int[] m) {
        M = m;
    }
    public char[] getL() {
        return L;
    }
    public void setL(char[] l) {
        L = l;
    }
    
    public void FormarPares(int n, int m[], char l[]) {
        int pares = 0;

        for (int i = 0; i < n; i++) {
            if (m[i] != 0) {
                for (int j = i+1; j < n; j++) {
                    if (m[i] == m[j] && l[i] != l[j]) {
                        pares++;
                        m[i] = 0;
                        m[j] = 0;
                        break;
                    }
                }
            }
        }

        System.out.println("\n" + pares);
    }
}