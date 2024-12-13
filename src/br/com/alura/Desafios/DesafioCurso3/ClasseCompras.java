package br.com.alura.Desafios.DesafioCurso3;

public class ClasseCompras implements Comparable<ClasseCompras> {
    String nome;
    double preco;

    public ClasseCompras(String nome, double i) {
        this.nome = nome;
        this.preco = i;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getNome() + " R$: "+getPreco();
    }

    @Override
    public int compareTo(ClasseCompras outraCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outraCompra.preco));
    }
}
