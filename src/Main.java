import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args){
        int opcion;
        do {
            System.out.println("1.Crear Fichero");
            System.out.println("2.Mostrar");
            System.out.println("6.Salir");
            System.out.print("\nIntroducir opción: ");
            
            Socio[] tablaSocios = new Socio[4];

            tablaSocios[0] = new Socio(70, "pepe", "Castellón");
            tablaSocios[1] = new Socio(35 , "ana","Almazor");
            tablaSocios[2] = new Socio(7, "pepa","Vila-Real");
            tablaSocios[3] = new Socio(23, "cris","Valencia");
            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {





                    try ( ObjectOutputStream salida = new ObjectOutputStream(
                            new FileOutputStream("socios.dat"))) {
                        salida.writeObject(tablaSocios);
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                    System.out.println(Arrays.deepToString(tablaSocios));
                }
                case 2 -> {
                    System.out.print("Mostramos el contenido del fichero.");
                    try ( ObjectInputStream entrada = new ObjectInputStream(
                            new FileInputStream("socios.dat"))) {
                        tablaSocios = (Socio[]) entrada.readObject();
                    } catch (IOException | ClassNotFoundException ex) {
                        System.out.println(ex);
                    }
                    System.out.println(Arrays.deepToString(tablaSocios));
                }


            }
        } while (opcion != 3);
        System.out.println("Saliendo del menú");
    }
}
