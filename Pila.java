import java.util.ArrayList;

public class Pila {

  int max;
  int tope = -1;
  ArrayList<Integer> pila = new ArrayList<Integer>();

  public Pila(int max) {
    this.max = max;
  }

  void Push(int dato) {
    try {
      tope += 1;
      if (tope == max ) {
        System.out.println("Ya esta llena la pila");
        tope = max;
      } else if (tope > max ) {
        System.out.println("Desbordamiento");
        tope = max ;
      } else {
        pila.add(dato);
      }
    } catch (Exception e) {

      System.err.println(e);
    }
  }

  void Recorrido() {
    if (tope > -1) {
      System.out.println("Tope: " + tope);
      System.out.println("Cantidad de Items: " + pila.size() + "/" + max);
      System.out.println("Maximo: " + max);
      for (int i = 0; i < pila.size(); i++) {
        System.out.println(pila.get(i));
      }
    } else {
      System.out.println("La pila no tiene nada");
    }
  }

  void Pop() {
    try {
      tope -= 1;
      if (tope < -1) {
        System.out.println("Subdesbordamiento");
        tope = -1;
      } else if (tope == -1) {
        System.out.println("La pila esta vacia");
      } else {
        pila.remove(pila.size() - 1);
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

}
