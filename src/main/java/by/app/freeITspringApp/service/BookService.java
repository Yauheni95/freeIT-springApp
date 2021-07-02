package by.app.freeITspringApp.service;

import by.app.freeITspringApp.controller.dto.BookDto;


public interface BookService {

    BookDto createBook(BookDto book);

    void deleteById(Integer integer);

    BookDto getBookById(Integer id);


}
