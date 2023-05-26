package ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("Início do programa");
        System.out.println("------------------");

        double soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %dª número: ", i);
            soma += sc.nextDouble();
        }

        System.out.println("------------------");
        System.out.printf("A soma dos números é: %.3f", soma);

    }
}
