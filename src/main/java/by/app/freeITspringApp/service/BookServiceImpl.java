package by.app.freeITspringApp.service;

import by.app.freeITspringApp.controller.dto.BookDto;
import by.app.freeITspringApp.dao.BookDao;
import by.app.freeITspringApp.entities.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public BookDto createBook(BookDto dto) {
        Book book = new Book();
        book.setId(dto.getId());
        book.setTitle(dto.getTitle());
        book.setGenre(dto.getGenre());
        bookDao.save(book);
        return dto;
    }

    @Override
    public void deleteById(Integer id) {
        bookDao.deleteById(id);
    }

    @Override
    public BookDto getBookById(Integer id) {
       Book book = bookDao.getBookById(id);
       BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setGenre(book.getGenre());
        return bookDto;
    }


}
