package org.example;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Conversor de temperatura");
            System.out.println("1. Fahrenheit a Celsius");
            System.out.println("2. Celsius a Fahrenheit");
            System.out.println("3. Kelvin a Celsius");
            System.out.println("4. Celsius a Kelvin");
            System.out.println("5. Kelvin a Fahrenheit");
            System.out.println("6. Fahrenheit a Kelvin");
            System.out.println("7. Rankine a Kelvin");
            System.out.println("8. Rankine a Celsius");
            System.out.println("9. Celsius a Rankine");
            System.out.println("10. Kelvin a Rankine");
            System.out.println("11. Rankine a Fahrenheit");
            System.out.println("12. Fahrenheit a Rankine");
            System.out.println("13. Celsius a Réaumur");
            System.out.println("14. Réaumur a Celsius");
            System.out.println("15. Fahrenheit a Réaumur");
            System.out.println("16. Réaumur a Fahrenheit");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            System.out.print("Ingresa la temperatura: ");
            double temperatura = scanner.nextDouble();

            double resultado = 0;

            switch (opcion) {
                case 1 -> resultado = (5 * (temperatura - 32)) / 9;
                case 2 -> resultado = (9 * temperatura) / 5 + 32;
                case 3 -> resultado = temperatura - 273.15;
                case 4 -> resultado = temperatura + 273.15;
                case 5 -> resultado = (9 * (temperatura - 273.15)) / 5 + 32;
                case 6 -> resultado = (5 * (temperatura - 32)) / 9 + 273.15;
                case 7 -> resultado = (5 * (temperatura - 491.67)) / 9 + 273.15;
                case 8 -> resultado = (5 * (temperatura - 491.67)) / 9;
                case 9 -> resultado = (9 * temperatura) / 5 + 491.67;
                case 10 -> resultado = (9 * (temperatura - 273.15)) / 5 + 491.67;
                case 11 -> resultado = temperatura - 459.67;
                case 12 -> resultado = temperatura + 459.67;
                case 13 -> resultado = (4 * temperatura) / 5;
                case 14 -> resultado = (5 * temperatura) / 4;
                case 15 -> resultado = (4 * (temperatura - 32)) / 9;
                case 16 -> resultado = (9 * temperatura) / 4 + 32;
                default -> System.out.println("Opción no válida.");
            }


            if (opcion >= 1 && opcion <= 16) {
                System.out.println("Resultado: " + resultado);
            }

            scanner.close();
        }
    }






