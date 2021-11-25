package estruturasDeRepeticao;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número e a média
desses números.
 */
public class maiorMedia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Numero: ");
            numero = leia.nextInt();

            media = media + numero;

            if(numero > maior) maior = numero;
            contador++;
        }while (contador < 5);
        System.out.println("Maior numero: " + maior);
        System.out.println("Media: " + (media/5));
    }
}
