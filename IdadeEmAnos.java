import java.util.Scanner;

public class IdadeEmAnos {
    
    // In this algorithm, read the age in years, mouths, and days. 
    //Then write the age in days. Consider a year as 365 days and a mouth as 30 days. 
    
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

    //close the Scanner
    leia.close();
}

}
