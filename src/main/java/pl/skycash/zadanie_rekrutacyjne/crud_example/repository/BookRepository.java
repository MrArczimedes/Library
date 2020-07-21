package pl.skycash.zadanie_rekrutacyjne.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findAll();

    List<Book> findAllByCategoryIdIn(List<Long> ids);

    @Query ("select b from Book b where b.id = ?1")
    Book findAllById(long id);
}
