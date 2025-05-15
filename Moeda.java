public abstract class Moeda {
    protected double valor;
    protected String nome;
    protected String simbolo;

    public Moeda(double valor, String nome, String simbolo) {
        this.valor = valor;
        this.nome = nome;
        this.simbolo = simbolo;
    }

    // Método abstrato para converter o valor para Real
    public abstract double converterParaReal();

    @Override
    public abstract String toString();

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
} 