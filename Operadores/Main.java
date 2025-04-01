package Operadores;

public class Main {
    public static void main(String[] args) {
        
        Operadores operacao = new Operadores();

        System.out.println( operacao.divisao(10, 10));
        System.out.println(operacao.soma(10, 10));
        System.out.println(operacao.multiplicacao(10, 10));
        System.out.println(operacao.subtracao(10, 10));

        
        //Exemplo de uma usabilidade do return (o valor retornado pelo metodo eu posso armazenar em uma variavel e usa-la onde eu quiser no progrmama )
        int metodoSoma = operacao.soma(32, 1);
        int resultado = metodoSoma * 4; 
        System.out.println("valor do return multiplicado por um numero " + resultado);
    }
}
