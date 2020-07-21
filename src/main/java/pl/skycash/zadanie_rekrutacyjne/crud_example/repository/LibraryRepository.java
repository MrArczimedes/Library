package pl.skycash.zadanie_rekrutacyjne.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {

    @Query("select l from Library l")
    List<Library> findAllLibraries();

    @Query("select l from Library l where l.id = ?1")
    Library findLibraryById(long id);
}
