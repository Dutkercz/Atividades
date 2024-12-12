package br.com.alura.Desafios.DesafioCurso3;

public class Bagui {
    String nome;
    double preco;

    public Bagui(String nome, double i) {
        this.nome = nome;
        this.preco = i;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getNome() + " R$: "+getPreco();
    }
}
