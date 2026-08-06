package vetor_10;

import java.util.Scanner;

public class Exemplo01 {

    static void main() {
        int[] x = new int[5]; //capacidade
        Scanner sc = new Scanner(System.in); //memoria

        //código automatizado

        //entrada
        for(int i = 0; i < x.length; i++) { //i: indice
            System.out.print("Informe um valor ---> ");
            x[i] = sc.nextInt();
        }

        //saida
        for (int i = 0; i < x.length; i++) { //contador
            System.out.println(x[i]);
        }
    }
}

        /* código sem automatizacao
        //entrada
        for(int i = 0; i < 5; i++) { //i: indice
            System.out.print("Informe um valor ---> ");
            x[i] = sc.nextInt();
        }

        //saida
        for (int i = 0; i < 5; i++) { //contador
            System.out.println(x[i]);
        }*/

