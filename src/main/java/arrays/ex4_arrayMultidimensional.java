package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*
Gere e imprima uma matrix M 4X4 com valores aleatórios de 0-9
 */
public class ex4_arrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length;j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for(int[] linha : M){
            for (int elementoDaColuna: linha) {
                System.out.println( elementoDaColuna);

            }
            System.out.println();
        }


    }
}
