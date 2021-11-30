package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class ex1_OrdemInversa {
    public static void main(String[] args) {

        int count = 0;
        int[] vetor = {1, 4, 5, 32, 2, 6};

        while(count < (vetor.length -1)){
            System.out.println(vetor[count]+ " ");
            count++;
        }
        for (int i = (vetor.length -1);i == 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
