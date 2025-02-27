package entity;

import jakarta.persistence.*;

@Entity
public class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook() {
    }

    public PrintedBook(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
