import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Crie um programa que receba um número inteiro e exiba a tabuada desse número (de 1 a 10).
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: " );
        int numero = teclado.nextInt(); // lê a atribui o que recebeu a numero   

        teclado.close();
        
        for(int i = 0; i <= 10; i++){
            System.out.println("Numero " + numero + "x" + i + "=" + numero * i);
        }

    }


}
