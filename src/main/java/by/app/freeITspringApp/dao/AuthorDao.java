package by.app.freeITspringApp.dao;

import by.app.freeITspringApp.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDao extends JpaRepository <Author,Integer> {
    @Override
    void deleteById(Integer integer);

    Author getAuthorById(Integer id);

}
