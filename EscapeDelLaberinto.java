
package com.mycompany.escapedellaberinto;

import java.util.Scanner;

public class EscapeDelLaberinto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String nombre;
        char Gg = 'G';
        int u;
        int c;
        int opcion;
        int opcion1 = 0;
        int juicio = 0;
        int tamaño;
        int borde;
        int cont;
        int conta = 1;
        int ind = 1;
        int requerido;
        int oroMapa;
        int mapaVer;
        int oroPro = 0;
        int paso = 0;
        int movimientoJ = 0;
        int movTotalesJ = 0;
        int movimientoB = 0;
        int visionBot = 0;
        int derrota = 0;
        int partidasJugadas = 0;
        int partidasGanadas = 0;
        int atrapadoBot = 0;
        int jugado1 = 0;
        int jugado2 = 0;
        int perdido = 0;
        int ganado = 0;
        int perdido1 = 0;
        int ganado1 = 0;
      
        System.out.println("MENÚ PRINCIPAL");
        System.out.println();
        System.out.println("Seleccione un Número:");
        System.out.println("    1. JUGAR");
        System.out.println("    2. CREAR MAPA");
        System.out.println("    3. REPORTES");
        System.out.println("    4. VISUALIZAR MAPA");
        System.out.println("    5. SALIR");
        opcion = scanner.nextInt();
        System.out.println();
        
        while (opcion != 5) {
            char[][] matriz = {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},{' ','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ','S','O','O','O','O','O','O','#','O','O','O','O','O','O','O','0','O','#','O','O','O','O','O','O','O','O','#','O','O','S',' '},{' ','#','#','#','#','#','#','O','O','#','#','#','O','#','#','#','O','#','O','O','#','#','#','#','#','#','O','O','#','O','#',' '},{' ','#','O','O','G','O','#','O','#','G','G','#','O','#','G','#','O','#','G','#','O','#','O','O','O','#','#','O','O','O','#',' '},{' ','#','O','#','#','O','#','O','O','O','O','#','G','#','O','#','O','#','#','O','O','#','O','#','O','O','#','O','#','O','#',' '},{' ','#','G','#','O','O','#','O','#','#','#','#','#','#','O','#','O','O','O','#','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','#','O','O','O','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','#','O','O','O','O','#','#','#',' '},{' ','#','#','O','O','O','#','O','#','O','#','O','O','#','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','G','#',' '},{' ','#','O','O','#','O','#','O','O','O','#','O','#','O','#','O','O','#','O','#','O','O','O','O','O','#','O','O','#','G','#',' '},{' ','#','O','#','#','O','#','#','#','O','#','O','#','O','#','#','O','#','O','#','#','#','O','#','#','#','#','G','#','O','#',' '},{' ','#','O','O','O','O','#','O','#','O','#','O','#','O','#','O','O','#','O','O','G','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','#','#','G','#','O','O','O','O','#','O','#','O','#','#','O','#','#','#','#','#','O','#','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','#','#','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','#','O','O','#','O','#','O','O','O','#','O','#','#','O','#','O','O','#','O','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','#','G','#','O','#','#','O','O','#','O','O','#','O','O','#','O','#','O','#',' '},{' ','#','#','O','#','#','O','O','O','G','#','0','#','#','#','O','#','O','O','O','O','O','#','O','O','#','#','O','#','O','#',' '},{' ','#','O','O','#','O','O','#','O','#','#','O','O','#','O','O','#','O','#','#','#','#','#','O','#','O','#','G','#','O','#',' '},{' ','#','#','O','O','O','#','#','#','O','#','O','#','O','#','O','O','O','#','G','O','O','O','O','O','O','O','#','#','O','#',' '},{' ','#','G','#','O','#','O','O','O','O','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','O','O','#',' '},{' ','#','G','#','O','O','O','#','#','O','O','O','O','O','G','O','O','O','G','O','O','O','G','O','O','#','#','O','#','O','#',' '},{' ','#','O','#','#','#','#','#','O','O','#','#','#','#','#','#','#','#','#','#','#','#','#','#','O','O','#','O','#','#','#',' '},{' ','#','O','#','O','O','O','#','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','#','O','O','O','S',' '},{' ','#','O','O','O','#','O','#','O','O','#','O','#','#','#','#','#','#','O','#','#','#','O','O','O','O','#','O','#','#','#',' '},{' ','#','#','#','#','#','O','#','O','#','O','O','#','G','O','O','O','#','O','O','O','#','O','#','#','#','#','O','#','O','#',' '},{' ','#','O','#','O','O','O','#','O','G','#','O','#','#','#','#','O','#','#','#','O','#','O','O','O','O','#','O','O','O','#',' '},{' ','#','O','#','#','#','O','#','#','#','#','O','#','O','O','O','O','#','G','#','O','#','#','#','O','#','G','#','#','O','#',' '},{' ','#','O','#','O','O','O','O','O','O','O','O','O','O','#','O','O','#','O','#','O','O','O','O','O','#','O','#','O','O','#',' '},{' ','#','O','#','#','#','#','#','#','#','#','#','O','#','O','#','#','#','O','#','O','#','#','#','#','#','O','O','O','#','#',' '},{' ','#','O','O','O','O','O','G','#','O','O','O','O','#','O','O','O','O','O','O','O','O','O','O','O','O','O','#','O','G','#',' '},{' ','#','#','#','#','#','#','#','#','#','#','#','#','#','S','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',' '},{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
        
            
            if (opcion == 1) {
                String MOVERA = "MOVER-A";
                String movera = "mover-a";
                String MOVERD = "MOVER-D";
                String moverd = "mover-d";
                String MOVERW = "MOVER-W";
                String moverw = "mover-w";
                String MOVERS = "MOVER-S";
                String movers = "mover-s";
                String MIRAR = "MIRAR";
                String mirar = "mirar";
                String ORO = "ORO";
                String oro = "oro";
                String OROR = "ORO_REQUERIDO";
                String oror = "oro_requerido";
                String LEVANTAR = "LEVANTAR";
                String levantar = "levantar";
                String NO = "NO";
                String no = "no";
                char J = 'J';
                char O = 'O';
                char G = 'G';
                char U = '#';
                char B = 'B';
                char S = 'S';
        
                System.out.println("Selecione un Número:"); 
                System.out.println("    1. Comenzar a Jugar");
                System.out.println("    2. Regresar al MENU PRINCIPAL");
                opcion = scanner.nextInt();
        
                if (opcion == 1) {
                    String comando;
                    String palabra;
                    String llave;
                    int botfila = 0;
                    int botcolum = 0;
                    int posfila;
                    int poscolum;
                    int antfila;
                    int antcolum;
                    int bofila;
                    int bocolum;
                    int turno = 0;
                    int fallo = 3;
                    int oroSalida = 5;
                    int oroAcumulado = 0;
                    int aleatorio = (int) (Math.random()*30);
                
                    matriz[aleatorio][aleatorio] = 'J';
                    posfila = aleatorio;
                    poscolum = aleatorio;
                    antfila = aleatorio;
                    antcolum = aleatorio;

                    if (aleatorio >= 15) {
                        botfila = aleatorio - 2;
                        botcolum = aleatorio - 2;

                    } else {
                        if (aleatorio < 15) {
                            botfila = aleatorio + 2;
                            botcolum = aleatorio + 2;
                        }
                    }
	
                    matriz[botfila][botcolum] = 'B';
                    movimientoB = 0;
                    movimientoJ = 0;
                    jugado1 = jugado1 + 1;

                    while (turno == 0) {

                        while (turno == 0 && fallo > 0) {
                            System.out.println("Escriba MOVER + la letra A,S,D ó W para avanzar Ej. MOVER-A, MIRAR para ver donde está, ORO para saber cuanto oro a recolectado, u ORO_REQUERIDO para saber cuanto Oro necesita para salir");
                            System.out.println("Recuerde que cada comandos cuenta como un turno");
                            comando = scanner.next();
                            System.out.println();

                            if (comando.equals(MOVERA) || comando.equals(movera) || comando.equals(MOVERD) || comando.equals(moverd) || comando.equals(MOVERW) || comando.equals(moverw) || comando.equals(MOVERS) || comando.equals(movers) || comando.equals(MIRAR) || comando.equals(mirar) || comando.equals(ORO) || comando.equals(oro) ||comando.equals(OROR) || comando.equals(oror)) {

                                if (comando.equals(MOVERA) || comando.equals(movera)) {

                                    antfila = posfila;
                                    antcolum = poscolum;
                                    poscolum = poscolum - 1;	

                                    if (matriz[posfila][poscolum] == O) {							
                                        matriz[posfila][poscolum] = 'J';
                                        matriz[antfila][antcolum] = 'O';
                                        System.out.println("    Se realizó el movimiento");
                                        System.out.println();
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == G) { 
                                        System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                        palabra = scanner.next();

                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                            if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'O';
                                                oroAcumulado = oroAcumulado + 1;
                                                System.out.println("    +1 de Oro");
                                                System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                System.out.println();
                                            } 

                                            if (palabra.equals(NO) || palabra.equals(no)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'G';
                                            }

                                            System.out.println("    Se realizó el movimiento");	
                                            System.out.println();
                                            fallo = 3;
                                            turno = 1;

                                        } else {
                                            System.out.println("    Comando no Reconocido");
                                            System.out.println("    No se realizó el movimiento");	
                                            System.out.println();
                                            poscolum = poscolum + 1;                                        
                                            fallo = 3;
                                            turno = 1;
                                        }    
                                    }

                                    if (matriz[posfila][poscolum] == U) {
                                        System.out.println("    No se puede pasar por los #");
                                        System.out.println("    No se realizó el movimiento");
                                        System.out.println();
                                        poscolum = poscolum + 1;
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == B) {
                                        System.out.println("    Fuiste atrapado");
                                        System.out.println();
                                        fallo = 0;
                                    }

                                    if (matriz[posfila][poscolum] == S) {							

                                        if (oroAcumulado < oroSalida ) {
                                            System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                            System.out.println("    No se realizó el movimiento");
                                            System.out.println();
                                            poscolum = poscolum + 1;
                                            fallo = 3;
                                            turno = 1;
                                        }                                    

                                        if (oroAcumulado == oroSalida) {
                                            System.out.println("Tienes suficiente Oro para escapar");
                                            System.out.println("Apresurate escribe SALIR para ganar");
                                            llave = scanner.next();
                                            fallo = 4;
                                            turno = 1;
                                        }
                                    } 
                                    movimientoJ = movimientoJ + 1;
                                }

                                if (comando.equals(MOVERD) || comando.equals(moverd)) {

                                    antfila = posfila;
                                    antcolum = poscolum;
                                    poscolum = poscolum + 1;

                                    if (matriz[posfila][poscolum] == O) {							
                                        matriz[posfila][poscolum] = 'J';
                                        matriz[antfila][antcolum] = 'O';
                                        System.out.println("    Se realizó el movimiento");
                                        System.out.println();
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == G) { 
                                        System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO"); 
                                        palabra = scanner.next();

                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                            if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'O';
                                                oroAcumulado = oroAcumulado + 1;
                                                System.out.println("    +1 de Oro");
                                                System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                System.out.println();
                                            } 

                                            if (palabra.equals(NO) || palabra.equals(no)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'G';
                                            }

                                            System.out.println("    Se realizó el movimiento");	
                                            System.out.println();
                                            fallo = 3;
                                            turno = 1;

                                        } else {
                                            System.out.println("    Comando no Reconocido");
                                            System.out.println("    No se realizó el movimiento");	
                                            System.out.println();
                                            poscolum = poscolum - 1;                                        
                                            fallo = 3;
                                            turno = 1;
                                        }
                                    }

                                    if (matriz[posfila][poscolum] == U) {
                                        System.out.println("    No se puede pasar por los #");
                                        System.out.println("    No se realizó el movimiento");
                                        System.out.println();
                                        poscolum = poscolum - 1;
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == B) { 
                                        System.out.println("    Fuiste atrapado");
                                        System.out.println();
                                        fallo = 0;	
                                    }

                                    if (matriz[posfila][poscolum] == S) {		

                                        if (oroAcumulado < oroSalida ) {
                                            System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                            System.out.println("    No se realizó el movimiento");
                                            System.out.println();
                                            poscolum = poscolum + 1;
                                            fallo = 3;
                                            turno = 1;
                                        }                                    

                                        if (oroAcumulado == oroSalida) {
                                            System.out.println("Tienes suficiente Oro para escapar");
                                            System.out.println("Apresurate escribe SALIR para ganar");
                                            llave = scanner.next();
                                            fallo = 4;
                                            turno = 1;
                                        }                                    
                                    }
                                    movimientoJ = movimientoJ + 1;
                                }

                                if (comando.equals(MOVERW) || comando.equals(moverw)) {

                                    antcolum = poscolum;
                                    antfila = posfila;
                                    posfila = posfila - 1;

                                    if (matriz[posfila][poscolum] == O) {							
                                        matriz[posfila][poscolum] = 'J';
                                        matriz[antfila][antcolum] = 'O';
                                        System.out.println("    Se realizó el movimiento");
                                        System.out.println();
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == G) {
                                        System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                        palabra = scanner.next();

                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                            if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'O';
                                                oroAcumulado = oroAcumulado + 1;
                                                System.out.println("    +1 de Oro");
                                                System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                System.out.println();
                                            } 

                                            if (palabra.equals(NO) || palabra.equals(no)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'G';
                                            }

                                            System.out.println("    Se realizó el movimiento");	
                                            System.out.println();
                                            fallo = 3;
                                            turno = 1;

                                        } else {
                                            System.out.println("    Comando no Reconocido");
                                            System.out.println("    No se realizó el movimiento");	
                                            System.out.println();
                                            posfila = posfila + 1;                                        
                                            fallo = 3;
                                            turno = 1;
                                        }
                                    }

                                    if (matriz[posfila][poscolum] == U) {
                                        System.out.println("    No se puede pasar por los #");
                                        System.out.println("    No se realizó el movimiento");
                                        System.out.println();
                                        posfila = posfila + 1;
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == B) {
                                        System.out.println("    Fuiste atrapado");
                                        System.out.println();
                                        fallo = 0;
                                    }

                                    if (matriz[posfila][poscolum] == S) {					

                                        if (oroAcumulado < oroSalida ) {
                                            System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                            System.out.println("    No se realizó el movimiento");
                                            System.out.println();
                                            poscolum = poscolum + 1;
                                            fallo = 3;
                                            turno = 1;
                                        }                                    

                                        if (oroAcumulado == oroSalida) {
                                            System.out.println("Tienes suficiente Oro para escapar");
                                            System.out.println("Apresurate escribe SALIR para ganar");
                                            llave = scanner.next();
                                            fallo = 4;
                                            turno = 1;
                                        }                                    
                                    }
                                    movimientoJ = movimientoJ + 1;
                                }

                                if (comando.equals(MOVERS) || comando.equals(movers)) {

                                    antcolum = poscolum;
                                    antfila = posfila;
                                    posfila = posfila + 1;

                                    if (matriz[posfila][poscolum] == O) {							
                                        matriz[posfila][poscolum] = 'J';
                                        matriz[antfila][antcolum] = 'O';
                                        System.out.println("    Se realizó el movimiento");
                                        System.out.println();
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == G) {
                                        System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                        palabra = scanner.next();

                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                            if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'O';
                                                oroAcumulado = oroAcumulado + 1;
                                                System.out.println("    +1 de Oro");
                                                System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                System.out.println();
                                            } 

                                            if (palabra.equals(NO) || palabra.equals(no)) {
                                                matriz[posfila][poscolum] = 'J';
                                                matriz[antfila][antcolum] = 'G';
                                            }

                                            System.out.println("    Se realizó el movimiento");	
                                            System.out.println();
                                            fallo = 3;
                                            turno = 1;

                                        } else {
                                            System.out.println("    Comando no Reconocido");
                                            System.out.println("    No se realizó el movimiento");	
                                            System.out.println();
                                            posfila = posfila - 1;                                        
                                            fallo = 3;
                                            turno = 1;
                                        }
                                    }

                                    if (matriz[posfila][poscolum] == U) {
                                        System.out.println("    No se puede pasar por los #");
                                        System.out.println("    No se realizó el movimiento");
                                        System.out.println();
                                        posfila = posfila - 1;
                                        fallo = 3;
                                        turno = 1;
                                    }

                                    if (matriz[posfila][poscolum] == B) {
                                        System.out.println("    Fuiste atrapado");
                                        System.out.println();
                                        fallo = 0;
                                    }

                                    if (matriz[posfila][poscolum] == S) {				

                                        if (oroAcumulado < oroSalida ) {
                                            System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                            System.out.println("    No se realizó el movimiento");
                                            System.out.println();
                                            poscolum = poscolum + 1;
                                            fallo = 3;
                                            turno = 1;
                                        }                                    

                                        if (oroAcumulado == oroSalida) {
                                            System.out.println("Tienes suficiente Oro para escapar");
                                            System.out.println("Apresurate escribe SALIR para ganar");
                                            llave = scanner.next();
                                            fallo = 4;
                                            turno = 1;
                                        }                                    
                                    }
                                    movimientoJ = movimientoJ + 1;
                                }

                                if (comando.equals(MIRAR) || comando.equals(mirar)) {
                                    System.out.print(matriz[posfila - 2][poscolum - 2]); System.out.print(matriz[posfila - 2][poscolum - 1]); System.out.print(matriz[posfila - 2][poscolum]); System.out.print(matriz[posfila - 2][poscolum + 1]); System.out.println(matriz[posfila - 2][poscolum + 2]);
                                    System.out.print(matriz[posfila - 1][poscolum - 2]); System.out.print(matriz[posfila - 1][poscolum - 1]); System.out.print(matriz[posfila - 1][poscolum]); System.out.print(matriz[posfila - 1][poscolum + 1]); System.out.println(matriz[posfila - 1][poscolum + 2]);
                                    System.out.print(matriz[posfila][poscolum - 2]);     System.out.print(matriz[posfila][poscolum - 1]);     System.out.print(matriz[posfila][poscolum]);     System.out.print(matriz[posfila][poscolum + 1]);     System.out.println(matriz[posfila][poscolum + 2]);
                                    System.out.print(matriz[posfila + 1][poscolum - 2]); System.out.print(matriz[posfila + 1][poscolum - 1]); System.out.print(matriz[posfila + 1][poscolum]); System.out.print(matriz[posfila + 1][poscolum + 1]); System.out.println(matriz[posfila + 1][poscolum + 2]);
                                    System.out.print(matriz[posfila + 2][poscolum - 2]); System.out.print(matriz[posfila + 2][poscolum - 1]); System.out.print(matriz[posfila + 2][poscolum]); System.out.print(matriz[posfila + 2][poscolum + 1]); System.out.println(matriz[posfila + 2][poscolum + 2]);
                                    System.out.println();
                                    fallo = 3;
                                    turno = 1;
                                }

                                if (comando.equals(ORO) || comando.equals(oro)) {
                                    System.out.println("    Su cantidad de Oro actual es de: " + oroAcumulado + " unidades");
                                    System.out.println();
                                    fallo = 3;
                                    turno = 1;
                                }

                                if (comando.equals(OROR) || comando.equals(oror)) {
                                    System.out.println("    La cantidad de oro necesaria para escapar del laberinto es de: " + oroSalida + " unidades");
                                    System.out.println();
                                    fallo = 3;
                                    turno = 1;
                                }

                            } else { 
                                System.out.println("    Comando no reconocido, vuelva a Intentarlo");
                                fallo = fallo - 1;
                                System.out.println("    Intentos restantes: " + fallo + " intentos");
                                oroAcumulado = oroAcumulado - 1;
                                System.out.println("    Su cantidad de oro, ahora es de: " + oroAcumulado + " unidades");
                                System.out.println();
                            }
                        }

                        if (fallo > 0 && fallo < 4) {
                            int atacar = 0;
                            turno = 0;
                            derrota = 0;
                            
                            if (matriz[botfila - 2][botcolum] == J || matriz[botfila - 1][botcolum] == J || matriz[botfila - 2][botcolum - 2] == J || matriz[botfila - 2][botcolum - 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila - 1][botcolum - 1] == J || matriz[botfila - 2][botcolum + 1] == J || matriz[botfila - 2][botcolum + 2] == J || matriz[botfila - 1][botcolum + 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila + 2][botcolum] == J || matriz[botfila + 1][botcolum] == J ||	matriz[botfila + 1][botcolum - 2] == J || matriz[botfila + 1][botcolum - 1] == J || matriz[botfila + 2][botcolum - 2] == J || matriz[botfila + 2][botcolum - 1] == J || matriz[botfila + 1][botcolum + 1] == J || matriz[botfila + 1][botcolum + 2] == J || matriz[botfila + 2][botcolum + 1] == J || matriz[botfila + 2][botcolum + 2] == J || matriz[botfila][botcolum - 2] == J || matriz[botfila][botcolum - 1] == J || matriz[botfila][botcolum + 2] == J || matriz[botfila][botcolum + 1] == J) {
                                atacar = 1;
                            }

                            if (atacar == 1) {
                                
                                if (matriz[botfila - 2][botcolum] == J || matriz[botfila - 1][botcolum] == J || matriz[botfila - 2][botcolum - 2] == J || matriz[botfila - 2][botcolum - 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila - 1][botcolum - 1] == J || matriz[botfila - 2][botcolum + 1] == J || matriz[botfila - 2][botcolum + 2] == J || matriz[botfila - 1][botcolum + 1] == J || matriz[botfila - 1][botcolum - 2] == J) {
                                    bocolum = botcolum;
                                    bofila = botfila;
                                    botfila = botfila - 1;

                                    if (matriz[botfila][botcolum] == O) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'O';
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == G) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'G';															
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                        botfila = botfila + 1;
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == J) {
                                        System.out.println("    Atrapado");
                                        turno = 1;
                                        fallo = 0;
                                        derrota = 1;
                                        atrapadoBot = atrapadoBot + 1;
                                    }
                                    visionBot = visionBot + 1;
                                }

                                if (matriz[botfila + 2][botcolum] == J || matriz[botfila + 1][botcolum] == J ||	matriz[botfila + 1][botcolum - 2] == J || matriz[botfila + 1][botcolum - 1] == J || matriz[botfila + 2][botcolum - 2] == J || matriz[botfila + 2][botcolum - 1] == J || matriz[botfila + 1][botcolum + 1] == J || matriz[botfila + 1][botcolum + 2] == J || matriz[botfila + 2][botcolum + 1] == J || matriz[botfila + 2][botcolum + 2] == J) {
                                    bocolum = botcolum;
                                    bofila = botfila;
                                    botfila = botfila + 1;

                                    if (matriz[botfila][botcolum] == O) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'O';
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == G) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'G';													
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                        botfila = botfila - 1;
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == J) {
                                        System.out.println("    Atrapado");
                                        turno = 1;
                                        fallo = 0;
                                        derrota = 1;
                                        atrapadoBot = atrapadoBot + 1;
                                    }	
                                    visionBot = visionBot + 1;
                                }

                                if (matriz[botfila][botcolum - 2] == J || matriz[botfila][botcolum - 1] == J) {
                                    bofila = botfila;
                                    bocolum = botcolum;
                                    botcolum = botcolum - 1;

                                    if (matriz[botfila][botcolum] == O) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'O';
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == G) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'G';															
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                        botcolum = botcolum + 1;
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == J) {
                                        System.out.println("    Atrapado");
                                        turno = 1;
                                        fallo = 0;
                                        derrota = 1;
                                        atrapadoBot = atrapadoBot + 1;
                                    }
                                    visionBot = visionBot + 1;
                                }

                                if (matriz[botfila][botcolum + 2] == J || matriz[botfila][botcolum + 1] == J) {
                                    bofila = botfila;
                                    bocolum = botcolum;
                                    botcolum = botcolum + 1;

                                    if (matriz[botfila][botcolum] == O) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'O';
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == G) {							
                                        matriz[botfila][botcolum] = 'B';
                                        matriz[bofila][bocolum] = 'G';															
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                        botcolum = botcolum - 1;
                                        turno = 0;
                                    }

                                    if (matriz[botfila][botcolum] == J) {
                                        System.out.println("    Atrapado");
                                        turno = 1;
                                        fallo = 0;
                                        derrota = 1;
                                        atrapadoBot = atrapadoBot + 1;
                                    }
                                    visionBot = visionBot + 1;
                                }

                            } else {
                                if (atacar == 0) {

                                    while (paso == 0) {		
                                        int seguir = (int) (Math.random()*3);

                                        if (seguir == 0) {
                                            bofila = botfila;
                                            bocolum = botcolum;
                                            botcolum = botcolum - 1;

                                            if (matriz[botfila][botcolum] == O) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'O';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == G) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'G';	
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                botcolum = botcolum + 1;
                                                paso = 0;
                                            }

                                            if (matriz[botfila][botcolum] == J) {
                                                System.out.println("    Atrapado");
                                                paso = 1;
                                                turno = 1;
                                                fallo = 0;
                                                derrota = 1;
                                                atrapadoBot = atrapadoBot + 1;
                                            }
                                            movimientoB = movimientoB + 1;
                                        }

                                        if (seguir == 1) {
                                            bofila = botfila;
                                            bocolum = botcolum;
                                            botcolum = botcolum + 1;

                                            if (matriz[botfila][botcolum] == O) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'O';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == G) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'G';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                botcolum = botcolum - 1;
                                                paso = 0;
                                            }

                                            if (matriz[botfila][botcolum] == J) {
                                                System.out.println("    Atrapado");
                                                paso = 1;
                                                turno = 1;
                                                fallo = 0;
                                                derrota = 1;
                                                atrapadoBot = atrapadoBot + 1;
                                            }
                                            movimientoB = movimientoB + 1;
                                        }

                                        if (seguir == 2) {
                                            bocolum = botcolum;
                                            bofila = botfila;
                                            botfila = botfila - 1;

                                            if (matriz[botfila][botcolum] == O) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'O';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == G) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'G';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                botfila = botfila + 1;
                                                paso = 0;
                                            }

                                            if (matriz[botfila][botcolum] == J) {
                                                System.out.println("    Atrapado");
                                                paso = 1;
                                                turno = 1;
                                                fallo = 0;
                                                derrota = 1;
                                                atrapadoBot = atrapadoBot + 1;
                                            }
                                            movimientoB = movimientoB + 1;
                                        }	

                                        if (seguir == 3) {
                                            bocolum = botcolum;
                                            bofila = botfila;
                                            botfila = botfila + 1;

                                            if (matriz[botfila][botcolum] == O) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'O';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == G) {							
                                                matriz[botfila][botcolum] = 'B';
                                                matriz[bofila][bocolum] = 'G';
                                                paso = 1;
                                                turno = 0;
                                            }

                                            if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                botfila = botfila - 1;
                                                paso = 0;
                                            }

                                            if (matriz[botfila][botcolum] == J) {
                                                System.out.println("    Atrapado");
                                                fallo = 0;
                                                turno = 1;
                                                paso = 1;
                                                derrota = 1;
                                                atrapadoBot = atrapadoBot + 1;
                                            }
                                            movimientoB = movimientoB + 1;
                                        }
                                    }
                                }
                            }
                        }

                        if (fallo == 0) {
                            System.out.println("    Perdiste");
                            System.out.println();
                            turno = 1;   
                            perdido = perdido + 1;
                        }

                        if (fallo == 4) {
                            System.out.println("    Felicidades has Ganado");
                            System.out.println();
                            turno = 1;
                            partidasGanadas = partidasGanadas + 1;
                            ganado = ganado + 1;
                        }
                    }   

                    System.out.println("Cantidad de Oro recolectado: " + oroAcumulado + " unidades de Oro");
                    oroPro = oroPro + oroAcumulado;
                    System.out.println("Cantidad de Movimientos realizados por el Jugador: " + movimientoJ);
                    movTotalesJ = movTotalesJ + movimientoJ;
                    System.out.println("Cantidad de vecez que se estuvo en la mira del Bot: " + visionBot);
                    
                    if (derrota == 1) {
                        System.out.println("Cantidad de Movimientos realizados por el Bot antes de atraparlo: " + movimientoB);
                        derrota = 0;
                    }
                    
                    partidasJugadas = partidasJugadas + 1;
                }
        
                if (opcion == 2) {
            
                }
                
                System.out.println("MENÚ PRINCIPAL");
                System.out.println();
                System.out.println("Seleccione un Número:");
                System.out.println("    1. JUGAR");
                System.out.println("    2. CREAR MAPA");
                System.out.println("    3. REPORTES");
                System.out.println("    4. VISUALIZAR MAPA");
                System.out.println("    5. SALIR");
                opcion = scanner.nextInt();
                System.out.println();
            }
            
            if (opcion == 2) {
                tamaño = 0;
                borde = 0;
                cont = 0;
                
                System.out.println("NOTA: Tomar en cuenta lo siguiente antes de empezar a contruir su mapa");
                System.out.println();
                System.out.println("    - El mapa se llenara de izquierda a derecha por filas");
                System.out.println("    - Debe de colocar una o varias casillas de salida");
                System.out.println("    - Cuide que la cantidad de oro que pida para ganar sea menor a la cantidad de oro dentro del mapa");
                System.out.println(); 
                
                System.out.println("Ingrese el tamaño del mapa de ancho y alto = X");
                tamaño = scanner.nextInt();
                System.out.println();

                borde = tamaño + 2;
                cont = borde - 1;
                char[][] matriz2 = new char[borde][borde];
                        
                for (int i = 0; i < borde; i++) {				
                    matriz2[i][0] = ' ';
                    matriz2[i][cont] = ' ';
                }

                for (int i = 0; i <= tamaño; i++) {
                    matriz2[0][i] = ' ';
                    matriz2[cont][i] = ' ';
                }
                
                conta = 1;
                ind = 1;
                
                while (conta <= tamaño) {
                    System.out.println("Escriba el valor de la casilla");
                    matriz2[conta][ind] = scanner.next().charAt(0);
									
                    if (ind == tamaño) {
                        conta = conta + 1;
                        ind = 1;
								
                    } else { 
												
                        if (ind < tamaño) {
                            ind = ind + 1;
                        }
                    }
                }
                nombre = null;
                System.out.println();
                System.out.println("Escriba el nombre del mapa");
                nombre = scanner.next();
                System.out.println();

                requerido = 0;
                System.out.println("Escriba la cantidad de Oro que se necesitara para Salir");
                requerido = scanner.nextInt();
                System.out.println();
                
                c = 1;
                u = 1;
                oroMapa = 0;

                while (c <= tamaño) {

                    if (matriz2[c][u] == Gg) {
                        oroMapa = oroMapa + 1;
                    }
												
                    if (u == tamaño) {
                        c = c + 1;
                        u = 1;
								
                    } else {
                        if (u < tamaño) {
                            u = u + 1;
                        }
                    }
                }

                if (oroMapa >= requerido) {
                    System.out.println("Guardado Correctamente");
                    System.out.println();
                }

                if (oroMapa < requerido) {
                    System.out.println("La cantidad de Oro no es sufiente para poder Salir");
                    System.out.println("La cantidad dentro del mapa es de: " + oroMapa + " unidades");
                    System.out.println("Cambie la cantidad de Oro para salir para arreglar el problema");
                    requerido = scanner.nextInt(); 			
                    System.out.println("Guardado Correctamente");
                    System.out.println();
                }

                opcion1 = 0;
                
                while (opcion1 != 4) {
                    System.out.println("MENÚ PRINCIPAL");
                    System.out.println();
                    System.out.println("Seleccione un Número:");
                    System.out.println("    1. JUGAR");
                    System.out.println("    2. REPORTES");
                    System.out.println("    3. VISUALIZAR MAPA");
                    System.out.println("    4. SALIR");
                    opcion1 = scanner.nextInt();
                    System.out.println();
                    
                    if (opcion1 == 1) {
                        String MOVERA = "MOVER-A";
                        String movera = "mover-a";
                        String MOVERD = "MOVER-D";
                        String moverd = "mover-d";
                        String MOVERW = "MOVER-W";
                        String moverw = "mover-w";
                        String MOVERS = "MOVER-S";
                        String movers = "mover-s";
                        String MIRAR = "MIRAR";
                        String mirar = "mirar";
                        String ORO = "ORO";
                        String oro = "oro";
                        String OROR = "ORO_REQUERIDO";
                        String oror = "oro_requerido";
                        String LEVANTAR = "LEVANTAR";
                        String levantar = "levantar";
                        String NO = "NO";
                        String no = "no";
                        char J = 'J';
                        char O = 'O';
                        char G = 'G';
                        char U = '#';
                        char B = 'B';
                        char S = 'S';
                        int eleccion;

                        System.out.println("Selecione un Número:"); 
                        System.out.println("    1. Comenzar a Jugar");
                        System.out.println("    2. Regresar al MENU PRINCIPAL");
                        opcion = scanner.nextInt();

                        if (opcion == 1) {
                            System.out.println("Selecione un Número:");
                            System.out.println("    1. Jugar MAPA: Principal");
                            System.out.println("    2. Jugar MAPA: " + nombre);
                            eleccion = scanner.nextInt();
                            System.out.println();

                            if (eleccion == 1) {
                                String comando;
                                String palabra;
                                String llave;
                                int botfila = 0;
                                int botcolum = 0;
                                int posfila = 0;
                                int poscolum = 0;
                                int antfila = 0;
                                int antcolum = 0;
                                int bofila = 0;
                                int bocolum = 0;
                                int turno = 0;
                                int fallo = 3;
                                int oroSalida = 5;
                                int oroAcumulado = 0;
                                int aleatorio = (int) (Math.random()*30);

                                matriz[aleatorio][aleatorio] = 'J';
                                posfila = aleatorio;
                                poscolum = aleatorio;
                                antfila = aleatorio;
                                antcolum = aleatorio;

                                if (aleatorio >= 15) {
                                    botfila = aleatorio - 2;
                                    botcolum = aleatorio - 2;

                                } else {
                                    if (aleatorio < 15) {
                                        botfila = aleatorio + 2;
                                        botcolum = aleatorio + 2;
                                    }
                                }

                                matriz[botfila][botcolum] = 'B';
                                movimientoJ = 0;
                                movimientoB = 0;
                                visionBot = 0;
                                derrota = 0;
                                jugado1 = jugado1 + 1;

                                while (turno == 0) {

                                    while (turno == 0 && fallo > 0) {
                                        System.out.println("Escriba MOVER + la letra A,S,D ó W para avanzar Ej. MOVER-A, MIRAR para ver donde está, ORO para saber cuanto oro a recolectado, u ORO_REQUERIDO para saber cuanto Oro necesita para salir");
                                        System.out.println("Recuerde que cada comandos cuenta como un turno");
                                        comando = scanner.next();
                                        System.out.println();

                                        if (comando.equals(MOVERA) || comando.equals(movera) || comando.equals(MOVERD) || comando.equals(moverd) || comando.equals(MOVERW) || comando.equals(moverw) || comando.equals(MOVERS) || comando.equals(movers) || comando.equals(MIRAR) || comando.equals(mirar) || comando.equals(ORO) || comando.equals(oro) ||comando.equals(OROR) || comando.equals(oror)) {

                                            if (comando.equals(MOVERA) || comando.equals(movera)) {

                                                antfila = posfila;
                                                antcolum = poscolum;
                                                poscolum = poscolum - 1;	

                                                if (matriz[posfila][poscolum] == O) {							
                                                    matriz[posfila][poscolum] = 'J';
                                                    matriz[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == G) { 
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        poscolum = poscolum + 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    poscolum = poscolum + 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz[posfila][poscolum] == S) {							

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }
                                                } 
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERD) || comando.equals(moverd)) {

                                                antfila = posfila;
                                                antcolum = poscolum;
                                                poscolum = poscolum + 1;

                                                if (matriz[posfila][poscolum] == O) {							
                                                    matriz[posfila][poscolum] = 'J';
                                                    matriz[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == G) { 
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO"); 
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        poscolum = poscolum - 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    poscolum = poscolum - 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == B) { 
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;	
                                                }

                                                if (matriz[posfila][poscolum] == S) {		

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERW) || comando.equals(moverw)) {

                                                antcolum = poscolum;
                                                antfila = posfila;
                                                posfila = posfila - 1;

                                                if (matriz[posfila][poscolum] == O) {							
                                                    matriz[posfila][poscolum] = 'J';
                                                    matriz[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == G) {
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        posfila = posfila + 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    posfila = posfila + 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz[posfila][poscolum] == S) {					

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERS) || comando.equals(movers)) {

                                                antcolum = poscolum;
                                                antfila = posfila;
                                                posfila = posfila + 1;

                                                if (matriz[posfila][poscolum] == O) {							
                                                    matriz[posfila][poscolum] = 'J';
                                                    matriz[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == G) {
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz[posfila][poscolum] = 'J';
                                                            matriz[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        posfila = posfila - 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    posfila = posfila - 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz[posfila][poscolum] == S) {				

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MIRAR) || comando.equals(mirar)) {
                                                System.out.print(matriz[posfila - 2][poscolum - 2]); System.out.print(matriz[posfila - 2][poscolum - 1]); System.out.print(matriz[posfila - 2][poscolum]); System.out.print(matriz[posfila - 2][poscolum + 1]); System.out.println(matriz[posfila - 2][poscolum + 2]);
                                                System.out.print(matriz[posfila - 1][poscolum - 2]); System.out.print(matriz[posfila - 1][poscolum - 1]); System.out.print(matriz[posfila - 1][poscolum]); System.out.print(matriz[posfila - 1][poscolum + 1]); System.out.println(matriz[posfila - 1][poscolum + 2]);
                                                System.out.print(matriz[posfila][poscolum - 2]);     System.out.print(matriz[posfila][poscolum - 1]);     System.out.print(matriz[posfila][poscolum]);     System.out.print(matriz[posfila][poscolum + 1]);     System.out.println(matriz[posfila][poscolum + 2]);
                                                System.out.print(matriz[posfila + 1][poscolum - 2]); System.out.print(matriz[posfila + 1][poscolum - 1]); System.out.print(matriz[posfila + 1][poscolum]); System.out.print(matriz[posfila + 1][poscolum + 1]); System.out.println(matriz[posfila + 1][poscolum + 2]);
                                                System.out.print(matriz[posfila + 2][poscolum - 2]); System.out.print(matriz[posfila + 2][poscolum - 1]); System.out.print(matriz[posfila + 2][poscolum]); System.out.print(matriz[posfila + 2][poscolum + 1]); System.out.println(matriz[posfila + 2][poscolum + 2]);     
                                                fallo = 3;
                                                turno = 1;                                
                                            }

                                            if (comando.equals(ORO) || comando.equals(oro)) {
                                                System.out.println("    Su cantidad de Oro actual es de: " + oroAcumulado + " unidades");
                                                System.out.println();
                                                fallo = 3;
                                                turno = 1;
                                            }

                                            if (comando.equals(OROR) || comando.equals(oror)) {
                                                System.out.println("    La cantidad de oro necesaria para escapar del laberinto es de: " + oroSalida + " unidades");
                                                System.out.println();
                                                fallo = 3;
                                                turno = 1;
                                            }

                                        } else { 
                                            System.out.println("    Comando no reconocido, vuelva a Intentarlo");
                                            fallo = fallo - 1;
                                            System.out.println("    Intentos restantes: " + fallo + " intentos");
                                            oroAcumulado = oroAcumulado - 1;
                                            System.out.println("    Su cantidad de oro, ahora es de: " + oroAcumulado + " unidades");
                                            System.out.println();
                                        }
                                    }

                                    if (fallo > 0 && fallo < 4) {
                                        int atacar = 0;
                                        turno = 0;
                                        derrota = 0;

                                        if (matriz[botfila - 2][botcolum] == J || matriz[botfila - 1][botcolum] == J || matriz[botfila - 2][botcolum - 2] == J || matriz[botfila - 2][botcolum - 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila - 1][botcolum - 1] == J || matriz[botfila - 2][botcolum + 1] == J || matriz[botfila - 2][botcolum + 2] == J || matriz[botfila - 1][botcolum + 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila + 2][botcolum] == J || matriz[botfila + 1][botcolum] == J ||	matriz[botfila + 1][botcolum - 2] == J || matriz[botfila + 1][botcolum - 1] == J || matriz[botfila + 2][botcolum - 2] == J || matriz[botfila + 2][botcolum - 1] == J || matriz[botfila + 1][botcolum + 1] == J || matriz[botfila + 1][botcolum + 2] == J || matriz[botfila + 2][botcolum + 1] == J || matriz[botfila + 2][botcolum + 2] == J || matriz[botfila][botcolum - 2] == J || matriz[botfila][botcolum - 1] == J || matriz[botfila][botcolum + 2] == J || matriz[botfila][botcolum + 1] == J) {
                                            atacar = 1;
                                        }

                                        if (atacar == 1) {

                                            if (matriz[botfila - 2][botcolum] == J || matriz[botfila - 1][botcolum] == J || matriz[botfila - 2][botcolum - 2] == J || matriz[botfila - 2][botcolum - 1] == J || matriz[botfila - 1][botcolum - 2] == J || matriz[botfila - 1][botcolum - 1] == J || matriz[botfila - 2][botcolum + 1] == J || matriz[botfila - 2][botcolum + 2] == J || matriz[botfila - 1][botcolum + 1] == J || matriz[botfila - 1][botcolum - 2] == J) {
                                                bocolum = botcolum;
                                                bofila = botfila;
                                                botfila = botfila - 1;

                                                if (matriz[botfila][botcolum] == O) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == G) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                    botfila = botfila + 1;
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }
                                                visionBot = visionBot + 1;
                                            }

                                            if (matriz[botfila + 2][botcolum] == J || matriz[botfila + 1][botcolum] == J ||	matriz[botfila + 1][botcolum - 2] == J || matriz[botfila + 1][botcolum - 1] == J || matriz[botfila + 2][botcolum - 2] == J || matriz[botfila + 2][botcolum - 1] == J || matriz[botfila + 1][botcolum + 1] == J || matriz[botfila + 1][botcolum + 2] == J || matriz[botfila + 2][botcolum + 1] == J || matriz[botfila + 2][botcolum + 2] == J) {
                                                bocolum = botcolum;
                                                bofila = botfila;
                                                botfila = botfila + 1;

                                                if (matriz[botfila][botcolum] == O) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == G) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'G';													
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                    botfila = botfila - 1;
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }	
                                                visionBot = visionBot + 1;
                                            }

                                            if (matriz[botfila][botcolum - 2] == J || matriz[botfila][botcolum - 1] == J) {
                                                bofila = botfila;
                                                bocolum = botcolum;
                                                botcolum = botcolum - 1;

                                                if (matriz[botfila][botcolum] == O) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == G) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                    botcolum = botcolum + 1;
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }
                                                visionBot = visionBot + 1;
                                            }

                                            if (matriz[botfila][botcolum + 2] == J || matriz[botfila][botcolum + 1] == J) {
                                                bofila = botfila;
                                                bocolum = botcolum;
                                                botcolum = botcolum + 1;

                                                if (matriz[botfila][botcolum] == O) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == G) {							
                                                    matriz[botfila][botcolum] = 'B';
                                                    matriz[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                    botcolum = botcolum - 1;
                                                    turno = 0;
                                                }

                                                if (matriz[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }
                                                visionBot = visionBot + 1;
                                            }

                                        } else {
                                            if (atacar == 0) {

                                                while (paso == 0) {		
                                                    int seguir = (int) (Math.random()*3);

                                                    if (seguir == 0) {
                                                        bofila = botfila;
                                                        bocolum = botcolum;
                                                        botcolum = botcolum - 1;

                                                        if (matriz[botfila][botcolum] == O) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == G) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'G';	
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                            botcolum = botcolum + 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }

                                                    if (seguir == 1) {
                                                        bofila = botfila;
                                                        bocolum = botcolum;
                                                        botcolum = botcolum + 1;

                                                        if (matriz[botfila][botcolum] == O) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == G) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                            botcolum = botcolum - 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }

                                                    if (seguir == 2) {
                                                        bocolum = botcolum;
                                                        bofila = botfila;
                                                        botfila = botfila - 1;

                                                        if (matriz[botfila][botcolum] == O) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == G) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                            botfila = botfila + 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }	

                                                    if (seguir == 3) {
                                                        bocolum = botcolum;
                                                        bofila = botfila;
                                                        botfila = botfila + 1;

                                                        if (matriz[botfila][botcolum] == O) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == G) {							
                                                            matriz[botfila][botcolum] = 'B';
                                                            matriz[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == U || matriz[botfila][botcolum] == S) {
                                                            botfila = botfila - 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            fallo = 0;
                                                            turno = 1;
                                                            paso = 1;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }
                                                }
                                            }
                                        }                                        
                                    }

                                    if (fallo == 0) {
                                        System.out.println("    Perdiste");
                                        System.out.println();
                                        turno = 1;     
                                        perdido = perdido + 1;
                                    }

                                    if (fallo == 4) {
                                        System.out.println("    Felicidades has Ganado");
                                        System.out.println();
                                        turno = 1;
                                        partidasGanadas = partidasGanadas + 1;
                                        ganado = ganado + 1;
                                    }
                                } 
                                System.out.println("Cantidad de Oro recolectado: " + oroAcumulado + " unidades de Oro");
                                oroPro = oroPro + oroAcumulado;
                                System.out.println("Cantidad de Movimientos realizados por el Jugador: " + movimientoJ);
                                movTotalesJ = movTotalesJ + movimientoJ;
                                System.out.println("Cantidad de vecez que se estuvo en la mira del Bot: " + visionBot);
                                
                    
                                if (derrota == 1) {
                                    System.out.println("Cantidad de Movimientos realizados por el Bot antes de atraparlo: " + movimientoB);
                                    derrota = 0;
                                }
                                
                                partidasJugadas = partidasJugadas + 1;
                            }

                            if (eleccion == 2) {
                                String comando;
                                String palabra;
                                String llave;
                                int botfila = 0;
                                int botcolum = 0;
                                int posfila = 0;
                                int poscolum = 0;
                                int antfila = 0;
                                int antcolum = 0;
                                int bofila = 0;
                                int bocolum = 0;
                                int turno = 0;
                                int fallo = 3;
                                int oroSalida = 5;
                                int oroAcumulado = 0;
                                int mitad;
                                int aleatorio = (int) (Math.random()*borde);
                                
                                if (aleatorio == 0 || aleatorio == borde || aleatorio == 1 || aleatorio == borde - 1) {
                                    aleatorio = tamaño;
                                }

                                matriz2[aleatorio][aleatorio] = 'J';
                                posfila = aleatorio;
                                poscolum = aleatorio;
                                antfila = aleatorio;
                                antcolum = aleatorio;
                                
                                mitad = borde / 2;

                                if (aleatorio >= mitad) {
                                    botfila = aleatorio - 2;
                                    botcolum = aleatorio - 2;

                                } else {
                                    if (aleatorio < mitad) {
                                        botfila = aleatorio + 2;
                                        botcolum = aleatorio + 2;
                                    }
                                }

                                matriz2[botfila][botcolum] = 'B';
                                movimientoJ = 0;
                                movimientoB = 0;
                                visionBot = 0;
                                derrota = 0;
                                jugado2 = jugado2 + 1;

                                while (turno == 0) {

                                    while (turno == 0 && fallo > 0) {
                                        System.out.println("Escriba MOVER + la letra A,S,D ó W para avanzar Ej. MOVER-A, MIRAR para ver donde está, ORO para saber cuanto oro a recolectado, u ORO_REQUERIDO para saber cuanto Oro necesita para salir");
                                        System.out.println("Recuerde que cada comandos cuenta como un turno");
                                        comando = scanner.next();
                                        System.out.println();

                                        if (comando.equals(MOVERA) || comando.equals(movera) || comando.equals(MOVERD) || comando.equals(moverd) || comando.equals(MOVERW) || comando.equals(moverw) || comando.equals(MOVERS) || comando.equals(movers) || comando.equals(MIRAR) || comando.equals(mirar) || comando.equals(ORO) || comando.equals(oro) ||comando.equals(OROR) || comando.equals(oror)) {

                                            if (comando.equals(MOVERA) || comando.equals(movera)) {

                                                antfila = posfila;
                                                antcolum = poscolum;
                                                poscolum = poscolum - 1;	

                                                if (matriz2[posfila][poscolum] == O) {							
                                                    matriz2[posfila][poscolum] = 'J';
                                                    matriz2[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == G) { 
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        poscolum = poscolum + 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }    
                                                }

                                                if (matriz2[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    poscolum = poscolum + 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz2[posfila][poscolum] == S) {							

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }
                                                }  
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERD) || comando.equals(moverd)) {

                                                antfila = posfila;
                                                antcolum = poscolum;
                                                poscolum = poscolum + 1;

                                                if (matriz2[posfila][poscolum] == O) {							
                                                    matriz2[posfila][poscolum] = 'J';
                                                    matriz2[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == G) { 
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO"); 
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        poscolum = poscolum - 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz2[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    poscolum = poscolum - 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == B) { 
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;	
                                                }

                                                if (matriz2[posfila][poscolum] == S) {		

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERW) || comando.equals(moverw)) {

                                                antcolum = poscolum;
                                                antfila = posfila;
                                                posfila = posfila - 1;

                                                if (matriz2[posfila][poscolum] == O) {							
                                                    matriz2[posfila][poscolum] = 'J';
                                                    matriz2[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == G) {
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        posfila = posfila + 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz2[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    posfila = posfila + 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz2[posfila][poscolum] == S) {					

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MOVERS) || comando.equals(movers)) {

                                                antcolum = poscolum;
                                                antfila = posfila;
                                                posfila = posfila + 1;

                                                if (matriz2[posfila][poscolum] == O) {							
                                                    matriz2[posfila][poscolum] = 'J';
                                                    matriz2[antfila][antcolum] = 'O';
                                                    System.out.println("    Se realizó el movimiento");
                                                    System.out.println();
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == G) {
                                                    System.out.println("Ingrese la palabra LEVANTAR para recoger el oro, de lo contrario ponga NO");
                                                    palabra = scanner.next();

                                                    if (palabra.equals(LEVANTAR) || palabra.equals(levantar) || palabra.equals(NO) || palabra.equals(no)) {

                                                        if (palabra.equals(LEVANTAR) || palabra.equals(levantar)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'O';
                                                            oroAcumulado = oroAcumulado + 1;
                                                            System.out.println("    +1 de Oro");
                                                            System.out.println("    ORO ACUMULADO: " + oroAcumulado + " unidades de Oro");
                                                            System.out.println();
                                                        } 

                                                        if (palabra.equals(NO) || palabra.equals(no)) {
                                                            matriz2[posfila][poscolum] = 'J';
                                                            matriz2[antfila][antcolum] = 'G';
                                                        }

                                                        System.out.println("    Se realizó el movimiento");	
                                                        System.out.println();
                                                        fallo = 3;
                                                        turno = 1;

                                                    } else {
                                                        System.out.println("    Comando no Reconocido");
                                                        System.out.println("    No se realizó el movimiento");	
                                                        System.out.println();
                                                        posfila = posfila - 1;                                        
                                                        fallo = 3;
                                                        turno = 1;
                                                    }
                                                }

                                                if (matriz2[posfila][poscolum] == U) {
                                                    System.out.println("    No se puede pasar por los #");
                                                    System.out.println("    No se realizó el movimiento");
                                                    System.out.println();
                                                    posfila = posfila - 1;
                                                    fallo = 3;
                                                    turno = 1;
                                                }

                                                if (matriz2[posfila][poscolum] == B) {
                                                    System.out.println("    Fuiste atrapado");
                                                    System.out.println();
                                                    fallo = 0;
                                                }

                                                if (matriz2[posfila][poscolum] == S) {				

                                                    if (oroAcumulado < oroSalida ) {
                                                        System.out.println("    No tienes el Oro necesario para salir, se requieren: " + oroSalida + " unidades de Oro");
                                                        System.out.println("    No se realizó el movimiento");
                                                        System.out.println();
                                                        poscolum = poscolum + 1;
                                                        fallo = 3;
                                                        turno = 1;
                                                    }                                    

                                                    if (oroAcumulado == oroSalida) {
                                                        System.out.println("Tienes suficiente Oro para escapar");
                                                        System.out.println("Apresurate escribe SALIR para ganar");
                                                        llave = scanner.next();
                                                        fallo = 4;
                                                        turno = 1;
                                                    }                                    
                                                }
                                                movimientoJ = movimientoJ + 1;
                                            }

                                            if (comando.equals(MIRAR) || comando.equals(mirar)) {
                                                System.out.print(matriz2[posfila - 2][poscolum - 2]); System.out.print(matriz2[posfila - 2][poscolum - 1]); System.out.print(matriz2[posfila - 2][poscolum]); System.out.print(matriz2[posfila - 2][poscolum + 1]); System.out.println(matriz2[posfila - 2][poscolum + 2]);
                                                System.out.print(matriz2[posfila - 1][poscolum - 2]); System.out.print(matriz2[posfila - 1][poscolum - 1]); System.out.print(matriz2[posfila - 1][poscolum]); System.out.print(matriz2[posfila - 1][poscolum + 1]); System.out.println(matriz2[posfila - 1][poscolum + 2]);
                                                System.out.print(matriz2[posfila][poscolum - 2]);     System.out.print(matriz2[posfila][poscolum - 1]);     System.out.print(matriz2[posfila][poscolum]);     System.out.print(matriz2[posfila][poscolum + 1]);     System.out.println(matriz2[posfila][poscolum + 2]);
                                                System.out.print(matriz2[posfila + 1][poscolum - 2]); System.out.print(matriz2[posfila + 1][poscolum - 1]); System.out.print(matriz2[posfila + 1][poscolum]); System.out.print(matriz2[posfila + 1][poscolum + 1]); System.out.println(matriz2[posfila + 1][poscolum + 2]);
                                                System.out.print(matriz2[posfila + 2][poscolum - 2]); System.out.print(matriz2[posfila + 2][poscolum - 1]); System.out.print(matriz2[posfila + 2][poscolum]); System.out.print(matriz2[posfila + 2][poscolum + 1]); System.out.println(matriz2[posfila + 2][poscolum + 2]);     
                                                fallo = 3;
                                                turno = 1;                                
                                            }

                                            if (comando.equals(ORO) || comando.equals(oro)) {
                                                System.out.println("    Su cantidad de Oro actual es de: " + oroAcumulado + " unidades");
                                                System.out.println();
                                                fallo = 3;
                                                turno = 1;
                                            }

                                            if (comando.equals(OROR) || comando.equals(oror)) {
                                                System.out.println("    La cantidad de oro necesaria para escapar del laberinto es de: " + oroSalida + " unidades");
                                                System.out.println();
                                                fallo = 3;
                                                turno = 1;
                                            }

                                        } else { 
                                            System.out.println("    Comando no reconocido, vuelva a Intentarlo");
                                            fallo = fallo - 1;
                                            System.out.println("    Intentos restantes: " + fallo + " intentos");
                                            oroAcumulado = oroAcumulado - 1;
                                            System.out.println("    Su cantidad de oro, ahora es de: " + oroAcumulado + " unidades");
                                            System.out.println();
                                        }
                                    }

                                    if (fallo > 0 && fallo < 4) {
                                        int atacar = 0;
                                        turno = 0;
                                        derrota = 0;

                                        if (matriz2[botfila - 2][botcolum] == J || matriz2[botfila - 1][botcolum] == J || matriz2[botfila - 2][botcolum - 2] == J || matriz2[botfila - 2][botcolum - 1] == J || matriz2[botfila - 1][botcolum - 2] == J || matriz2[botfila - 1][botcolum - 1] == J || matriz2[botfila - 2][botcolum + 1] == J || matriz2[botfila - 2][botcolum + 2] == J || matriz2[botfila - 1][botcolum + 1] == J || matriz2[botfila - 1][botcolum - 2] == J || matriz2[botfila + 2][botcolum] == J || matriz2[botfila + 1][botcolum] == J ||	matriz2[botfila + 1][botcolum - 2] == J || matriz2[botfila + 1][botcolum - 1] == J || matriz2[botfila + 2][botcolum - 2] == J || matriz2[botfila + 2][botcolum - 1] == J || matriz2[botfila + 1][botcolum + 1] == J || matriz2[botfila + 1][botcolum + 2] == J || matriz2[botfila + 2][botcolum + 1] == J || matriz2[botfila + 2][botcolum + 2] == J || matriz2[botfila][botcolum - 2] == J || matriz2[botfila][botcolum - 1] == J || matriz2[botfila][botcolum + 2] == J || matriz2[botfila][botcolum + 1] == J) {
                                            atacar = 1;
                                        }

                                        if (atacar == 1) {

                                            if (matriz2[botfila - 2][botcolum] == J || matriz2[botfila - 1][botcolum] == J || matriz2[botfila - 2][botcolum - 2] == J || matriz2[botfila - 2][botcolum - 1] == J || matriz2[botfila - 1][botcolum - 2] == J || matriz2[botfila - 1][botcolum - 1] == J || matriz2[botfila - 2][botcolum + 1] == J || matriz2[botfila - 2][botcolum + 2] == J || matriz2[botfila - 1][botcolum + 1] == J || matriz2[botfila - 1][botcolum - 2] == J) {
                                                bocolum = botcolum;
                                                bofila = botfila;
                                                botfila = botfila - 1;

                                                if (matriz2[botfila][botcolum] == O) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == G) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                    botfila = botfila + 1;
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }
                                                visionBot = visionBot + 1;
                                                movimientoB = movimientoB + 1;
                                            }

                                            if (matriz2[botfila + 2][botcolum] == J || matriz2[botfila + 1][botcolum] == J ||	matriz2[botfila + 1][botcolum - 2] == J || matriz2[botfila + 1][botcolum - 1] == J || matriz2[botfila + 2][botcolum - 2] == J || matriz2[botfila + 2][botcolum - 1] == J || matriz2[botfila + 1][botcolum + 1] == J || matriz2[botfila + 1][botcolum + 2] == J || matriz2[botfila + 2][botcolum + 1] == J || matriz2[botfila + 2][botcolum + 2] == J) {
                                                bocolum = botcolum;
                                                bofila = botfila;
                                                botfila = botfila + 1;

                                                if (matriz2[botfila][botcolum] == O) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == G) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'G';													
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                    botfila = botfila - 1;
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }	
                                                visionBot = visionBot + 1;
                                                movimientoB = movimientoB + 1;
                                            }

                                            if (matriz2[botfila][botcolum - 2] == J || matriz2[botfila][botcolum - 1] == J) {
                                                bofila = botfila;
                                                bocolum = botcolum;
                                                botcolum = botcolum - 1;

                                                if (matriz2[botfila][botcolum] == O) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == G) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                    botcolum = botcolum + 1;
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;     
                                                }
                                                visionBot = visionBot + 1;
                                                movimientoB = movimientoB + 1;
                                            }

                                            if (matriz2[botfila][botcolum + 2] == J || matriz2[botfila][botcolum + 1] == J) {
                                                bofila = botfila;
                                                bocolum = botcolum;
                                                botcolum = botcolum + 1;

                                                if (matriz2[botfila][botcolum] == O) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'O';
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == G) {							
                                                    matriz2[botfila][botcolum] = 'B';
                                                    matriz2[bofila][bocolum] = 'G';															
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                    botcolum = botcolum - 1;
                                                    turno = 0;
                                                }

                                                if (matriz2[botfila][botcolum] == J) {
                                                    System.out.println("    Atrapado");
                                                    turno = 1;
                                                    fallo = 0;
                                                    derrota = 1;
                                                    atrapadoBot = atrapadoBot + 1;
                                                }
                                                visionBot = visionBot + 1;
                                                movimientoB = movimientoB + 1;
                                            }

                                        } else {
                                            if (atacar == 0) {

                                                while (paso == 0) {		
                                                    int seguir = (int) (Math.random()*3);

                                                    if (seguir == 0) {
                                                        bofila = botfila;
                                                        bocolum = botcolum;
                                                        botcolum = botcolum - 1;

                                                        if (matriz2[botfila][botcolum] == O) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == G) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'G';	
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                            botcolum = botcolum + 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }

                                                    if (seguir == 1) {
                                                        bofila = botfila;
                                                        bocolum = botcolum;
                                                        botcolum = botcolum + 1;

                                                        if (matriz2[botfila][botcolum] == O) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == G) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                            botcolum = botcolum - 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;     
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }

                                                    if (seguir == 2) {
                                                        bocolum = botcolum;
                                                        bofila = botfila;
                                                        botfila = botfila - 1;

                                                        if (matriz2[botfila][botcolum] == O) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == G) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                            botfila = botfila + 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            paso = 1;
                                                            turno = 1;
                                                            fallo = 0;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }	

                                                    if (seguir == 3) {
                                                        bocolum = botcolum;
                                                        bofila = botfila;
                                                        botfila = botfila + 1;

                                                        if (matriz2[botfila][botcolum] == O) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'O';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == G) {							
                                                            matriz2[botfila][botcolum] = 'B';
                                                            matriz2[bofila][bocolum] = 'G';
                                                            paso = 1;
                                                            turno = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == U || matriz2[botfila][botcolum] == S) {
                                                            botfila = botfila - 1;
                                                            paso = 0;
                                                        }

                                                        if (matriz2[botfila][botcolum] == J) {
                                                            System.out.println("    Atrapado");
                                                            fallo = 0;
                                                            turno = 1;
                                                            paso = 1;
                                                            derrota = 1;
                                                            atrapadoBot = atrapadoBot + 1;
                                                        }
                                                        movimientoB = movimientoB + 1;
                                                    }
                                                }
                                            }
                                        }
                                    }

                                    if (fallo == 0) {
                                        System.out.println("    Perdiste");
                                        System.out.println();
                                        turno = 1;  
                                        perdido1 = perdido1 + 1;
                                    }

                                    if (fallo == 4) {
                                        System.out.println("    Felicidades has Ganado");
                                        System.out.println();
                                        turno = 1;
                                        partidasGanadas = partidasGanadas + 1;
                                        ganado = ganado + 1;
                                    }
                                }
                                System.out.println("Cantidad de Oro recolectado: " + oroAcumulado + " unidades de Oro");
                                oroPro = oroPro + oroAcumulado;
                                System.out.println("Cantidad de Movimientos realizados por el Jugador: " + movimientoJ);
                                movTotalesJ = movTotalesJ + movimientoJ;
                                System.out.println("Cantidad de vecez que se estuvo en la mira del Bot: " + visionBot);
                                
                    
                                if (derrota == 1) {
                                    System.out.println("Cantidad de Movimientos realizados por el Bot antes de atraparlo: " + movimientoB);
                                    derrota = 0;
                                } 
                                
                                partidasJugadas = partidasJugadas + 1;
                            }                           
                        }

                        if (opcion == 2) {

                        }  
                    }
                    
                    if (opcion1 == 2) {
                        int promedio;
                        int movPartida;

                        System.out.println("Capturas del Bot: " + atrapadoBot);
                        System.out.println("Partidas Ganadas: " + partidasGanadas);
                        promedio = oroPro / partidasJugadas;
                        System.out.println("Oro promedio por partida: " + promedio);
                        movPartida = movTotalesJ / partidasJugadas;
                        System.out.println("Promedio de movimientos por Partida: " + movPartida);
                        
                        if (jugado1 > jugado2){
                             System.out.println("Mapa más Jugado: MAPA Principal");
                        } else {
                             System.out.println("Mapa más Jugado: MAPA " + nombre);
                        }
                        
                        if (perdido > perdido1) {
                            System.out.println("Mapa donde más vecez a Perdido: MAPA Principal");
                        } else {
                            System.out.println("Mapa donde más vecez a Perdido: MAPA " + nombre);
                        }
                        
                        if (ganado > ganado1) {
                            System.out.println("Mapa donde más vecez a Ganado: MAPA Principal");
                        } else {
                            System.out.println("Mapa donde más vecez a Ganado: MAPA " + nombre);
                        }
                    }
                    
                    if (opcion1 == 3) {
                        System.out.println("Seleccione un Número");
                        System.out.println("    1. Ver MAPA: PRINCIPAL");
                        System.out.println("    2. ver MAPA: " + nombre);
                        mapaVer = scanner.nextInt();
                        
                        if (mapaVer == 1) {
                            for (int i = 0; i < 32; i++){
						
                                for (int j = 0; j < 32; j++) {
                                System.out.print(matriz[i][j]);
                                }
                                System.out.println();
                            }
                        }
                        
                        if (mapaVer == 2) {
                            for (int i = 0; i < borde; i++){
						
                                for (int j = 0; j < borde; j++) {
                                System.out.print(matriz2[i][j]);
                                }
                                System.out.println();
                            }
                        }
                    }
                    
                    if (opcion1 == 4) {
                        opcion = 5;
                    }
                }
                
                if (juicio == 1) {
                    opcion = 2;
                }
            }
            
            if (opcion == 3) {
                int promedio;
                int movPartida;
                
                System.out.println("Capturas del Bot: " + atrapadoBot);
                System.out.println("Partidas Ganadas: " + partidasGanadas);
                promedio = oroPro / partidasJugadas;
                System.out.println("Oro promedio por partida: " + promedio);
                movPartida = movTotalesJ / partidasJugadas;
                System.out.println("Promedio de movimientos por Partida: " + movPartida);
                System.out.println("Mapa más Jugado: MAPA Principal");
                System.out.println("Mapa donde más vecez a Perdido: MAPA Principal");
                System.out.println("Mapa donde más vecez a Ganado: MAPA Principal");
                
                System.out.println("MENÚ PRINCIPAL");
                System.out.println();
                System.out.println("Seleccione un Número:");
                System.out.println("    1. JUGAR");
                System.out.println("    2. CREAR MAPA");
                System.out.println("    3. REPORTES");
                System.out.println("    4. VISUALIZAR MAPA");
                System.out.println("    5. SALIR");
                opcion = scanner.nextInt();
                System.out.println();           
            }
            
            if (opcion == 4) {
                System.out.println("MAPA: Prinpipal");
                for (int i = 0; i < 32; i++){
						
                    for (int j = 0; j < 32; j++) {
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println();
                }
                
                System.out.println("MENÚ PRINCIPAL");
                System.out.println();
                System.out.println("Seleccione un Número:");
                System.out.println("    1. JUGAR");
                System.out.println("    2. CREAR MAPA");
                System.out.println("    3. REPORTES");
                System.out.println("    4. VISUALIZAR MAPA");
                System.out.println("    5. SALIR");
                opcion = scanner.nextInt();
                System.out.println();
            }
            
            if (opcion == 5) {
                System.out.println("--------Gracias por Jugar--------");
                System.out.println();
            }
        }
    }
}
