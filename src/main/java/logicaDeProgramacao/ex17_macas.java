package logicaDeProgramacao;

import java.util.Scanner;

/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.
 */
public class ex17_macas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

         double macasMenosDe6Und = 1.30;
         double macasUmaDuzia = 1.00;
         double macasCompradas;

        System.out.println("Quantas maças foram compradas?: ");
        macasCompradas = leia.nextDouble();

        if(macasCompradas <= 6.00){
            System.out.println("O preço final da sua compra é de: " + macasCompradas * macasMenosDe6Und);
        }else if(macasUmaDuzia >= 12.00){
            System.out.println("O preço final da sua compra é de: " + macasCompradas * macasUmaDuzia);
        }
    }
}
