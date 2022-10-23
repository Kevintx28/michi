package com.kevintx28;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int fj1 = 0;
        int cj1 = 0;
        int fj2 = 0;
        int cj2 = 0;

        boolean juegoTerminado = true;

        do {
            System.out.println(" --------  JUGADOR 1-------");
            System.out.println("fila: ");
            fj1 = input.nextInt();
            System.out.println("columna: ");
            cj1  = input.nextInt();
    
            System.out.println(" --------  JUGADOR 2-------");
            
            System.out.println("fila: ");
            fj2 = input.nextInt();
            System.out.println("columna: ");
            cj2  = input.nextInt();

            insertarJ1( fj1, cj1);
            insertarJ2( fj2, cj2);
            mostrarTablero();
            juegoTerminado = hayGanador( fj1, cj1, fj2, cj2);
            
            System.out.println("\n\n\n\n");
        }while(juegoTerminado);
        
        // System.out.println(fj1 +" "+ cj1+ "  ---  "+ " "+ fj2 + " "+cj2 );
    }

    public static void insertarJ1(int fj1,int cj1) { // (1,2) (2,3)
        for(int x = 0; x < escenario.length; x++) {
            for(int y = 0; y < escenario[x].length; y++) {
                if(x == fj1 && y == cj1) {
                    if(escenario[x][y] == 0) {
                        escenario[x][y] = 1;
                    } else {
                        System.out.println("Posicion no disponible");
                    }
                    
                }
            }
        }
    }
    public static void insertarJ2(int fj2,int cj2) { // (1,2) (2,3)
        for(int x = 0; x < escenario.length; x++) {
            for(int y = 0; y < escenario[x].length; y++) {
                if(x == fj2 && y == cj2) {
                    if(escenario[x][y] == 0) {
                        escenario[x][y] = 2;
                    } else {
                        System.out.println("Posicion no disponible");
                    }
                    
                }
            }
        }
    }


    static void mostrarTablero() {
        for(int x = 0; x < escenario.length; x++) {
            System.out.print("| ");
            for(int y = 0; y < escenario[x].length; y++) {
                System.out.print(escenario[x][y]+" ");
            }
            System.out.println("|");
        }
    }
        
    static boolean hayGanador(int fj1,int cj1,int fj2,int cj2) {

        return true;
    }

    static int [][] escenario = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };
    
    static int [][] escenarioFull = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };
    
    static boolean isCrossed() {
        return false;
    }
    
}
