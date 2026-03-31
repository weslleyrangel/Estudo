package org.ebac;

import org.ebac.exercicios.AlturasProblem;
import org.ebac.exercicios.NumerosNegativosProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumerosNegativosProblem problem = new NumerosNegativosProblem();
        AlturasProblem altura = new AlturasProblem();
        //altura.executar();
        problem.executar();
    }
}