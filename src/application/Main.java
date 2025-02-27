package application;

import dao.LibraryDAO;
import entity.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        Author author = new Author();
        author.setName("J.K. Rowling");

        Biography biography = new Biography();
        biography.setDetails("Famous for the Harry Potter series");
        biography.setAuthor(author);
        author.setBiography(biography);

        dao.save(author);

        EBook ebook = new EBook();
        ebook.setTitle("Digital Java Guide");
        ebook.setDownloadUrl("http://ebooks.com/java");

        PrintedBook printedBook = new PrintedBook();
        printedBook.setTitle("Java for Beginners");
        printedBook.setNumberOfPages(500);

        dao.save(ebook);
        dao.save(printedBook);

        Student student = new Student();
        student.setName("Johannes");

        dao.save(student);

        BorrowedBook borrowedBook = new BorrowedBook();
        borrowedBook.setStudent(student);
        borrowedBook.setBook(ebook);
        borrowedBook.setBorrowDate(LocalDate.now());

        dao.save(borrowedBook);

        System.out.println("Data inserted successfully!");

        dao.close();
    }
}
