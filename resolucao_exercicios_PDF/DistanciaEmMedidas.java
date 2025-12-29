package resolucao_exercicios_PDF;

import java.util.Scanner;

/**
 *  Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185.72
 * 6) Faça um programa
 * sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 * A distância de 85.7m corresponde a: 0.18572Km
 * 1.8572Hm
 * 18.572Dam
 * 1857.2dm
 * 18572.0cm
 * 185720.0mm
 */
public class DistanciaEmMedidas {
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Digite a distancia em metros");
	   float distanciaMetros = scanner.nextFloat();

	   //distancia em KM
	   float distanciaKM = distanciaMetros / 1000;
	   float distanciaHm = distanciaMetros / 100;
	   float distanciaDam = distanciaMetros / 10;
	   float distanciaDm = distanciaMetros * 10;
	   float distanciaCm = distanciaMetros * 100;
	   float distanciaMm = distanciaMetros * 1000;

	   System.out.printf("Distância em metros transformada em:\n" +
				    "KM: %.2f\n" +
				    "HM: %.2f\n" +
				    "DAM: %.2f\n" +
				    "DM: %.2f\n" +
				    "CM: %.2f\n" +
				    "MM: %.2f\n",
			 distanciaKM, distanciaHm, distanciaDam,
			 distanciaDm, distanciaCm, distanciaMm);

    }
}

