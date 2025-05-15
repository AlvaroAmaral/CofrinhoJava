public class FrancoSuico extends Moeda {
    private static final double TAXA_CAMBIO = 5.70; // Taxa de câmbio CHF para BRL (exemplo)

    public FrancoSuico(double valor) {
        super(valor, "Franco Suíço", "CHF");
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