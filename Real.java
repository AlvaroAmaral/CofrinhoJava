public class Real extends Moeda {
    public Real(double valor) {
        super(valor, "Real", "R$");
    }

    @Override
    public double converterParaReal() {
        return valor; // Como já está em Real, retorna o próprio valor
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", getSimbolo(), getValor());
    }
} 