package estruturasDeRepeticao;

import java.util.Scanner;

/*
 Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
public class ex9_idade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int ano = 365;
        int mes = 30;
        int dia = 0;
        int idadeUsuario;
        int idadeEmAnos;
        int idadeEmMeses;
        int idadeEmDias;

        System.out.println("Digite sua idade em anos: ");
        idadeEmAnos = leia.nextInt();
        System.out.println("Digite sua idade em meses: ");
        idadeEmMeses = leia.nextInt();
        System.out.println("Digite sua idade em dias: ");
        idadeEmDias = leia.nextInt();

        idadeEmAnos = idadeEmAnos * ano;
        idadeEmMeses = idadeEmMeses * mes;
        idadeEmDias = idadeEmDias + dia;
        idadeUsuario = idadeEmAnos + idadeEmMeses + idadeEmDias;

        System.out.println("Você tem " + idadeUsuario + " dias de vida");




    }
}
