import java.util.Scanner;

public class MMC {
    public static void main(String[] args) {

        var a = 1;
        var b = 1;
        int menor;
        int maior;
        int mdc = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1° valor.");
        a = scan.nextInt();
        System.out.println("Digite o 2° valor.");
        b = scan.nextInt();

        // calcular o menor numero
        if (a < b){
            menor = a;
            maior = b;
        }else {
            menor = b;
            maior = a;
        }

        //calcular MDC

        for (int i = 1; i <= maior ; i++) {
            if (maior % i == 0 && menor % i == 0){
                mdc = i;
            }
        }
        //Com o MDC calculamos o MMC
        int mmc = (a*b) / mdc;
        System.out.printf("O MMC de %d e %d é %d", a, b, mmc);
    }
}
