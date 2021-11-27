package estruturasDeRepeticao;

import java.util.Scanner;

/*
faça um programa que peça N números inteiros, calcule e mostre
a quantidade de números pares e a quantidade de números impares
 */
public class ex4_ParEImpar {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    int quantidadeNumeros;
    int contador = 0;
    int numero;
    int quantidadeDePares = 0;
    int quantidadeDeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = leia.nextInt();

        do {
            System.out.println("Número: ");
            numero = leia.nextInt();

            if(numero % 2 == 0) quantidadeDePares++;
            else quantidadeDeImpares++;


            contador++;

        }while(contador < quantidadeNumeros);

        System.out.println("Quantidade de pares: " + quantidadeDePares);
        System.out.println("Quantidade de impares: " + quantidadeDeImpares);
    }
}
