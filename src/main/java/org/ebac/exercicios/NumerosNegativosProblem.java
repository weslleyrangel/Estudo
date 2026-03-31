package org.ebac.exercicios;

import java.util.Scanner;

public class NumerosNegativosProblem {
    public void executar() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = lerNumeros(sc);
        exibirNumerosNegativos(numeros);
        sc.close();
    }

    private int[] lerNumeros(Scanner sc) {
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        return vet;
    }

    private void exibirNumerosNegativos(int[] numeros) {
        System.out.println("\nNUMEROS NEGATIVOS:");
        boolean encontrouNegativo = false;
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println(numero);
                encontrouNegativo = true;
            }
        }

        if (!encontrouNegativo) {
            System.out.println("Nenhum número negativo foi digitado.");
        }
    }
}
