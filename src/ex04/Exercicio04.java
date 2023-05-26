package ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números para calcular a média: ");
        int n = sc.nextInt();
        System.out.println("------------------");

        int i = 1;
        double soma = 0;

        while (i <= n) {
            System.out.printf("Digite o %dª número: ", i);
            soma += sc.nextDouble();
            i ++;
        }

        double media = soma / n;

        System.out.println("------------------");
        System.out.printf("A média é: %.2f", media);

    }
}
