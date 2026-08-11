package vetor_10;

import java.util.Random;

public class Exercicio03_Pseudoaleatorios {

    static void main() {

        Random random = new Random();
        double[] nota = new double[4];
        //double media = new double [10];

        for (int i = 0; i < nota.length; i++){
            System.out.println("Valor da nota ---> ");
            nota[i] = random.nextDouble(10);


        }
    }
}



