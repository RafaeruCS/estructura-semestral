import java.util.Scanner;
public class ColaCircularEnrique{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] colaC = new char[5];
        int frenteCC = -1, finCC =-1, max = 5, opcCC;
        char dato = 'a';
        do{
            System.out.println("          Operaciones con Cola Circular");
            System.out.println("1. Inserte elementos a la Cola\n2. Eliminar elementos a la cola\n3. Mostrar la Cola\n4. Retornar al Menu Principal\n5. Salir");
            opcCC = scan.nextInt();
            if(opcCC ==1){
                System.out.println("Introduzca el dato a insertar");
                dato = scan.next().charAt(0);
                insertarCC(colaC, finCC, frenteCC, max, dato);
            }
            else if(opcCC ==2){
                eliminarCC(colaC, finCC, frenteCC, max, dato);
            }
            else if(opcCC ==3){
                System.out.println(new String(colaC));
            }
        }while(opcCC!=5);
        scan.close();
    }

    static void insertarCC(char colaC[], int finCC, int frenteCC, int max, char dato){
        if(finCC<max-1 && (frenteCC ==0 || finCC+1==frenteCC)){
            System.out.println("Desbordamiento");
        }
        else{
            if(finCC == max){
                finCC=0;
            }
            else{
                finCC+=1;
            }
            colaC[finCC]=dato;
            if(frenteCC==-1){
                frenteCC=0;
            }
        }
    }
    
    static void eliminarCC(char colaC[], int finCC, int frenteCC, int max, char dato){
        if(frenteCC== -1){
            System.out.println("Subdesbordamiento");
        }
        else{
            dato= colaC[frenteCC];
            if(frenteCC==finCC){
                frenteCC=-1;
                finCC=-1;
            }
            else{
                if(frenteCC==max-1){
                    frenteCC=0;
                }
                else{
                    frenteCC+=1;
                }
            }
        }
    }

}