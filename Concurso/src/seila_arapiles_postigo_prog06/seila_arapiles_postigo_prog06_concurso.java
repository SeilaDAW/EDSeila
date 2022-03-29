/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seila_arapiles_postigo_prog06;

//import java.util.Collections;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author Seila.
 * @tags El programa deberá permitir jugar a una versión simplificada
 * de un concurso de preguntas y respuestas en el que varios jugadores responden
 * preguntas por turnos, acumulan puntos y al final gana el que más puntos
 * tiene. Toda la interacción con los usuarios será mediante entrada y salida
 * estándar (teclado y pantalla).
 * 
 * 
 */

public class seila_arapiles_postigo_prog06_concurso {
   /** //funcion para mostar ganador*/
    private static void mostrarGanador(int contJug1, int contJug2, int contJug3, int contJug4, int contJug5, int contJug6) {
        System.out.println("¡Final del Juego!");
        if (contJug1 > contJug2 && contJug1 > contJug3 && contJug1 > contJug4 && contJug1 > contJug5 && contJug1 > contJug6) {
            System.out.println("El ganador es el jugador 1");
        }
        if (contJug2 > contJug1 && contJug2 > contJug3 && contJug2 > contJug4 && contJug2 > contJug5 && contJug2 > contJug6) {
            System.out.println("El ganador es el jugador 2");
        }
        if (contJug3 > contJug2 && contJug3 > contJug1 && contJug3 > contJug4 && contJug3 > contJug5 && contJug3 > contJug6) {
            System.out.println("El ganador es el jugador 3");
        }
        if (contJug4 > contJug2 && contJug4 > contJug3 && contJug4 > contJug1 && contJug4 > contJug5 && contJug4 > contJug6) {
            System.out.println("El ganador es el jugador 4");
        }
        if (contJug5 > contJug2 && contJug5 > contJug3 && contJug5 > contJug4 && contJug5 > contJug1 && contJug5 > contJug6) {
            System.out.println("El ganador es el jugador 5");
        }
        if (contJug6 > contJug2 && contJug6 > contJug3 && contJug6 > contJug4 && contJug6 > contJug5 && contJug6 > contJug1) {
            System.out.println("El ganador es el jugador 6 ");
        }

        /*
        * for (int p = 0; p < puntuacion.length; p++) {
        * int sumaPuntos = 0;
        * for (int m = 0; m < puntuacion[p].length; m++) {
        * sumaPuntos += puntuacion[p][m];
        * }
        * System.out.println("El jugador " + p + 1 + " tiene " + sumaPuntos +
        * " puntos");
        * }
         */
    }
        /**
     * funcion para mostrar puntos
     */
    private static void mostrarPuntos(int N, int contJug1, int contJug2, int contJug3, int contJug4, int contJug5, int contJug6) {
        // Mostrar puntos
        if (N == 1) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1 + " puntos");
        }
        if (N == 2) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1 + " puntos");
            System.out.println("Jugador 2: " + contJug2 + " puntos");
        }
        if (N == 3) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1 + " puntos");
            System.out.println("Jugador 2: " + contJug2 + " puntos");
            System.out.println("Jugador 3: " + contJug3 + " puntos");
        }
        if (N == 4) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1 + " puntos");
            System.out.println("Jugador 2: " + contJug2 + " puntos");
            System.out.println("Jugador 3: " + contJug3 + " puntos");
            System.out.println("Jugador 4: " + contJug4 + " puntos");
        }
        if (N == 5) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1 + " puntos");
            System.out.println("Jugador 2: " + contJug2 + " puntos");
            System.out.println("Jugador 3: " + contJug3 + " puntos");
            System.out.println("Jugador 4: " + contJug4 + " puntos");
            System.out.println("Jugador 5: " + contJug5 + " puntos");
        }
        if (N == 6) {
            System.out.println("Las puntuaciones serian las siguientes");
            System.out.println("Jugador 1: " + contJug1);
            System.out.println("Jugador 2: " + contJug2);
            System.out.println("Jugador 3: " + contJug3);
            System.out.println("Jugador 4: " + contJug4);
            System.out.println("Jugador 5: " + contJug5);
            System.out.println("Jugador 6: " + contJug6);
        }
    }
        /**
     * Metodo inicializar partida
     */
    private static int inicializarPartida(int N, String[][] jugadores, Scanner entrada, int rondas) {
        // recorremos la matriz
        for (int i = 0; i < N; i++) {
            // pedimos al usuario los nombres de los jugadores
            System.out.println("Introduce el nombre de los jugadores: ");
            // para almacenar los nombres de los jugadores
            jugadores[i][0] = entrada.next();
        }
        //ordenamos jugadadores aleatoriamente
        //Collections.shuffle(jugadores, numeroRandom(0, N));
        for (int j = 0; j < N; j++) {
            // ponemos los marcadores a cero usando Integer para tranformar
            jugadores[j][0] = Integer.toString(0);
        }
        //imprimimos por pantalla los mensajes al usuario
        System.out.println("¿Qué tipo de ronda quereis jugar");
        System.out.println("Elige entre las siguientes opciones 3 (partida rápida), 5 (partida corta),"
                + "10(partida normal) o 20 (partida larga).");
        rondas = entrada.nextInt(); //numero de rondas
        while (rondas != 3 && rondas != 5 && rondas != 10 && rondas != 20) {
            System.out.println(" Número incorrecto de rondas");
            System.out.println("Elige entre las siguientes opciones 3 (partida rápida), 5 (partida corta),"
                    + "10(partida normal) o 20 (partida larga).");
            rondas = entrada.nextInt();
        }
        System.out.println("Has elegido partida de " + rondas + " rondas");
        System.out.println("----------¡COMENCEMOS!----------");
        return rondas;
    }
        /**
     * Metodo para la expresion matematica
     */
    //funcion para la expresion matematica
    public static String exprMat() {
        int numCifras = numeroRandom(4, 8);// para las cifras
        int valorNum = numeroRandom(2, 12);
        String expreMat = Integer.toString(valorNum);
        for (int s = 0; s < numCifras - 1; s++) {// bucle de tamaño numcifras

            valorNum = numeroRandom(2, 12);
            int operacion = numeroRandom(0, 3);// generar num aleatorio para la operacion
            switch (operacion) {
                case 0:
                    expreMat = expreMat + "+" + valorNum;
                    break;
                case 1:
                    expreMat = expreMat + "-" + valorNum;
                    break;
                case 2:
                    expreMat = expreMat + "*" + valorNum;
                    break;
            }
        }

        return expreMat;
    }
        /**
     * Metodo para generar numero aleatorio
     */
    //funcion para el numero aleatorio
    public static int numeroRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
    //funcion para evaluar la expresion matematica
        /**
     * Metodo para evaluar la expresion matematica
     */
    public static int evaluarExpresion(String expresion) {
        int valor = 0;
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            Object result = engine.eval(expresion);
            valor = Integer.decode(result.toString());

        } catch (Exception e) {
            e.getMessage();
        }
        return valor;
    }
    
        /**
     * El main
     */
    public static void main(String[] args) {

        // creamos variable para jugadores
        int N = 0;

        // mostramos untexto de inicio de juego
        System.out.println("++++++++++ ¡Bienvenidos al concurso de Saber y Ganar !++++++++++ ");
        System.out.println(" Vamos a empezar a jugar");
        // creamos para que el usuario introduzca los datos necesarios
        Scanner entrada = new Scanner(System.in);

        int rondas = 0;// para saber cuanto va a durar cada ronda
        // le pedimos al usuario el numero de jugadores
        System.out.println(" Introduce el números de jugadores, pueden jugar de 1 a 6 personas ");
        N = entrada.nextInt();
        // creamos matriz con N jugadores y 2 para guardar el nombre y la puntuacion
        String jugadores[][] = new String[N][2];
        rondas = inicializarPartida(N, jugadores, entrada, rondas);
        // int puntuacion[][] = new int[rondas][N];
        int contJug1 = 0, contJug2 = 0, contJug3 = 0, contJug4 = 0, contJug5 = 0, contJug6 = 0;
        for (int p = 1; p <= rondas; p++) {
            for (int m = 0; m <= N - 1; m++) {
                String expMate = exprMat();
                // comprobamos si la respuesta del usuario es correcta
                int respuestaCorrecta = evaluarExpresion(expMate);
                System.out.println("La pregunta es " + expMate);
                System.out.println("Introduce tu respuesta ");
                System.out.println(respuestaCorrecta);// quitar luego
                int respuestaUsu = entrada.nextInt();
                if (respuestaUsu == respuestaCorrecta) {

                    if (m == 0) {
                        contJug1 += 1;
                    }
                    if (m == 1) {
                        contJug2 += 1;
                    }
                    if (m == 2) {
                        contJug3 += 1;
                    }
                    if (m == 3) {
                        contJug4 += 1;
                    }
                    if (m == 4) {
                        contJug5 += 1;
                    }
                    if (m == 5) {
                        contJug6 += 1;
                    }
                    System.out.println("Has acertado. Se suma un punto a tu marcador");

                } else {
                    System.out.println("¡Ohhhhhhhh!La respuesta no es correcta");
                    System.out.println("La respuesta correcta es: ");
                    System.out.println(respuestaCorrecta);
                    // puntuacion[p][m] = 0;
                }

            }
            System.out.println("************Siguiente Ronda************");
        }
        mostrarPuntos(N, contJug1, contJug2, contJug3, contJug4, contJug5, contJug6);
        mostrarGanador(contJug1, contJug2, contJug3, contJug4, contJug5, contJug6);
    }
}

