package Introducao.Arrays;

public class ArrayMulti2 {

    public static void main(String[] args) {

        /*
        //array multi com 3 posições
        int[][] dias = new int[3][];

        //cada posição possui um array com dif tamanhos
        
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];
         */

        int[][] dias = {{1,2},{3,4,5},{6,7,8,9}};
        
        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}