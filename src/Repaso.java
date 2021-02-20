public class Repaso {

    int a;
    int b;

    public Repaso() {
        a = 13;
        b = 4;
    }

    public Repaso(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int suma() {
        return a + b;
    }

    public int multiplicacion() {
        return a*b;
    }

    public double division () throws Exception {
        if (b == 0) {
            throw new Exception("No es un número");
        }
        else {
            return a/b;
        }
    }
}