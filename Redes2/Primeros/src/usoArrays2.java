import javax.swing.*;
public class usoArrays2 {
 public static void main(String[] args) {
  String[] paises = new String[8];

  // paises[0] = "España";
  // paises[1] = "Mexico";
  // paises[2] = "Colombia";
  // paises[3] = "Chile";
  // paises[4] = "Venezuela";
  // paises[5] = "USA";
  // paises[6] = "Africa";
  // paises[7] = "Cuba";

  // String[] paises = { "España", "Mexico", "Colombia", "Chile", "Venezuela", "USA", "Africa", "Cuba" };
  for (int i = 0 ; i < 8; i++) {
   paises[i] = JOptionPane.showInputDialog("Introduce pais ", (i + 1));
  }

  // for (int i = 0; i < paises.length; i++) {
  //  System.out.println("pais " + paises[i]);
  // }
  for (String elemento : paises) {
    System.out.println("Pais "+ elemento);
   }
 }
}
