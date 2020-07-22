package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;

import java.util.List;

public interface BookService {

    List<Book> selectAllBooks();

    Book selectBookById(long id);

    Book addBook(Book book);

    void deleteBook(long id);
}
