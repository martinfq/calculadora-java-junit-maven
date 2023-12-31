package org.example;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /):");
        operador = scanner.next().charAt(0);

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
        }

        scanner.close();
    }
    public static double calcular(double num1, char operador, double num2) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Indicar división por cero con NaN
                }
            default:
                return Double.NaN; // Indicar operador no válido con NaN
        }
    }

    public static String obtenerMensajeError(double num1, char operador, double num2) {
        switch (operador) {
            case '/':
                if (num2 == 0) {
                    return "Error: No se puede dividir por cero.";
                }
                break;
            case '+':
            case '-':
            case '*':
                // No hay mensajes de error para estas operaciones en este ejemplo
                break;
            default:
                return "Error: Operador no válido.";
        }
        return ""; // No hay error
    }
}