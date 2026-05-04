package resolucao_exercicios_PDF;

import java.util.Scanner;

/**
 * Faça um algoritmo que leia a largura e altura de uma parede,
 * calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */
public class CalculaTinta {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Informe a largura da área a ser pintada ");
	   int largura = scanner.nextInt();

	   System.out.println("Informe a altura da área a ser pintada ");
	   int altura = scanner.nextInt();

	   int area = altura * largura;

	   int tinta = 1;

	   int tintaRendePorMetro = 2;

	   int quantidadeTinta = (tinta * area) / tintaRendePorMetro;

	   System.out.println("a área da sua parede é de " + area + " metros." + " Sua parede " + " precisa de " + quantidadeTinta + " L de tinta ");
    }
}
