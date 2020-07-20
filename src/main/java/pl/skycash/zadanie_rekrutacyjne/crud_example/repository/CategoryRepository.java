package pl.skycash.zadanie_rekrutacyjne.crud_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("select c from Category c")
    List<Category> findAllCategories();

}
