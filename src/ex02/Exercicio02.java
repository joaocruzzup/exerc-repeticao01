package ex02;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Boas-vindas a impressora de 100 a 1");
        System.out.println("------------------");

        // O laço está imprimindo de 100 a 1 com os números na horizontal e pulando uma linha a cada 20.
        for (int i = 100; i >= 1; i--){
            System.out.printf("%d | ", i);
            if (i % 20 == 0){
                System.out.printf("%n");
            }
        }

        System.out.println("\n------------------");
        System.out.println("Fim da impressão!");
        System.out.println("------------------");
    }
}
