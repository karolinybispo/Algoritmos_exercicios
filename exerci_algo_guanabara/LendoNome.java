package exerci_algo_guanabara;

import java.util.Scanner;

/*
leia o nome de uma pessoa e mostre uma mensagem de boas- vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */
public class LendoNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        String message = " é um prazer te conhecer!";

        scanner.close();

        
        System.out.println("Olá " + name + message);
    }
}
