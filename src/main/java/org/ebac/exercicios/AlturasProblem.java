package org.ebac.exercicios;

import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas,
//conforme exemplo. Depois, mostrar na tela a altura média das pessoas,
//e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class AlturasProblem {
    private static class Pessoa {
        String nome;
        int idade;
        double altura;

        Pessoa(String nome, int idade, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
        }
    }

    public void executar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        lerDados(sc, pessoas);
        exibirResultados(pessoas);
    }

    private void lerDados(Scanner sc, Pessoa[] pessoas) {
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            
            pessoas[i] = new Pessoa(nome, idade, altura);
        }
    }

    private void exibirResultados(Pessoa[] pessoas) {
        if (pessoas.length == 0) return;

        double somaAlturas = 0.0;
        int contMenores = 0;

        for (Pessoa p : pessoas) {
            somaAlturas += p.altura; // Calcula a soma das alturas
            if (p.idade < 16) {
                contMenores++; //conta os menores de 16
            }
        }

        double mediaAlturas = somaAlturas / pessoas.length;
        double percentualMenores = ((double) contMenores / pessoas.length) * 100.0;

        System.out.printf("%nAltura média: %.2f%n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);

        // Imprime os nomes dos menores de 16
        for (Pessoa p : pessoas) {
            if (p.idade < 16) {
                System.out.println(p.nome);
            }
        }
    }
}
