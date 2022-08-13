package herencia;

import java.io.*;

public class UsoArrayList {
 public static void main(String[] args) {
  
  ArrayList archivos = new ArrayList(5);

  archivos.add("juan");
  archivos.add("maria");
  archivos.add("ana");
  archivos.add("sandra");

  archivos.add(new File("gestion_pedidos.accdb"));

  String nombrePersona = (String) archivos.get(2); // se hace casteo de int a String

  System.out.println(nombrePersona);

 }
}
