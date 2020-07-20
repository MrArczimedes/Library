package pl.skycash.zadanie_rekrutacyjne.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {

    @Query("select l from Library l")
    List<Library> findAllLibraries();

}
