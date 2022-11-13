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
      if(finalcs==-1){
        iniciocs+=1;
      }
      if (finalcs < max-1) {
        finalcs +=1;
        colaSimple.add(dato);
        if(finalcs==0){
          iniciocs=0;
        }
      } else {
        System.out.println("La cola esta llena");
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Eliminar() {
    try {
      if (iniciocs == -1) {
        System.out.println("La cola esta vacia");
      } else {
        colaSimple.remove(0);
        iniciocs += 1;
        if(iniciocs==max){
          iniciocs= -1;
          finalcs= -1;
        }
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  void Recorrido() {
    System.out.println("Frente: " + iniciocs);
    System.out.println("Final: " + finalcs);
    System.out.println("Max: " + max);
    for (int index = 0; index < colaSimple.size(); index++) {
      System.out.println(colaSimple.get(index));
    }

  }
}
