package singleton.Ejercicio1;

public class app {
    public static void main(String[] args) {
        // llamamos la instancia Unica singleton de la clase logger
        Logger logger = Logger.getInstancia();
        logger.log(" entrando al sistema");
        logger.log(" bienvenido usuario ");

        // mediante el objeto de la clase Logger llamado logger invocamos el metodo para recorrer todos los loggers invocados
        logger.ShowLogs();
    }
}
