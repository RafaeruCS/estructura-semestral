import java.util.Scanner;
public class ColaSimpleEnrique{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] colaS = new char[5];
        int frenteCS = -1, finCS =-1, max = 5, opcCS;
        char dato = 'a';
        do{
            System.out.println("          Operaciones con Cola Simple");
            System.out.println("1. Inserte elementos a la Cola\n2. Eliminar elementos a la cola\n3. Mostrar la Cola\n4. Retornar al Menu Principal\n5. Salir");
            opcCS = scan.nextInt();
            if(opcCS ==1){
                System.out.println("Introduzca el dato a insertar");
                dato = scan.next().charAt(0);
                insertarCS(colaS, finCS, frenteCS, max, dato);
            }
            else if(opcCS ==2){
                eliminarCC(colaS, finCS, frenteCS, max, dato);
            }
            else if(opcCS ==3){
                System.out.println(new String(colaS));
            }
        }while(opcCS!=5);
        scan.close();
    }

    static void insertarCS(char colaS[], int finCS, int frenteCS, int max, char dato){
        if(finCS<max-1){
            finCS +=1;
            colaS[finCS] = dato;
            frenteCS +=1;
        }
        else{
            System.out.println("Desbordamiento");
        }
    }
    
    static void eliminarCC(char colaS[], int finCS, int frenteCS, int max, char dato){
        if(frenteCS!= -1){
            dato = colaS[frenteCS];
            if(frenteCS == finCS){
                frenteCS = -1;
                finCS = -1;
            }
            else{
                frenteCS +=1;
            }
        }
        else{
            System.out.println("Subdesbordamiento");
        }
    }

}