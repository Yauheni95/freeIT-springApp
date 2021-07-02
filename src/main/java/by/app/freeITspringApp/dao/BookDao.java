package by.app.freeITspringApp.dao;

import by.app.freeITspringApp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
    @Override
    void deleteById(Integer integer);

    Book getBookById(Integer id);
}
