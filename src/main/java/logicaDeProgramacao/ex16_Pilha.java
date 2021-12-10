package logicaDeProgramacao;

import bootcamp.inicial.developer.no1;

public class ex16_Pilha {
    private no1 refNoEntradaPilha;

    public ex16_Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(no1 novoNo){
        no1 refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    public no1 pop(){
        if (!this.isEmpty()){
            no1 noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public no1 top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

}
