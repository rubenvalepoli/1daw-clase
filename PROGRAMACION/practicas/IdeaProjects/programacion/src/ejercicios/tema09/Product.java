package ejercicios.tema09;

import static ejercicios.tema09.Books.discount;

public class Product {

    private int id, price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }



    public int getId() {
        return id;
    }


    public int getPrice() {
        price = (int) (price - discount);
        return price;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
