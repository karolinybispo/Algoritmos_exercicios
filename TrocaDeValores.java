


//Algoritmo que realize a troca de valores entre as variaveis apenas com atribuicoes entre as variaveis (apenas trocar o valor de uma pela outra sem realizar algo adicional, como operacao, funcao, etc)

public class TrocaDeValores {
 
    public static void main(String[] args) {
        int letraA = 10;
        int letraB = 20;
        int letra;
    
        letra = letraA;
        letraA = letraB;
        letraB = letra;

        System.out.println("Valor de A era 10, agora é: " + letraA  + "." + " Valor de B era 20, agora é: " + letraB );
    }
}