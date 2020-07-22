package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;
import pl.skycash.zadanie_rekrutacyjne.crud_example.repository.BookRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> selectAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book selectBookById(long id) {
        return bookRepository.findAllById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }
}
