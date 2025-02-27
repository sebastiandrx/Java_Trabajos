package org.example;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int victoriaPC1 = 0;
        int victoriaPC2 = 0;

        Random numerosaleatorios = new Random();

        String[] jugadas = {"", "PIEDRA", "PAPEL", "TIJERA"};

        int NRondas = 1;

        while (victoriaPC1 < 2 && victoriaPC2 < 2) {
            System.out.println("RONDA # " + NRondas);
            System.out.println("Marcador: Computadora 1: " + victoriaPC1 + " - Computadora 2: " + victoriaPC2);


            int eleccionAleatoriaPC1 = numerosaleatorios.nextInt(3) + 1;
            int eleccionAleatoriaPC2 = numerosaleatorios.nextInt(3) + 1;

            System.out.println("Computadora 1 Elige:" + jugadas[eleccionAleatoriaPC1]);
            System.out.println("Computadora 2 Elige:" + jugadas[eleccionAleatoriaPC2]);


            if (eleccionAleatoriaPC1 == eleccionAleatoriaPC2) {
                System.out.println("EMPATE, se repite la ronda");
            } else if ((eleccionAleatoriaPC1 == 1 && eleccionAleatoriaPC2 == 3) ||
                      (eleccionAleatoriaPC1 == 2 && eleccionAleatoriaPC2 == 1) ||
                      (eleccionAleatoriaPC1 == 3 && eleccionAleatoriaPC2 == 2)) {
                System.out.println("Computadora 1 es la ganadora");
                victoriaPC1++;
            }  else{
                System.out.println("Computadora 2 es la ganadora");
                victoriaPC2++;
            }
            NRondas++;
        }

        System.out.println("\n=== JUEGO TERMINADO ===");
        if (victoriaPC1 > victoriaPC2) {
            System.out.println("Computadora 1 ha ganado el juego " + victoriaPC1 + " a " + victoriaPC2);
        } else {
            System.out.println("Computadora 2 ha ganado el juego " + victoriaPC2 + " a " + victoriaPC1);
        }
    }



}



