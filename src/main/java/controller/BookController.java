package controller;

import controller.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    public BookController (BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping
    public ResponseEntity <BookDto> createBook (@RequestBody BookDto book){
        return new ResponseEntity<>(bookService.createBook(book), HttpStatus.OK);
    }
}
