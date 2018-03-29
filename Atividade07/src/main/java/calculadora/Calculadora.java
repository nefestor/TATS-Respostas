package calculadora;

/**
 *
 * @author andreendo
 */
class Calculadora {
    int num1, num2;
    int res;
    String mensagem;
    
    void entrarNumero01(int num) {
        num1 = num;
    }

    void entrarNumero02(int num) {
        num2 = num;
    }

    void adicionar() {
        res = num1 + num2;
    }
    void subtrair() {
        res = num1 - num2;
    }
    void multiplicar() {
        res = num1 * num2;
    }

    int getResultado() {
        return res;
    }

    void dividir() {
        if(num2 == 0) {
            res = -1;
            mensagem = "erro: divisao por zero";
        }
        else
            res = num1 / num2;
          
    }

    String getMensagem() {
        return mensagem;
    }
    
}
