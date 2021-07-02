package by.app.freeITspringApp.service;

import by.app.freeITspringApp.controller.dto.AuthorDto;

public interface AuthorService {
    AuthorDto createAuthor(AuthorDto authorDto);

    void deleteAuthor(Integer id);

    AuthorDto getAuthorByID(Integer id);

}
