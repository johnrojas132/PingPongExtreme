package pingpong;

import vista.VentanaPrincipal;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        //Se ejecuta en el hilo de eventos 
        SwingUtilities.invokeLater(() -> {

            //nombre del jugador izquierdo controla con W/S
            String nombreIzquierdo = solicitarNombreJugador(
                    "Nombre del jugador izquierdo (W / S):", "Jugador Izquierdo");

            // nombre del jugador derecho controla con las flechas
            String nombreDerecho = solicitarNombreJugador(
                    "Nombre del jugador derecho (\u2191 / \u2193):", "Jugador Derecho");

            //Se crea la ventana principal 
            VentanaPrincipal ventana = new VentanaPrincipal();

            //se asignan los nombres capturados antes de mostrar la ventana
            ventana.establecerNombresJugadores(nombreIzquierdo, nombreDerecho);

            ventana.setVisible(true);
        });
    }

    //solicita el nombre de un jugador, si cancela o deja el campo vacio, usa un nombre por defecto
    private static String solicitarNombreJugador(String mensaje, String nombrePorDefecto) {
        String nombre = JOptionPane.showInputDialog(
                null,
                mensaje,
                "Ping Pong Multihilo Extreme",
                JOptionPane.QUESTION_MESSAGE);

        if (nombre == null || nombre.trim().isEmpty()) {
            nombre = nombrePorDefecto;
        }

        return nombre.trim();
    }
}
