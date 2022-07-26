import javax.swing.*;

public class Entrada_ejemplo2 {
 public static void main(String[] args) {
  String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre porfavor");
  
  String edad = JOptionPane.showInputDialog("introduce la edad porfavor");

  int edadUsuario = Integer.parseInt(edad);

  edadUsuario++;

  System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + edadUsuario + " años."); 
 }
}
