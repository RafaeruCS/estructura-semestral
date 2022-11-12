public class App {
    public static void main(String[] args) throws Exception {
        // Pila
        Pila pila = new Pila(4);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        // Recorrer la pila
        pila.recorrido();
        int resultado = pila.pop();
        System.out.println("Uso del pop " + resultado);
        // Recorrido de la pila luego de extraer el top
        if (pila.top > -1) {
        pila.recorrido();
        }else{
            System.out.println("Pila vacia");
        }
        // Cola
    }
}
