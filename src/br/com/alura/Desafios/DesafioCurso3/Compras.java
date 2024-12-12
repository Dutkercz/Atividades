package br.com.alura.Desafios.DesafioCurso3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Bagui> listaDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão:");
        double limite = leitor.nextInt();
        System.out.println("Você informou o limite de :"+limite);

        while (true){
            System.out.println("O que deseja fazer:" +
                    "\n 1 - Comprar." +
                    "\n 2 - Sair");

            int opcao = leitor.nextInt();

            if (opcao == 1){

                System.out.println("Digite a descrição da compra: ");
                String compra;
                compra = leitor.next();

                System.out.println("Digite o valor:");
                double valor = leitor.nextDouble();

                if (valor <= limite){
                    Bagui precoValor = new Bagui(compra, valor);
                    listaDeCompras.add(precoValor);
                    limite-=valor;
                    System.out.printf("%s adicionado a lista de compras.\n", compra);
                    System.out.println("Seu novo limite é: "+ limite);
                }
                else {
                    System.out.println("Você não tem limite para essa compra");
                    System.out.println("Seu limite é "+limite);
                }

            } else if (opcao == 2) {
                break;
            }

        }
        System.out.println("Sua Lista de compras");
        System.out.println(listaDeCompras.getFirst());
    }
}
