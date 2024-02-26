package practiques;

public class Patitos {
    int num;
    int picos;
    int patas;
    public Patitos(int num) {
        this.num=num;
    }
    public boolean countPatitos(){
        if (num<0){
            return false;
        }
        patas=num*2;
        picos=num;
        return true;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPicos() {
        return picos;
    }


    public int getPatas() {
        return patas;
    }
}
