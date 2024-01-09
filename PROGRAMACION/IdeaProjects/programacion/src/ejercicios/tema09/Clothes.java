package ejercicios.tema09;

public class Clothes extends Product{

    private String type,size,colour;

    public Clothes(int id, int price, String type, String size, String colour) {
        super(id, price);
        this.type = type;
        this.size = size;
        this.colour = colour;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
