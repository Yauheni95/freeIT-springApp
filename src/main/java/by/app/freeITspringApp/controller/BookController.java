package by.app.freeITspringApp.controller;

import by.app.freeITspringApp.controller.dto.BookDto;
import by.app.freeITspringApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    private final BookService bookService;
    @Autowired
    public BookController (BookService bookService){
        this.bookService=bookService;
    }

    @PostMapping
    public ResponseEntity <BookDto> createBook (@RequestBody BookDto book){
        return new ResponseEntity<>(bookService.createBook(book), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@RequestParam Integer id) {
       bookService.deleteById(id);
    }

    @GetMapping("/show")
    public ResponseEntity<BookDto> getByID(@RequestParam Integer id) {
        return new ResponseEntity<>(bookService.getBookById(id), HttpStatus.OK);
    }


}
