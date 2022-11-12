public class Pila {

  // Necesito un top
  int top = -1;
  int max;
  int[] pila;

  public Pila(int max) {
    this.max = max;
    this.pila = new int[max];
  }

  void push(int dato) {
    try {
      this.pila[this.top + 1] = dato;
      this.top += 1;
    } catch (Exception e) {
      System.err.println("Ya esta llena la pila");
      System.err.println(e);
    }
  }

  void recorrido() {
    for (int i = 0; i < pila[top]; i++) {
      System.out.println(pila[i]);
    }
  }

  // Modelo que devuelve el valor
  int pop() {
    try {
      this.top -= 1;
      return pila[top];
    } catch (Exception e) {
      System.err.println("La pila esta vacia");
    }
    return 0;
  }
  // Por si acaso
  /*
   * void pop() {
   * if (top > -1) {
   * this.top -= 1;
   * } else {
   * System.out.println("La pila esta vacia");
   * }
   * }
   */
}
