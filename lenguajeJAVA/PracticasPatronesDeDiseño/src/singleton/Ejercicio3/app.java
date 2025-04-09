package singleton.Ejercicio3;

public class app {
    public static void main(String[] args) {
        Runnable tarea = () -> {
            singletonSeguro instancia = singletonSeguro.getInstancia();
            instancia.mostrarMensaje();
        };
        // creacion de los hilos 

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);
        Thread hilo3 = new Thread(tarea);
        Thread hilo4 = new Thread(tarea);

        // inicio de los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
