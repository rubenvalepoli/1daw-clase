package ejercicios.tema09;

public class Computer extends Product{

    String memoria;
    String cpu;
   String disco_duro;


    public Computer(int id, int price, String memoria, String cpu, String disco_duro) {
        super(id, price);
        this.memoria = memoria;
        this.cpu = cpu;
        this.disco_duro = disco_duro;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memoria='" + memoria + '\'' +
                ", cpu='" + cpu + '\'' +
                ", disco_duro='" + disco_duro + '\'' +
                '}';
    }


}
