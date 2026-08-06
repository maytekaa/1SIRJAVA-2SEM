package vetor_10;

import java.util.Scanner;

public class Exercicio01 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for(int i = 0 ; i < x.length; i++) {
        System.out.print("Informe um valor ---> ");
        x[i] = sc.nextInt();
        }

        //localizar o maior valor
        for(int i = 0; i < x.length; i++) {
            if (x[i] > maior){
                maior = x[i];
            }

            if (x[i] < menor){
                menor = x[i];
            }
        }

        System.out.print("O maior valor é "+ maior +" e o menor valor é "+ menor);

    }
}
