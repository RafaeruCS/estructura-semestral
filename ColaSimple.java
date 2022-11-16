import java.util.Arrays;

public class ColaSimple {
  int finalcs = -1;
  int iniciocs = -1;
  int max;
  String[] colaSimple;
  String[] colaSimpleGuia;

  public ColaSimple(int max) {
    this.max = max;
    this.colaSimple = new String[max];
    this.colaSimpleGuia = new String[max];
    for (int i = 0; i < colaSimple.length; i++) {
      colaSimple[i] = " ";
      colaSimpleGuia[i] = " ";
    }
  }

  void Insertar(String dato) {
    try {

      if (finalcs == -1) {
        iniciocs += 1;
        finalcs += 1;
        colaSimple[finalcs] = dato;
        colaSimpleGuia[finalcs] = "frente/final";
      } else if (finalcs == max - 1) {
        System.out.println("La cola esta llena");
        finalcs = max - 1;
      } else {
        finalcs += 1;
        colaSimple[finalcs] = dato;
        colaSimpleGuia[finalcs] = "final";
        colaSimpleGuia[finalcs - 1] = " ";
        colaSimpleGuia[iniciocs] = "frente";
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Eliminar() {
    try {
      if (iniciocs == max - 1) {
        System.out.println("La cola esta vacia");

      } else if (iniciocs == -1) {
        System.out.println("La cola no tiene nada");
      } else {
        colaSimpleGuia[iniciocs] = " ";
        colaSimple[iniciocs] = " ";
        iniciocs += 1;
        if (colaSimpleGuia[iniciocs].equals("final")) {
          colaSimpleGuia[iniciocs] = "frente/final";
        } else {
          colaSimpleGuia[iniciocs] = "frente";
        }
      }

    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Recorrido() {
    System.out.println("Frente: " + iniciocs);
    System.out.println("Final: " + finalcs);
    System.out.println("Maximo: " + max);
    System.out.println(Arrays.toString(colaSimple));
    System.out.println(Arrays.toString(colaSimpleGuia));
  }
}
