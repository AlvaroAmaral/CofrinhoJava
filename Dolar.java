public class Dolar extends Moeda {
    private static final double TAXA_CAMBIO = 5.03; // Taxa de câmbio USD para BRL (exemplo)

    public Dolar(double valor) {
        super(valor, "Dólar", "USD");
    }

    @Override
    public double converterParaReal() {
        return valor * TAXA_CAMBIO;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f (BRL %.2f)", getSimbolo(), getValor(), converterParaReal());
    }
} 