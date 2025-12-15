package resolucao_exercicios_PDF;

import java.util.Scanner;

public class NumeroReal {

    /*
	Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
    Ex:
    Digite um número: 3.5
    O dobro de 3.5 é 7.0
    A terça parte de 3.5 é 1.16666
	*/
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);


	   System.out.println("Digite um numero real");
	   float numeroReal = scanner.nextFloat();

	   scanner.close();

	   float dobroNumeroReal = numeroReal * 2;
	   float tercaParteNumeroReal = numeroReal / 3;

	   System.out.println("dobro do numero é: " + dobroNumeroReal + " terca parte do numero " + tercaParteNumeroReal);
    }

    }





