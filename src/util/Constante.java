package util;

import java.awt.Color;

//Clase con valores 
public class Constante {

    public static final String TITULO_VENTANA = "Ping Pong Multihilo Extreme";
    public static final int ANCHO_VENTANA = 900;
    public static final int ALTO_VENTANA = 600;

    //colores del area de juego y del marcador
    public static final Color COLOR_FONDO_JUEGO = Color.BLACK;
    public static final Color COLOR_TEXTO_MARCADOR = Color.WHITE;

    // Duracion de una ronda, en segundos
    public static final int TIEMPO_INICIAL_RONDA = 60;

    //teclas asignadas a cada jugador
    public static final int TECLA_IZQ_ARRIBA = java.awt.event.KeyEvent.VK_W;
    public static final int TECLA_IZQ_ABAJO = java.awt.event.KeyEvent.VK_S;
    public static final int TECLA_DER_ARRIBA = java.awt.event.KeyEvent.VK_UP;
    public static final int TECLA_DER_ABAJO = java.awt.event.KeyEvent.VK_DOWN;

    //constructor privado
    private Constante() {
    }
}
