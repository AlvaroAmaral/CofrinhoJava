public class Iene extends Moeda {
    private static final double TAXA_CAMBIO = 0.033; // Taxa de câmbio JPY para BRL (exemplo)

    public Iene(double valor) {
        super(valor, "Iene", "JPY");
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