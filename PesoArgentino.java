public class PesoArgentino extends Moeda {
    private static final double TAXA_CAMBIO = 0.006; // Taxa de câmbio ARS para BRL (exemplo)

    public PesoArgentino(double valor) {
        super(valor, "Peso Argentino", "ARS");
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