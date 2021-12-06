package logicaDeProgramacao;
import java.util.Scanner;


public class ex11_nbs {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double numero;
            //nao existe numero -par ou -impar quando chamado em modulo
            System.out.print("Digite um número: ");
            numero = leia.nextDouble();
            if(numero < 0){
                System.out.print("Impossivel realizar, número negativo!");
            }else if(numero == 0){
                System.out.println("0 é neutro!!");
            }
            else if (numero % 2 == 0){
                System.out.print("Esse número é par!!");
                System.out.printf("A raiz quadrade de %f é %f !!!",numero,(Math.sqrt(numero)));
            }else if(numero %2 == 1){
                System.out.print("Esse número é impar!!");
                System.out.printf("O número %f ao quadrado é %f !!!",numero,Math.pow(numero,2));
            }
        }
    }
