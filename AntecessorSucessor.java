import java.awt.*;
import java.util.Scanner;

/* programa informa o antessessor e sucessor de um numero
* */
    public class AntecessorSucessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um numero: ");
        int numero = scanner.nextInt();

        System.out.println( "O numero: " + numero + " -  Seu sucessor: " + (numero + 1) + " - Seu antecessor: " + (numero - 1));
    }
}
