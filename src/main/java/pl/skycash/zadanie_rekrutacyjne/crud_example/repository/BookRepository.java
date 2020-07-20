package pl.skycash.zadanie_rekrutacyjne.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findAll();

    List<Book> findAllByCategoryIdIn(List<Long> ids);
}
