package org.example.back.domain;

public class Customer {

    private int id;
    private String Name;
    private int nif;

    public Customer(int id, String name, int nif) {
        this.id = id;
        Name = name;
        this.nif = nif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", nif=" + nif +
                '}';
    }
}
