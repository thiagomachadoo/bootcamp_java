package logicaDeProgramacao;

import java.util.Scanner;

/*
Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando
a matrícula do aluno e o segundo
representando a sua altura em centímetros. (Pare inserindo o valor 0 no campo nome)
 */

public class ex2_nomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0"))break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("continua aqui");
    }
}
