package ejercicios.tema09;

public class HD {

    private HDType type;
    private int capacity;

    public HD(HDType type, int capacity) {
        this.type = type;
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
