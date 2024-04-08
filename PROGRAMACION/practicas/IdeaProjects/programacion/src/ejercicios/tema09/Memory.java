package ejercicios.tema09;

public class Memory {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}
