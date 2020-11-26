package LibrarySystem;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String title;
    private String author;
    private int pages;
    private int maxTime=30;
    private int quantity;
    private static int count=0;

    public Book(String title, String author, int pages, int quantity){
        setId(id);
        setTitle(title);
        setAuthor(author);
        setPages(pages);
        autoIncrement();
        setId(count);
        setQuantity(quantity);


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void autoIncrement(){
        count++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public String toString(){
         return  "Book details are as follows: id: " +getId() + " title: " + getTitle() + " author: " + getAuthor() +
                " pages: " + getPages() + " quantity: " + getQuantity();


    }
}
