package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Practica {
    public void Ejercicio(){

        Scanner entrada = new Scanner(System.in);

        String operando;
        String operando2;
        String signo = "a";
        int operandoInt;
        int operando2Int= -1;
        int signoLongitud;
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        System.out.println("BIENVENIDO A LA CALCULADORA RÁPIDA");


        while (true) {

            System.out.println("Introduce el primer operando:");
            operando = entrada.nextLine();

            try {
                operandoInt = Integer.parseInt(operando);
                break;

            }catch (NumberFormatException err) {
                System.out.println("Error al introducir el primer operando. Vuelve a intentarlo...");
            }
        }

        while (contador == 0) {

            System.out.println("Introduce el signo a aplica (+,-,/,x,R):");
            signo = entrada.nextLine();

            switch (signo){

                case "+":
                    contador = 1;
                    contador3 = 1;
                    contador4 = 1;
                    break;
                case "-":
                    contador = 1;
                    contador3 = 1;
                    contador4 = 1;
                    break;
                case "/":
                    contador = 1;
                    contador4 = 1;
                    break;
                case "x":
                    contador = 1;
                    contador3 = 1;
                    contador4 = 1;
                    break;
                case "R":
                    contador = 1;
                    contador2 = 1;
                    contador3 = 1;
                    break;
                default:
                    System.out.println("Error al introducir el signo a aplicar. Vuelve a intentarlo...");

            }
        }
        while (contador2 == 0) {

            System.out.println("Introduce el segundo operando:");
            operando2 = entrada.nextLine();

            try {
                operando2Int = Integer.parseInt(operando2);
                break;

            }catch (NumberFormatException err) {
                System.out.println("Error al introducir el segundo operando. Vuelve a intentarlo...");
            }
        }

        while (contador3 == 0) {

            if (operando2Int != 0) {
                break;
            }else {
                System.out.println("Error al introducir el segundo operando, el valor no puede ser 0. Vuelve a intentarlo...");
                while (true) {

                    System.out.println("Introduce el segundo operando:");
                    operando2 = entrada.nextLine();

                    try {
                        operando2Int = Integer.parseInt(operando2);
                        break;

                    }catch (NumberFormatException err) {
                        System.out.println("Error al introducir el segundo operando. Vuelve a intentarlo...");
                    }
                }
            }
        }

        while (contador4 == 0) {
            if (operandoInt >= 0) {
                break;
            }else {
                System.out.println("Error al introducir el primer operando, el valor no puede ser negativo. Vuelve a intentarlo...");
                while (true) {

                    System.out.println("Introduce el primer operando:");
                    operando = entrada.nextLine();

                    try {
                        operandoInt = Integer.parseInt(operando);
                        break;

                    }catch (NumberFormatException err) {
                        System.out.println("Error al introducir el primer operando. Vuelve a intentarlo...");
                    }
                }
            }
        }
        switch (signo){

            case "+":
                int suma = operandoInt + operando2Int;
                System.out.println("El resultado es: " + suma);
                break;
            case "-":
                int resta = operandoInt - operando2Int;
                System.out.println("El resultado es: " + resta);
                break;
            case "/":
                int division = operandoInt / operando2Int;
                System.out.println("El resultado es: " + division);
                break;
            case "x":
                int multiplicacion = operandoInt * operando2Int;
                System.out.println("El resultado es: " + multiplicacion);
                break;
            case "R":
                double raiz = Math.sqrt(operandoInt);
                System.out.println("El resultado es: " + raiz);
                break;

        }

    }

}

