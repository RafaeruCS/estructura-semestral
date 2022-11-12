import javax.swing.JOptionPane;

public class Main {
  static public void menu() {
    while (true) {
      try {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Menu\n1. Hoja de presentacion\n2.  Operaciones con Pila\n3. Operaciones con Cola Simple\n4. Operaciones con Cola Circular\n5. Salir"));
        switch (opcion) {
          case 1:
            // Hoja de presentacion
            Presentacion.HojaDePresentacion();
            break;
          case 2:
            // Operaciones con Pila
            menuPila();
            break;
          case 3:
            // Operaciones con Cola
            menuCola();
            break;
          case 4:
            // Operaciones con Cola Circular
            menuColaCircular();
            break;
          case 5:
            // Salir
            System.out.println("Gracias por usar nuestros servicios");
            break;
          default:
            // En caso de que ingresen un numero que no de
            System.out.println("Ingrese una de las opciones dadas");
            break;
        }
        if (opcion == 5) {
          // salida
          break;
        }
      } catch (Exception e) {
        // control de errores
        System.out.println("Ingrese una de las opciones dadas");
        System.err.println(e);
      }

    }
  }

  static void menuPila() {
    int maximo = Integer
        .parseInt(JOptionPane.showInputDialog("Ingrese el valor maximo de la pila"));
    Pila pila = new Pila(maximo);
    while (true) {
      try {
        int opcionPila = Integer.parseInt(JOptionPane.showInputDialog(
            "Menu\n1. Insertar elementos a la Pila\n2. Eliminar elementos a la Pila\n3. Mostrar la Pila\n4. Volver a menu inicial"));
        switch (opcionPila) {
          case 1:
            // Ingresar elementos de la Pila
            int dato = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese un numero "));
            pila.push(dato);
            break;
          case 2:
            // Eliminar elementos de la pila
            pila.pop();
            break;
          case 3:
            // Mostrar la pila con el valor de tope
            pila.recorrido();
            break;
          case 4:
            // Operaciones con Cola Circular
            System.out.println("Volviendo al menu principal");
            break;
          default:
            // En caso de que ingresen un numero que no de
            System.out.println("Ingrese una de las opciones dadas");
            break;
        }
        if (opcionPila == 4) {
          // salida
          break;
        }
      } catch (Exception e) {
        // control de errores
        System.out.println("Ingrese una de las opciones dadas");
        System.err.println(e);
      }
    }
  }

  static void menuCola() {

  }

  static void menuColaCircular() {

  }
}
