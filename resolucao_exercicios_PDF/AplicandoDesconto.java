package resolucao_exercicios_PDF;

import java.util.Scanner;

public class AplicandoDesconto {

    public static void main(String[] args) {

	   Scanner scanner = new Scanner(System.in);

	   System.out.println("Insira o valor do desconto");
	   float valorDoDesconto = scanner.nextInt();

	   float valorDaPeca = 500f;
	   System.out.println("Aplicando desconto: ");
	   float desconto = valorDaPeca * (valorDoDesconto / 100);
	   float valorFinal = valorDaPeca - desconto;
	   System.out.printf(
			 "O total da compra %.3f com %.2f%% ficou: %.3f%n",
			 valorDaPeca,
			 valorDoDesconto,
			 valorFinal
	   );
    }
}
