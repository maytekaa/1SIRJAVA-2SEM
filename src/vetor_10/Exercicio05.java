package vetor_10;

import java.util.Random;

public class Exercicio05 {

    static void main() {
        Random random = new Random();
        int[] x = new int[8];
        int aux, j;

        //geração e impressão dos valores
        System.out.println("Antes da inversão: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(1, 30);
            System.out.print(x[i] + "  ");
        }

        //inversão dos valores
        j = x.length - 1;
        for (int i = 0; i < x.length / 2; i++, j--) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
        }

        //impressão após inversão
        System.out.println("\nApós a inversão");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
    }
}
