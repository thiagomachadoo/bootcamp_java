package estruturasDeRepeticao;

import java.util.Scanner;

/*
 Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)


 */
public class ex7_salario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       int salarioMinimo = 788;
       int salarioUsuario;

       System.out.println("Digite seu salário: ");
       salarioUsuario = leia.nextInt();

       salarioUsuario = salarioUsuario / salarioMinimo;
        System.out.println("Você ganha um total aproximado de: " + salarioUsuario + " salários");
    }
}
