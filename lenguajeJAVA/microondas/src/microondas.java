
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;



public class microondas extends JFrame {
    private JTextField tiempoField;
    private Timer timer;
    private int tiempo;
    private boolean isPaused; // Para verificar si el temporizador está pausado

    public microondas() {
        setTitle("Horno Microondas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false); // Ventana de tamaño fijo

        // Panel p1 para los botones numéricos
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        for (int i = 1; i <= 9; i++) {
            int num = i;
            JButton button = new JButton("" + num);
            button.addActionListener(e -> tiempoField.setText(tiempoField.getText() + num));
            p1.add(button);
        }

        JButton button0 = new JButton("0");
        button0.addActionListener(e -> tiempoField.setText(tiempoField.getText() + "0"));
        p1.add(button0);

        JButton startButton = new JButton("START");
        startButton.addActionListener(e -> iniciarContador());
        p1.add(startButton);

        JButton stopButton = new JButton("STOP");
        stopButton.addActionListener(e -> detenerContador());
        p1.add(stopButton);

        JButton resumeButton = new JButton("RESUME");
        resumeButton.addActionListener(e -> reanudarContador());
        p1.add(resumeButton);

        // Panel p2 para el campo de texto y p1
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        tiempoField = new JTextField("Introduce el tiempo en minutos");
        p2.add(tiempoField, BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        // Imagen de comida
        JLabel imagenComida = new JLabel(new ImageIcon("ruta/de/la/imagen.jpg"));
        add(imagenComida, BorderLayout.CENTER);

        // Añadir paneles al marco
        add(p2, BorderLayout.EAST);

        setSize(400, 250);
        setVisible(true);

        // Configurar el temporizador
        timer = new Timer(1000, e -> actualizarTiempo());
    }

    private void iniciarContador() {
        try {
            if (!isPaused) { // Solo establecer tiempo si no está pausado
                int minutos = Integer.parseInt(tiempoField.getText());
                tiempo = minutos * 60; // Convertir minutos a segundos
            }
            timer.start();
            isPaused = false;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor introduce un número válido.");
        }
    }

    private void detenerContador() {
        timer.stop();
        isPaused = true; // Indicar que el temporizador está pausado
    }

    private void reanudarContador() {
        if (isPaused) {
            timer.start(); // Reanudar el temporizador desde el tiempo pausado
            isPaused = false;
        }
    }

    private void actualizarTiempo() {
        if (tiempo > 0) {
            tiempo--;
            int minutos = tiempo / 60;
            int segundos = tiempo % 60;
            tiempoField.setText(String.format("%02d:%02d", minutos, segundos));
        } else {
            timer.stop();
            Toolkit.getDefaultToolkit().beep(); // Sonido
            JOptionPane.showMessageDialog(this, "¡La comida está lista!");
        }
    }

    public static void main(String[] args) {
        new microondas();
    }
}

