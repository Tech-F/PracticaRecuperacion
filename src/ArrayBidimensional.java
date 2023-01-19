import java.util.Arrays;

/**
 * Crear un array bidimensional de 4 filas y 5 columnas y rellenarlo con 20 números aleatorios entre 0 y 99.
 * A continuación, se mostrará el contenido del array
 * Posteriormente, se calcularán las sumas parciales de filas y columnas,
 * que aparecerán a la derecha de cada fila y debajo de cada columna.
 * La suma total debe aparecer en la esquina inferior derecha.
 */

public class ArrayBidimensional {
static int FILAS=4;
static int COLUMNAS=5;


    public static int[][] crearArray(){
        int[][] array=new int[FILAS][COLUMNAS];
        return array;
    }

    public static int[][] aleatorios(int[][] array){
        for(int i =0;i<array.length;i++){
            for(int h=0;h<array[0].length;h++){
                array[i][h]=(int)(Math.random()*99);
            }
        }
        System.out.println("Aqui tenemos los aleatorios" +Arrays.deepToString(array));
        return array;
    }

    public static void sumaParciales(int[][] array){

    }

    public static void main(String[] args) {

    }
}
