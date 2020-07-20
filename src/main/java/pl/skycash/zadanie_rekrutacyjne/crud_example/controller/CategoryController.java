package pl.skycash.zadanie_rekrutacyjne.crud_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Category;
import pl.skycash.zadanie_rekrutacyjne.crud_example.service.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> selectAllCategories() {
        return categoryService.selectAllCategories();
    }


}
