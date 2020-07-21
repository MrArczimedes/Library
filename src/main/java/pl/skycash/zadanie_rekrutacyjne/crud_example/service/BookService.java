package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;
import pl.skycash.zadanie_rekrutacyjne.crud_example.repository.BookRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> selectAllBooks() {
        return bookRepository.findAll();
    }

    public Book selectBookById(long id) {
        return bookRepository.findAllById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
