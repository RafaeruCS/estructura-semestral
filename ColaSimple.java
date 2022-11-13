import java.util.ArrayList;

public class ColaSimple {
  int finalcs = -1;
  int iniciocs = -1;
  int max;
  ArrayList<Integer> colaSimple = new ArrayList<Integer>();

  public ColaSimple(int max) {
    this.max = max;
  }

  void Insertar(int dato) {
    try {
      finalcs += 1;
      if (finalcs == 0) {
        iniciocs += 1;
        colaSimple.add(dato);
      } else if (finalcs == max) {
        System.out.println("La cola esta llena");
      } else if (finalcs > max) {
        finalcs = max;
      } else {
        colaSimple.add(dato);
        finalcs += 1;
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Eliminar() {
    try {
      iniciocs += 1;
      if (iniciocs == max) {
        System.out.println("La cola esta vacia");
      } else if (iniciocs == -1) {
        System.out.println("La cola no tiene nada");
      } else {
        colaSimple.remove(0);
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Recorrido() {
    if (iniciocs > -1 && finalcs <= max) {
      System.out.println("Iniciocs: " + iniciocs);
      System.out.println("Finalcs: " + finalcs);
      System.out.println("Maximo: " + max);
      for (int index = 0; index < colaSimple.size(); index++) {
        System.out.println(colaSimple.get(index));
      }
    }

  }
}
