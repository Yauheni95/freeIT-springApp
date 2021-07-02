package by.app.freeITspringApp.service;

import by.app.freeITspringApp.controller.dto.AuthorDto;
import by.app.freeITspringApp.dao.AuthorDao;
import by.app.freeITspringApp.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    AuthorDao authorDao;

    @Autowired
    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setFirstName(authorDto.getFirstName());
        author.setLastName(authorDto.getLastName());
        author.setAge(authorDto.getAge());
        authorDao.save(author);
        return authorDto;
    }

    @Override
    public void deleteAuthor(Integer id) {
           authorDao.deleteById(id);
    }

    @Override
    public AuthorDto getAuthorByID(Integer id) {
        Author author = authorDao.getAuthorById(id);
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());
        authorDto.setAge(author.getAge());
        return authorDto;
    }


}
