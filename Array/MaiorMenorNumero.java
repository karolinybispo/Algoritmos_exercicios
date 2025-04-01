package Array;
public class MaiorMenorNumero {
    
    public static void main(String[] args) {
        
        int[] array = {150, 8, 22, 0, 10};

        int maior = array[0];
        int menor = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] < menor){
                menor = array[i]; 
            }

            if (array[i] > maior){
                maior = array[i];
            }
        }
        System.out.println("menor " + menor);
        System.out.println("maior " + maior);

    }
}
