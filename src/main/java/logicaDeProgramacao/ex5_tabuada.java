package logicaDeProgramacao;

import java.util.Scanner;

/*
Desenvolva um gerador de taubada,
capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10.
O usuário deve informar de qual número ele
deseja ver a tabuada. A saída
deve ser conforme o exemplo abaixo

Tabuada de 5:
5x1 = 5
5x2 = 10
...
5x10 = 50
 */
public class ex5_tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada: ");
        tabuada = leia.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for(int i = 1;i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
