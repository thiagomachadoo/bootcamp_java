package bootcamp.inicial.developer;

public class no1 {

    private int dado;
    private no1 refNo = null;


    public no1(){

    }

    public no1(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no1 getRefNo() {
        return refNo;
    }

    public void setRefNo(no1 refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "no1{" +
                "dado=" + dado +
                '}';
    }
}
