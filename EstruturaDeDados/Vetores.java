package EstruturaDeDados;

import java.util.Scanner;

public class Vetores {
    
    public static void main(String[] args) {
        
    //declarando vetor inteiro de 10 posicoes
    int[] vetor = new int[2];

    Scanner scanner = new Scanner(System.in);

    //leia os valores informados pelo usuario
    for (int i=0; i<vetor.length; i++){            
        System.out.println("digite um valor");
        vetor[i] = scanner.nextInt();
        }

        scanner.close(); 

        //valores mostradados na ordem que foram inseridos
        System.out.println("Valores: ");
        for(int i=0; i<vetor.length; i++){
        System.out.println(vetor[i]);
       }
    
    //mostrando valores invertidos
    for (int i = vetor.length - 1; i >= 0; i--){ //vetor.length informa o tamanho que tem o vetor, ou seja, a qutd de incides. Vetor.lenght - 1, vai pegar o tamanho do indice e diminuir por 1, ou seja, vai para o ultima posicao do vetor. Pois o tamanho do vetor esta sempre ua menos do seu tamanho, se ele tem tamanho 10, ha 9 indices. Logo, tamanho do vetor é 10 mas quero ir para o ultimo indice que é 0 9, 10 - 9 e assim inicia no ultimo indice. 
        System.out.println("valor invertido: " + vetor[i]);
        }
    

    }
}
