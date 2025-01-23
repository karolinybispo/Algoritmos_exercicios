import java.util.Scanner;

public class IdadeEmAnos {
    
    // In this algoritmo, read the age in years, mouth and days. After write the age just in numbers. Consider the year with 365 days and mouth with 30 days. 
    
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    //receiving values
    System.out.print("digite sua idade em anos: ");
    int anos = leia.nextInt();

    System.out.print("digite os meses: ");
    int meses = leia.nextInt();

    System.out.print("digite os dias: ");
    int dias = leia.nextInt();

    //Calculation of years and months & variable receiving value.
    int anosEmDias = anos * 365;
    int mesesEmDias = meses * 30;
    int idadeEmDias = anosEmDias + mesesEmDias + dias;

    //informing age in days
    System.out.println("sua idade em dias: " + idadeEmDias);
}

}
