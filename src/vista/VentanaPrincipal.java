package vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingUtilities;
import util.Constante;

public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    //ejemplo para saber si el juego esta en pausa o no
    private boolean enPausaEjemplo = false;

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null); 
        configurarEventosTeclado();
        conectarBotones();
    }

    //recibe los nombres capturados en Main y los muestra en el marcador
    public void establecerNombresJugadores(String nombreIzquierdo, String nombreDerecho) {

        lblNombreIzquierdo.setText(nombreIzquierdo);
        lblNombreDerecho.setText(nombreDerecho);

    }

    //conecta cada boton con su metodo correspondiente
    private void conectarBotones() {

        btnIniciar.addActionListener(evt -> iniciarJuego());
        btnPausarReanudar.addActionListener(evt -> pausarJuego());
        btnReiniciar.addActionListener(evt -> reiniciarJuego());

    }

    //teclas de movimiento (W, S, flechas), pero todavia no mueve nada
    //eso lo va a implementar el Integrante 2 Cris
    private void configurarEventosTeclado() {

        setFocusable(true);

        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()) {

                    case KeyEvent.VK_W:
                        //Integrante 2
                        break;

                    case KeyEvent.VK_S:
                        //Integrante 2
                        break;

                    case KeyEvent.VK_UP:
                        //Integrante 2
                        break;

                    case KeyEvent.VK_DOWN:
                        //Integrante 2
                        break;

                    default:
                        break;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

                //Integrante 2
            }

        });

    }

    //Iniciar 
    private void iniciarJuego() {

        System.out.println("Iniciar");

        requestFocusInWindow();

    }

    //boton Pausar/Reanudar 
    private void pausarJuego() {

        enPausaEjemplo = !enPausaEjemplo;

        String estado = enPausaEjemplo ? "PAUSADO" : "REANUDADO";

        System.out.println("Estado: " + estado);

    }

    // vuelve el marcador y el temporizador a sus valores iniciales
    private void reiniciarJuego() {

        System.out.println("Reiniciar");

        lblPuntosIzquierdo.setText("0");
        lblPuntosDerecho.setText("0");

        lblTemporizador.setText(
                String.valueOf(Constante.TIEMPO_INICIAL_RONDA));

    }

    //Devuelve el panel de juego para que otros integrantes dibujen sobre el
    public PanelJuego getPanelJuego() {

        return (PanelJuego) pnlJuego;

    }

    // Actualiza los puntos del jugador izquierdo
    public void actualizarPuntosIzquierdo(int puntos) {

        SwingUtilities.invokeLater(() ->
                lblPuntosIzquierdo.setText(String.valueOf(puntos)));

    }

    //actualiza los puntos del jugador derecho
    public void actualizarPuntosDerecho(int puntos) {

        SwingUtilities.invokeLater(() ->
                lblPuntosDerecho.setText(String.valueOf(puntos)));

    }

    //actualiza el temporizador visible
    public void actualizarTemporizador(int segundos) {

        SwingUtilities.invokeLater(() ->
                lblTemporizador.setText(String.valueOf(segundos)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreIzquierdo = new javax.swing.JLabel();
        lblPuntosIzquierdo = new javax.swing.JLabel();
        lblNombreDerecho = new javax.swing.JLabel();
        lblPuntosDerecho = new javax.swing.JLabel();
        lblTemporizador = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausarReanudar = new javax.swing.JButton();
        pnlJuego = new vista.PanelJuego();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ping Pong Multihilo Extreme");
        setResizable(false);

        lblNombreIzquierdo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreIzquierdo.setText("Jugador Izquierdo");
        lblNombreIzquierdo.setPreferredSize(new java.awt.Dimension(100, 16));

        lblPuntosIzquierdo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuntosIzquierdo.setText("0");
        lblPuntosIzquierdo.setPreferredSize(new java.awt.Dimension(100, 16));

        lblNombreDerecho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreDerecho.setText("Jugador Derecho");

        lblPuntosDerecho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPuntosDerecho.setText("0");
        lblPuntosDerecho.setFocusable(false);
        lblPuntosDerecho.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblTemporizador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTemporizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemporizador.setText("60");
        lblTemporizador.setToolTipText("");

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIniciar.setText("Iniciar partida");
        btnIniciar.setPreferredSize(new java.awt.Dimension(120, 39));

        btnPausarReanudar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPausarReanudar.setText("Pausar / Reanudar");
        btnPausarReanudar.setPreferredSize(new java.awt.Dimension(145, 39));

        pnlJuego.setPreferredSize(new java.awt.Dimension(900, 380));

        javax.swing.GroupLayout pnlJuegoLayout = new javax.swing.GroupLayout(pnlJuego);
        pnlJuego.setLayout(pnlJuegoLayout);
        pnlJuegoLayout.setHorizontalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoLayout.setVerticalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar partida");
        btnReiniciar.setMaximumSize(new java.awt.Dimension(155, 27));
        btnReiniciar.setMinimumSize(new java.awt.Dimension(155, 27));
        btnReiniciar.setPreferredSize(new java.awt.Dimension(120, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(196, 196, 196)
                        .addComponent(btnPausarReanudar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPuntosIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(lblTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(261, 261, 261)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreDerecho)
                    .addComponent(lblPuntosDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntosDerecho)
                    .addComponent(lblTemporizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPuntosIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPausarReanudar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausarReanudar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblNombreDerecho;
    private javax.swing.JLabel lblNombreIzquierdo;
    private javax.swing.JLabel lblPuntosDerecho;
    private javax.swing.JLabel lblPuntosIzquierdo;
    private javax.swing.JLabel lblTemporizador;
    private javax.swing.JPanel pnlJuego;
    // End of variables declaration//GEN-END:variables
}
