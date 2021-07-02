package by.app.freeITspringApp.controller;

import by.app.freeITspringApp.controller.dto.AuthorDto;
import by.app.freeITspringApp.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/create")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto authorDto) {
        return new ResponseEntity<>(authorService.createAuthor(authorDto), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(@RequestParam Integer id) {
        authorService.deleteAuthor(id);
    }

    @GetMapping("/show")
    public ResponseEntity<AuthorDto> getByID(@RequestParam Integer id) {
        return new ResponseEntity<>(authorService.getAuthorByID(id), HttpStatus.OK);
    }
}
