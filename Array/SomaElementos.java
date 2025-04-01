
package Array;

//import java.util.Scanner;

public class SomaElementos {

        public static void main(String[] args) {
            

           /* int[] vetor = new int[5];
            int soma = 0;
            
            Scanner s = new Scanner(System.in);

            for(int i = 0; i < vetor.length; i++){
                System.out.println("digite um valor:");
                vetor[i] = s.nextInt();   
                soma = soma + vetor[i];
            }
            s.close();
             System.out.println(soma);  */

           int[] vetor = { 1,2,2,0,0};
           int soma = 0;

           for(int i = 0; i<vetor.length; i++){
            soma = vetor[i] + soma;
           }
           System.out.println(soma);
           
        }

    
}