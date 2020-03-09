package Introducao.Arrays;

/**
 * ArraysMulti
 */
public class ArraysMulti {
    public static void main(String[] args) {
        // array de inteiros duas posições
        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        /*
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        */

        // iteração arrays multidimencionais com foreach
        for (int[] ref : dias) {
            for (int dia : ref) {
               System.out.println(dia); 
            }
        }
    }
    
}