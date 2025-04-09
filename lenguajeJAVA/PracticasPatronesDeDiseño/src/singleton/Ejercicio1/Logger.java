package singleton.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    // instancia unica de la clase
    private static Logger instanciaUnica;
    // lista para almacenar los mensaje de log

    private List<String> logs = new ArrayList<>();

    // contructor privado para evitar instancias directas
    private Logger() {
        System.out.println(" nueva instancia de logger creada");
    }
    // metodo estatico para obtener la instancia( singleton)
    public static Logger getInstancia() {

        if (instanciaUnica == null) {

            instanciaUnica = new Logger();
        }
        return instanciaUnica;

    }

    public void log(String mensaje) {

        logs.add(mensaje);
        System.out.println("log registrado"+ mensaje);

    }

public void ShowLogs(){
System.out.println(" === HIstorial de logs ===");

    for (String log: logs){
     System.out.println(" - "+ log);
    
    }


}


}
