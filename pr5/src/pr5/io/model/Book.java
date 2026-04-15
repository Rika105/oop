package pr5.io.model;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private transient int visitCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void visit() {
        visitCount++;
    }

    public String toString() {
        return title + " by " + author + " (visits: " + visitCount + ")";
    }
}
