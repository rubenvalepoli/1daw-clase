package ejercicios.tema09;

public class Books extends Product{

    private String author, title;

    public Books(int id, int price, String author, String title) {
        super(id, price);
        this.author = author;
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
