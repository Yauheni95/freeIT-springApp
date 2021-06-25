package service;

import controller.dto.BookDto;
import dao.BookDao;
import entities.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

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
}
