import java.util.Arrays;
import java.util.Scanner;

/**
 * Aplicación que solicite por teclado las dimensiones de las matrices,
 * y las genere con números aleatorios.
 *
 * A continuación las muestre y multiplique cada una de ellas por
 * la media de la otra.
 */
public class Main {
    public static void main(String[] args) {
        int[][] array1=solicitar();
        aleatorio(array1);
        mostrarYSumaMatriz(array1);
        media(array1);

    }


    public static int[][] solicitar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("dimer el numero de filas");
        int filas=sc.nextInt();
        System.out.println("Dime el numero de columnas");
        int columnas=sc.nextInt();
        int[][] array=new int[filas][columnas];
        return array;
    }

    public static int[][] aleatorio(int[][] array1){
        for(int i=0;i<array1.length;i++){
            for(int h=0;h<array1[0].length;h++) {
                array1[i][h] = (int) (Math.random() * 100 + 1);
            }
        }
        return array1;
    }
public static int mostrarYSumaMatriz(int[][] array2){
   int suma=0;
    System.out.println("Array previo a la media: "+Arrays.deepToString(array2));
    for(int i=0;i<array2.length;i++){
        for(int h=0;h<array2[i].length;h++){
            suma =array2[i][h];
        }
    }
    return suma;
}
    public static double media(int suma,int[][] array3){
        double media=suma/array3.length*array3[0].length;
        return media;
    }


}
