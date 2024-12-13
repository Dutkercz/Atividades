public class MMC {
    public static void main(String[] args) {

        var a = 2;
        var b = 1;
        int menor;
        int maior;
        int mdc = 0;

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
