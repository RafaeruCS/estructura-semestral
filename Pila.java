
public class Pila {

  int top = -1;
  int max;
  int[] pila;

  public Pila(int max) {
    this.max = max;
    this.pila = new int[max];
  }

  void push(int dato) {
    try {
      if (top == max) {
        System.out.println("Ya esta llena la pila");
      } else {

        this.pila[this.top + 1] = dato;
        this.top += 1;
      }
    } catch (Exception e) {

      System.err.println(e);
    }
  }

  void recorrido() {
    System.out.println("Tope: " + this.top);
    System.out.println("Maximo: " + this.max);
    for (int i = 0; i < pila[top]; i++) {
      System.out.println(pila[i]);
    }
    System.out.println("Tope: " + this.top);
  }

  void pop() {
    try {
      if (top > -1) {
        this.top -= 1;
      } else {
        System.out.println("La pila esta vacia");
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

}
