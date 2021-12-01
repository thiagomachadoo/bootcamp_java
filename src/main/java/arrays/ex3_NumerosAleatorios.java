package arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 a 100)
armazene-os nu vetor. Ao final mostre os números e sucessores.
 */
public class ex3_NumerosAleatorios {
    public static void main(String[] args) {
        //Gerar números aleatórios
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++)
        {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Números Aleatórios: ");
        for (int numero: numerosAleatorios){
            System.out.println(numero + " ");
        }
        System.out.println("Sucessores dos números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.println((numero+1) + " ");

        }
        System.out.println("Antecessor dos números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.println((numero-1) + " ");

        }
    }
}
