import java.util.Arrays;

public class Pila {

  int max;
  int tope = -1;
  String[] pila;

  public Pila(int max) {
    this.max = max;
    this.pila = new String[max];
    for (int i = 0; i < pila.length; i++) {
      pila[i] = " ";
    }
  }

  void Push(String dato) {
    tope += 1;
    try {
      if (tope > max-1) {
        System.out.println("Desbordamiento");
        tope = max - 1;
      } else {
        pila[tope] = dato;
        if (tope == max-1) {
          System.out.println("Ya esta llena la pila");
          tope = max;
        }
      }
    } catch (Exception e) {

      System.err.println(e);
    }
  }

  void Recorrido() {
    if (tope > -1) {
      System.out.println("Tope: " + tope);
      System.out.println("Cantidad de Items: " + (tope + 1) + "/" + max);
      System.out.println("Maximo: " + max);
      System.out.println(Arrays.toString(pila));
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
        pila[tope + 1] = " ";
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

}