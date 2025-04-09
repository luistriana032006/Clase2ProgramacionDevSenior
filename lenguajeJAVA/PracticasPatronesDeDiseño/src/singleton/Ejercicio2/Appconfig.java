package singleton.Ejercicio2;

/**
 * Ejercicio: Implementar una clase Singleton
 * Objetivo: Crear una clase Singleton que gestione la configuración de una
 * aplicación y garantice que solo exista una instancia de esta clase en el
 * programa.
 * Pasos:
 *
 * crear la clase: llamala AppConfig
 * agregar funcionalidad: añade metodos que permitan almacenar y recuperar configuraciones 
 * por ejemplo (nombre de la app, version de la app)
 */
public class Appconfig {
    private String nombreApp;
    private double versionApp;

    private static Appconfig instancia;

    public Appconfig() {
    }

    public static Appconfig getUnicaInstancia() {

        if (instancia == null) { // si la instancia es nula.

            instancia = new Appconfig(); // crear la instancia
        }

        return instancia; // RETORNAMOS LA INSTANCIA

        /**
         * AHORA NECESITAMOS UN LUGAR EN DONDE LLAMAR ESA INSTANCIA VAMOS A CREAR UNA
         * CLASE LLAMADA APP O MAIN
         */
    }

    public String getNombreApp() {
        return nombreApp;
    }
    
    public double getVersionApp() {
        return versionApp;
    }

// como funciona un set por dentro
    public void setNombreApp(String nombreApp) {
        this.nombreApp = nombreApp;
    }

    public void setVersionApp(double versionApp) {
        this.versionApp = versionApp;
    }


}
