package singleton.Ejercicio3;

/**
 * Ejercicio: Implementar un Singleton Thread-Safe
 * Objetivo: Crear una clase Singleton que sea segura para entornos multihilo y
 * evite problemas de inicialización de instancia múltiple debido a condiciones
 * de carrera.
 * Requisitos:
 *  asegurarse de que la instancia se cree correctamente, incluso si varios hilos intentan 
 * acceder al metodo [getInstancia] al mismo tiempo
 * uso de mecanismo de synchornized o el enfoque de double-checked locking 
 * para implementar seguridad multihilo.
 * 
 * 
 */
public class singletonSeguro {
    // que es volatile ??
    private static volatile  singletonSeguro instancia;

    public singletonSeguro() {
    }
 
    // synchronzed que hace ?? 
    public static synchronized singletonSeguro getInstancia() {

        if (instancia == null) {
            instancia = new singletonSeguro();

        }
        return instancia;
    }
    public void mostrarMensaje(){
    System.out.println(" singleton seguro en acción");
    }
}
