package clases_propias;

public class Pareja<T> { //clase generica

 public Pareja() {
  primero = null;
 }

 public void setPrimero(T nuevoValor) {
  primero = nuevoValor;
 }

 public T getPrimero() {
  return primero;
 }

 private T primero;
}