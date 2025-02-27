package dao;

import entity.Book;
import entity.BorrowedBook;
import jakarta.persistence.*;
import java.util.List;

public class LibraryDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
    private EntityManager em = emf.createEntityManager();

    public void save(Object entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    public Book findBookById(Long id) {
        return em.find(Book.class, id);
    }

    public List<BorrowedBook> getBorrowedBooksByStudent(Long studentId) {
        return em.createQuery("SELECT bb FROM BorrowedBook bb WHERE bb.student.id = :studentId", BorrowedBook.class)
                .setParameter("studentId", studentId)
                .getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
