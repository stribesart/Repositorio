public class UtilizandoMath {
 public static void main(String[] args) {
  /*
   * Aqui estamos revisando los metodos de la clase math, lo gracioso es que como son metodos propios de java no se necesitan importar en la clase.
   */
  /*
   * Clase 9
   * 7 
   * int raiz = (int) Math.sqrt(9); // aqui se hace un casteo de double a int, ya que la constante raiz es entera.
   * 
   * double raizD = Math.sqrt(9); // aqui se declara la variable raizD como una variable doble, ya que el metodo sqrt recibe un dato de tipo double.
   */
   
  /*
   * Clase 10
   * 
   * Al casteo el profe lo conoce como refundicion
   */
  double base = 5;

  double exponente = 3;

  int resultado = (int) Math.pow(base, exponente);

  System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
 
 }
}
