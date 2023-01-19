import java.util.Arrays;
import java.util.Scanner;

/**
 * Crear un array que contenga 30 números enteros aleatorios entre 0 y 99.
 * Crear un nuevo array con los números primos que haya entre esos 30 números.
 * A continuación debe mostrar el contenido de los dos arrays
 */
public class ArrayPrimos {

    public static void mostrar(int[] array1, int[] array2){
        System.out.println("Contenido array 1: "+Arrays.toString(array1));
        System.out.println("Contenido array 2: "+Arrays.toString(array2));
    }

    public static int[] primos(int[] array){
        int [] array2=crearArray();
        for(int i=0;i<array.length;i++){
            for(int h=0;h<array[i];h++){
                if (array[i]%h==0 && h!=0 && h!=i)
                    continue;
                else{

                    int l=0;
                    array2[l]=array[i];
                    l++;
                }
            }
        }
return array2;
    }

    public static int[] aleatorios(int [] array){
        for(int i=0;i<array.length;i++){
            array[i]=(int) (Math.random()*99);
        }
        System.out.println("El array con los números aleatorios: "+ Arrays.toString(array));
        return array;
    }

    public static int [] crearArray(){
        int[] array=new int[30];
        return array;
    }

    public static void main(String[] args) {
        int[] array1=aleatorios(crearArray());
        int[] array2=aleatorios(crearArray());
        primos(array2);
        mostrar(array1,array2);
    }
}
