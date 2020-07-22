package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Category;
import pl.skycash.zadanie_rekrutacyjne.crud_example.repository.BookRepository;
import pl.skycash.zadanie_rekrutacyjne.crud_example.repository.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;

    @Override
    public List<Category> selectAllCategoriesWithBooks(){
        List<Category> allCategories = categoryRepository.findAllCategories();
        List<Long> ids = allCategories.stream()
                .map(category -> category.getId())
                .collect(Collectors.toList());
        List<Book> books = bookRepository.findAllByCategoryIdIn(ids);
        allCategories.forEach(category -> category.setBooks(fittingBooks
                (books, category.getId())));
        return allCategories;
    }
    private List<Book> fittingBooks(List<Book> books, Long id){
        return books.stream()
                .filter(book -> book.getCategoryId() == id)
                .collect(Collectors.toList());
    }

}
