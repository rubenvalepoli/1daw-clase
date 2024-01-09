package ejercicios.tema09;

import java.util.ArrayList;

public class Main {

    private ArrayList<Product> listproduct = new ArrayList<>();


    public static void main(String[] args){



        Clothes clothes1 = new Clothes(1234,20,"camiseta","xxl","red");
        Clothes clothes2 = new Clothes(4567,50,"pantalon","xs","negro");
        Books books1 = new Books(7891,35,"Pepe","El amor");
        Books books2 = new Books(1122,10,"Antonio","Patomima");



        System.out.println(clothes1);
        System.out.println(clothes2);
        System.out.println(books1);
        System.out.println(books2);


    }

    public void addProduct (Product product) {listproduct.add(product);}


}
