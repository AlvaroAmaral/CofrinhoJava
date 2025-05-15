public class LibraEsterlina extends Moeda {
    private static final double TAXA_CAMBIO = 6.35; // Taxa de câmbio GBP para BRL (exemplo)

    public LibraEsterlina(double valor) {
        super(valor, "Libra Esterlina", "GBP");
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