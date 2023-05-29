package ex01;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Boas-vindas a impressora de 1 a 100");
        System.out.println("------------------");

        // O laço está imprimindo de 1 a 100 com os números na horizontal e pulando uma linha a cada 20.
        for (int i = 1; i <= 100; i++){
            System.out.printf("%d | ", i);
            if (i % 20 == 0){
                System.out.printf("%n");
            }
        }

        System.out.println("------------------");
        System.out.println("Fim da impressão!");
        System.out.println("------------------");
    }
}
