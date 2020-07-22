package pl.skycash.zadanie_rekrutacyjne.crud_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.skycash.zadanie_rekrutacyjne.crud_example.controller.dto.BookConvertDTO;
import pl.skycash.zadanie_rekrutacyjne.crud_example.controller.dto.BookDTO;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;
import pl.skycash.zadanie_rekrutacyjne.crud_example.service.BookServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookService;

    @GetMapping("/books")
    public List<BookDTO> selectAllBooks(){
        return BookConvertDTO.convertToDTOs(bookService.selectAllBooks());
    }

    @GetMapping("/books/{id}")
    public Book selectBookById(@PathVariable long id){
        return bookService.selectBookById(id);
    }
    @PostMapping("/books/add")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("/books/delete/{id}")
    public void deleteBook(@PathVariable long id){
        bookService.deleteBook(id);
    }

}
