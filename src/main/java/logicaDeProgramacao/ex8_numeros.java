package logicaDeProgramacao;

import java.util.Scanner;

/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
public class ex8_numeros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        int numeros;
        int numerosImpares = 0;
        int numerosPares = 0;
        int contador = 0;


        for (int i = 0; i < 10; i++){
            System.out.println("Digite 10 números: ");
            numeros = leia.nextInt();
            if(numeros % 2 == 0) {
                numerosPares++;
            }else{
                numerosImpares++;
            }
            contador++;
        }
        System.out.println("Quantidade de pares: " + numerosPares);
        System.out.println("Quantidade de ímpares: " + numerosImpares);
    }
}
