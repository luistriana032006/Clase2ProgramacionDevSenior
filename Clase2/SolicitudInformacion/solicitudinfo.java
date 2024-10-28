import java.util.Scanner;

public class solicitudinfo {
    /**
     * @param args
     */
    public static void main(String[] args) {
       
      Scanner entrada = new Scanner (System.in);
      // pedir datos //
        System.out.println( "digite palabra 1");
        String palabra1 = entrada.nextLine();
        System.out.println("digite la palabra 2");
        String palabra2 = entrada.nextLine();
        System.out.println("digite la palabra 3");
        String palabra3 = entrada.nextLine();
        
        // mostrar datos
        System.out.println("las palabras son " + palabra1 + palabra2 + palabra3);
        entrada.close();
   
    }
}
