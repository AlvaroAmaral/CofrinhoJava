public class Euro extends Moeda {
    private static final double TAXA_CAMBIO = 5.45; // Taxa de câmbio EUR para BRL (exemplo)

    public Euro(double valor) {
        super(valor, "Euro", "EUR");
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