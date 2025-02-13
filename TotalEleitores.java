import java.util.Scanner;

public class TotalEleitores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o numero total de eleitores: ");
        double eleitores = scanner.nextDouble();

        System.out.print("numero de votos brancos: ");
        double votoBranco = scanner.nextDouble();

        System.out.print("numero de votos nulos: ");
        double votoNulo = scanner.nextDouble();

        System.out.print("numero de votos validos: ");
        double votoValido = scanner.nextDouble();

        scanner.close();

        //calculo
        double percValido = (votoValido / eleitores) * 100;
        double percNulo = (votoNulo / eleitores) * 100;
        double percBranco = (votoBranco / eleitores) * 100;

        // Saída formatada com duas casas decimais
        System.out.printf("Representa %.2f%% de votos válidos em relação ao total de eleitores.\n", percValido);
        System.out.printf("Representa %.2f%% de votos nulos em relação ao total de eleitores.\n", percNulo);
        System.out.printf("Representa %.2f%% de votos brancos em relação ao total de eleitores.\n", percBranco);
    }

        // O total de eleitores fica no divisor pois é o todo, no dividendo deve estar A PARTE do todo que eu quero medir (ex: branco: 30, eleitores: 100 -> 30 / 100). Quero saber quanto essa PARTE do todo representa no todo, logo parte eh dividida pelo todo
        // * Alterei o tipo das variaveis para double. Estava usando int e ao caulcular o resultado era arredondado e portanto vinha errado. Em Java, divisão entre inteiros (int / int) resulta em inteiro. Para obter números decimais, converta um dos operandos para double *
    }
