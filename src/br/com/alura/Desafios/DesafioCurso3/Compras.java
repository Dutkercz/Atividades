package br.com.alura.Desafios.DesafioCurso3;

import java.util.*;

public class Compras{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<ClasseCompras> listaDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão:");
        double limite = leitor.nextInt();
        System.out.println("Você informou o limite de :"+limite);

        while (true){
            System.out.println("""
                    O que deseja fazer:\
                    
                     1 - Comprar.\
                    
                     2 - Sair""");

            int opcao = leitor.nextInt();

            if (opcao == 1){

                System.out.println("Digite a descrição da compra: ");
                String compra;
                compra = leitor.next();

                System.out.println("Digite o valor:");
                double valor = leitor.nextDouble();

                if (valor <= limite){
                    ClasseCompras precoValor = new ClasseCompras(compra, valor);
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
            else{
                System.out.println("Opção Inválida!");
            }

        }
        //Ordenando a lista pelo valor inteiro.
        //pode utilizar nomeDaLista.sorte(nomeDaLista, new Comparator<NomeDaClasse>(){}

        Collections.sort(listaDeCompras, new Comparator<ClasseCompras>() {
            @Override
            public int compare(ClasseCompras i1, ClasseCompras i2) {
                return Integer.compare((int) i1.preco, (int) i2.preco);//cast de double p/ int - comprando pelo valor
            }
        });
        System.out.println("Sua Lista de compras");
        for (ClasseCompras listaDeCompra : listaDeCompras) {
            System.out.println("Produto:" + listaDeCompra);

        }
     }
}
