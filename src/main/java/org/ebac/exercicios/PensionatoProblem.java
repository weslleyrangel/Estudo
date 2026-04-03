package org.ebac.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PensionatoProblem {

    private static final int TOTAL_ROOMS = 10;

    private static class Rent {
        private String name;
        private String email;

        public Rent(String name, String email) {
            this.name = name;
            this.email = email;
        }

        @Override
        public String toString() {
            return name + ", " + email;
        }
    }

    public void executar() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[TOTAL_ROOMS];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        lerDados(sc, vect, n);
        imprimirOcupacoes(vect);
    }

    private void lerDados(Scanner sc, Rent[] vect, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }
    }

    private void imprimirOcupacoes(Rent[] vect) {
        System.out.println("\nBusy rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
}
