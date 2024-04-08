package ejercicios.tema09;

public class CPU {

    private CPUType model;


    public CPU(CPUType model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                '}';
    }
}
