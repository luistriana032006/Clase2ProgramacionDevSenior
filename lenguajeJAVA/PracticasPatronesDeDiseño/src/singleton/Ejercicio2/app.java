package singleton.Ejercicio2;

public class app {

    public static void main(String[] args) {

        Appconfig config1 = Appconfig.getUnicaInstancia();
        config1.setNombreApp("bancolombia");
        config1.setVersionApp(1.3);

        /*
         * esto lo hacemos para verificar si desde otras partes del codigo seguimos 
         * manejando la misma instancia. 
         */
        
        // Appconfig config2 = Appconfig.getUnicaInstancia();
        // System.out.println(" la version es " + config2.getVersionApp());
        // System.out.println(" el nombre de la app es " + config2.getNombreApp());
        // System.out.println(config1 == config2);

        Appconfig config2 = Appconfig.getUnicaInstancia();
        config2.setVersionApp(4.5);
        config2.setNombreApp("banco davivienda");

        System.out.println(" el nombre  es "+config2.getNombreApp());
        System.out.println(" la version es "+config2.getVersionApp());

        /* 
         *  por que config 1 muestra los datos de config2
         * 
         * rta: config1 muestra los datos de config2 por que a config2 se le esta asignando la unica instancia 
         * de la clase AppConfig
         */

        // System.out.println(config1.getNombreApp());
         
    }
}
