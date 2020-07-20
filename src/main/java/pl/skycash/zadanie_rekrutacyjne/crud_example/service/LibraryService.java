package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Category;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;
import pl.skycash.zadanie_rekrutacyjne.crud_example.repository.LibraryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LibraryService {

    private final LibraryRepository libraryRepository;
    private final CategoryService categoryService;

    public List<Library> selectAllLibraries() {
        List<Library> allLibraries = libraryRepository.findAllLibraries();
        List<Category> categoriesWithBooks = categoryService.selectAllCategories();
        allLibraries.forEach(library -> library.setCategories(fittingCategoriesWithBooks(
                categoriesWithBooks, library.getId())));
        return allLibraries;
    }
    private List<Category> fittingCategoriesWithBooks(List<Category> allCategoriesWithBooks, long id){
        return allCategoriesWithBooks.stream()
                .filter(category -> category.getLibraryId() == id)
                .collect(Collectors.toList());
    }

}
