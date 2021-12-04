package logicaDeProgramacao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */
public class ex6_fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = leia.nextInt();

        int multiplicacao = 1;
        System.out.println(fatorial + "! = ");
        for(int i = fatorial;i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
