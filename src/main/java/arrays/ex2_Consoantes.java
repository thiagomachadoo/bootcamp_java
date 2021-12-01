package arrays;


import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas.
Imprima as consoantes
 */
public class ex2_Consoantes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeDeConsoantes = 0;
        int contador = 0;
        do {
            System.out.println("Letra: ");
            String letra = leia.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                    consoantes[contador] = letra;
                    quantidadeDeConsoantes++;

        }

            contador++;
        }while (contador < consoantes.length);

        for (String consoante: consoantes) {
            if (consoante != null)
            System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: "+ quantidadeDeConsoantes);
    }
}
