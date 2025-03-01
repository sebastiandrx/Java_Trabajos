package org.example;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            double saldo = 50000;
            Scanner teclado = new Scanner(System.in);
            boolean continuar = true;

            System.out.println("Bienvenido al Cajero Automático");

            while (continuar) {
                System.out.println("\nMENÚ PRINCIPAL");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Ingresar Dinero");
                System.out.println("3. Retirar Dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = teclado.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("CONSULTA DE TU SALDO");
                        System.out.println("Su saldo actual es: $" + saldo);
                    }
                    case 2 -> {
                        System.out.println("INGRESO DE DINERO");
                        System.out.print("Ingrese la cantidad a depositar: $");
                        double ingreso = teclado.nextDouble();
                        if (ingreso > 0) {
                            saldo += ingreso;
                            System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
                        } else {
                            System.out.println("La cantidad debe ser mayor que cero.");
                        }
                    }
                    case 3 -> {
                        System.out.println("RETIRO DE DINERO");
                        System.out.print("Ingrese la cantidad a retirar: $");
                        double retiro = teclado.nextDouble();
                        if (retiro > 0) {
                            if (retiro <= saldo) {
                                saldo -= retiro;
                                System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
                            } else {
                                System.out.println("Fondos insuficientes. No se pudo realizar el retiro.");
                            }
                        } else {
                            System.out.println("La cantidad debe ser mayor que cero.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Gracias por utilizar nuestro cajero automático.");
                        continuar = false;
                    }
                    default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            }

            teclado.close();
        }
    }

