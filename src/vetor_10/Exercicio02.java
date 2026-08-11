package vetor_10;

import java.util.Scanner;

public class Exercicio02 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int par = 0;

        for (int i = 0; i < x.length; i++){
            System.out.print("Informe um valor ---> ");
            x[i] = sc.nextInt();

            if (x[i] % 2 == 0) {
                par++;
            }
        }

        System.out.print("Quantidade de pares é "+par+" e a quantidade de impares é "+ (x.length - par));
    }
}
