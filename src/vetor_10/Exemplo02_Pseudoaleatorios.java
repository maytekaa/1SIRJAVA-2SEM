package vetor_10;

import java.util.Random;

public class Exemplo02_Pseudoaleatorios {

    static void main() {

        Random random = new Random();
        double y;

        //x = random.nextInt(); ---> seleciona um número a partir da capacidade inteira da memória, considerando negstivos e positivos
        //x = random.nextInt(50); ---> seleção limitada (de 0 até 49), não gera números negativos e limita-se até um número antes do limite
        //x = random.nextInt(10, 20); ---> de 10 a 19
        y = random.nextDouble();

        System.out.println(y);
    }
}
