package metodo_12;

public class Exemplo01 { //nao é um metodo --> bloco de codigo

    static void main() { //metodo --> ()
        int x = 3, y = 5; //var local
        int resultado;
        resultado = somar(x,y); //argumento --> valores enviados para o metodo
        System.out.println(resultado);
        int resposta;
        resposta = subtrair(x,y);
        System.out.println("diferença = "+resposta);
    }
    static int somar(int x, int y) { //void --> metodo sem valor/retorno
        int resultado = x+y;
        return resultado;
    }
    static int subtrair(int x, int y) { //parametro --> var para receber os argumentos
        int resposta = x-y;
        return resposta;
    }

}
