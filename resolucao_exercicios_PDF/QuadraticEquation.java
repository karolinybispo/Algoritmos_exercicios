package resolucao_exercicios_PDF;
/**
 * 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.
 */
public class QuadraticEquation {

    double a, b, c;

    public double deltaCalculation(double a, double b, double c) {
	   if (a == 0) {
		  throw new IllegalArgumentException(Message.MSG_É_0);
	   }
	   double delta = (b * b) - 4 * (a) * (c);
	   return delta;
    }
}