/*Hasta aqui el programa, más abajo estan todos los intentos que he hecho para hacer
esta practica bien. Lo siento pero he sido incapaz de resolverlo por más que lo inteto,
sola no me ha salido.
*/
/*
     * int contRonda = 1;
     * int marcadorJugador = 0;
     * //rondas= rondas *N;//para que haga preguntas a todos los jugadores
     * int rond[][] = new int[rondas][N];
     * while (contRonda < rondas) {
     * while (marcadorJugador < N) {
     * //for (int k=0; k<rondas; k++){
     * //llamamos a la funcion de la pregunta matematica
     * String expMate = exprMat();
     * //comprobamos si la respuesta del usuario es correcta
     * int respuestaCorrecta = evaluarExpresion(expMate);
     * 
     * System.out.println("La pregunta es " + expMate);//poner nombre jugadores
     * System.out.println("Introduce tu respuesta ");
     * System.out.println(respuestaCorrecta);//quitar luego
     * int respuestaUsu = entrada.nextInt();
     * if (respuestaUsu == respuestaCorrecta) {
     * //for (int j = 0; j < N; j++) {
     * //int contJu1 = 0,contJu2=0,contJu3=0,contJu4=0,contJu5=0,contJu6=0;
     * //contJu1+= 1;
     * rond[contRonda][marcadorJugador] += 1;
     * System.out.println("Has acertado. Se suma un punto a tu marcador");
     * //}
     * 
     * } else {
     * System.out.println("¡Ohhhhhhhh!La respuesta no es correcta");
     * System.out.println("La respuesta correcta es: ");
     * System.out.println(respuestaCorrecta);
     * }
     * marcadorJugador++;
     * }
     * //Mostrar puntos
     * System.out.println("Los puntos de los " + N + " jugadores de la ronda " +
     * contRonda+ " son: ");
     * rondaFin(rond, contRonda);
     * contRonda++;
     * }
     * finalPuntos(rond);
     * }
 */
 /*
     * public static int rondaFin(int[][] rond, int rondas) {
     * int rondaFin = 0;
     * // finRonda (matriz,contRondas);
     * for (int m = 0; m < rond[rondas].length; m++) {
     * 
     * System.out.println("El jugador " + m + " tiene " + rond[rondas][m] +
     * " punto");
     * }
     * return rondaFin;
     * }
     * 
     * public static String finalPuntos(int[][] matriz) {
     * String finalPuntos = null;
     * System.out.println("Las puntuaciones finales de todos los jugadores son: ");
     * for (int p = 0; p < matriz[0].length; p++) {
     * int sumaPuntos = 0;
     * for (int i = 0; i < matriz.length; i++) {
     * sumaPuntos += matriz[i][p];
     * }
     * System.out.println("El jugador " + p + " tiene " + sumaPuntos + " punto");
     * }
     * return finalPuntos;
     * }
 */
