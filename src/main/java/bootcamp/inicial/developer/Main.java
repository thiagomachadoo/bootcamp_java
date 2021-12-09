package bootcamp.inicial.developer;

import logicaDeProgramacao.ex14_atribuicoesEtestes;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;

        System.out.println("int A = "+ a + " int B = " + b);
        a = 2;
        System.out.println("int A = "+ a + " int B = " + b);

        ex14_atribuicoesEtestes ex14A = new ex14_atribuicoesEtestes(1);
        ex14_atribuicoesEtestes ex14B = ex14A;

        System.out.println("obj A = "+ a + " obj B = " + b);
        ex14A.setNum(2);
        System.out.println("obj A = "+ a + " obj B = " + b);
    }
}
