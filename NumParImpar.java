

public class NumParImpar {

    public static void main(String[] args) {
        //Escreva um programa que percorra os números de 1 a 100 e exiba quais são pares e quais são ímpares.
        for(int i=0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println("par" + i);
            }
            else 
            System.out.println("impar" + i);
        
        }
    }
}