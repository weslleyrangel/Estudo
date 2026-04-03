package org.ebac;

import org.ebac.exercicios.AlturasProblem;
import org.ebac.exercicios.NumerosNegativosProblem;
import org.ebac.exercicios.PensionatoProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumerosNegativosProblem problem = new NumerosNegativosProblem();
        AlturasProblem altura = new AlturasProblem();
        PensionatoProblem rooms = new PensionatoProblem();
        //altura.executar();
        //problem.executar();
        rooms.executar();
    }
}