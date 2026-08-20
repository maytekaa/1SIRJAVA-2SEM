package vetor_10;

import java.util.Random;

public class Exercicio09 {

    static void main() {
        Random random = new Random();
        int[] x = new int[random.nextInt(3,15)];
        boolean achou;

        for (int i = 0; i < x.length;){
            x[i] = random.nextInt(15);
            achou = false;
            for (int j = 0; j < i; j++){
                if (x[i] == x[j]) {
                    achou = true;
                    break;
                }
            }

            if (achou == false) {
                System.out.print(x[i] + "\t");
                i++;
            }
        }
    }
}
