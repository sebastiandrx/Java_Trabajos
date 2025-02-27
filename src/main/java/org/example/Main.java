package org.example;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            String[] productos = {"Agua Manantial", "Coca Cola", "Papas Margaritas", "Chocolatina Jumbo", "Galletas Festival"};
            double[] precios = {2000, 3500, 2500, 3000, 2800};

            boolean continuar = true;

            System.out.println("Bienvenido a la máquina expendedora");
            System.out.print("Ingresa la cantidad de dinero disponible: $");
            double saldo = teclado.nextDouble();

            while (continuar) {
                System.out.println("\nMENÚ DE PRODUCTOS");
                for (int i = 0; i < productos.length; i++) {
                    System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                }
                System.out.println("6. Finalizar compra");

                double totalCompra = 0;
                int contador = 0;

                while (contador < 5) {
                    System.out.print("\nSelecciona un producto (1-5) o 6 para finalizar: ");
                    int opcion = teclado.nextInt();

                    if (opcion == 6) {
                        break;
                    }

                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        continue;
                    }

                    if (totalCompra + precios[opcion - 1] > saldo) {
                        System.out.println("No tienes suficiente dinero para este producto.");
                    } else {
                        totalCompra += precios[opcion - 1];
                        System.out.println("Agregaste: " + productos[opcion - 1] + " ($" + precios[opcion - 1] + ")");
                        contador++;
                    }
                }

                if (totalCompra > 0) {
                    saldo -= totalCompra;
                    System.out.println("\nTotal a pagar: $" + totalCompra);
                    System.out.println("Pago exitoso. Tu cambio es: $" + saldo);
                } else {
                    System.out.println("No compraste ningún producto.");
                }

                System.out.print("\n¿Deseas hacer otra compra? (1: Sí, 2: No): ");
                int respuesta = teclado.nextInt();
                continuar = (respuesta == 1);
            }

            System.out.println("Gracias por usar la máquina expendedora. ¡Vuelve pronto!");
            teclado.close();
        }
    }

