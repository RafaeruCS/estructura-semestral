import java.util.Arrays;

public class ColaCircular {

  int finalcs = -1;
  int iniciocs = -1;
  int max;
  String[] colaCircular;
  String[] colaCircularGuia;

  public ColaCircular(int max) {
    this.max = max;
    this.colaCircular = new String[max];
    this.colaCircularGuia = new String[max];
    for (int i = 0; i < colaCircular.length; i++) {
      colaCircular[i] = " ";
      colaCircularGuia[i] = " ";
    }
  }

  void Insertar(String dato) {
    try {
      if (finalcs == -1) {
        iniciocs += 1;
        finalcs += 1;
        colaCircular[finalcs] = dato;
        colaCircularGuia[finalcs] = "frente/final";
      } else if (finalcs == max - 1 && iniciocs == 0) {
        System.out.println("La cola esta llena");
      } else if (finalcs == max - 1 && colaCircular[0].equals(" ")) {
        colaCircularGuia[finalcs] = " ";
        finalcs = 0;
        colaCircularGuia[finalcs] = "final";
      } else {
        finalcs += 1;
        colaCircular[finalcs] = dato;
        colaCircularGuia[finalcs] = "final";
        colaCircularGuia[finalcs - 1] = " ";
        colaCircularGuia[iniciocs] = "frente";
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
      } else if (iniciocs == max - 1 && colaCircular[0].equals(" ")) {
        colaCircularGuia[iniciocs] = " ";
        iniciocs = 0;
        colaCircularGuia[iniciocs] = "frente";
      } else {
        colaCircularGuia[iniciocs] = " ";
        iniciocs += 1;
        if (colaCircularGuia[iniciocs].equals("final")) {
          colaCircularGuia[iniciocs] = "frente/final";
        } else {
          colaCircularGuia[iniciocs] = "frente";
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
    System.out.println(Arrays.toString(colaCircular));
    System.out.println(Arrays.toString(colaCircularGuia));
  }
}
