package ejercicios.tema09;

public class HD {

    private String type;
    private int capacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HD{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
