package ex1;
public class FatorialController {
    public long calcularFatorial(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }
        if (numero > 20){
            throw new IllegalArgumentException("O número selecionado gera overflow."); //adicionado
        }
        return fatorial(numero);
    }

    private long fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
}
