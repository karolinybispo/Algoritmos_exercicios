package resolucao_exercicios_PDF;

import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Informe seu valor em reais: ");
	   float valorReais = scanner.nextFloat();

	   float dolar = 3.58f;
	   float valorDolares = valorReais / dolar;

	   System.out.println("voce pode gastar " + valorDolares + "dolares "  + " nos EUA!");
    }
}

