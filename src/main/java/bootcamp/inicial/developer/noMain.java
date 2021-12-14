package bootcamp.inicial.developer;

import logicaDeProgramacao.ex16_Pilha;

public class noMain {
    public static void main(String[] args) {
        //Exercício ordenado onde nao foi preciso criar uma lista, replicar logica com lista
        ex16_Pilha minhaPilha = new ex16_Pilha();
        
        minhaPilha.push(new no1(1));
        minhaPilha.push(new no1(2));
        minhaPilha.push(new no1(3));
        minhaPilha.push(new no1(4));
        minhaPilha.push(new no1(5));
        minhaPilha.push(new no1(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
    }
}
