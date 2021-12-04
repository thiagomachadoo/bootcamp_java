package logicaDeProgramacao;

/*
 Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class ex10_mediaAritimetica {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        int media123;
        int media456;
        int mediaFinal;

        media123 = (n1 + n2 + n3) / 3;
        System.out.println("A média de n1 n2 e n3 é: " + media123);
        media456 = (n4 + n5 + n6) / 3;
        System.out.println("A média de n4 n5 e n6 é: " + media456);


        mediaFinal = (media123 + media456) / 2;
        System.out.println("A média das médias é: " + mediaFinal);


    }
}
