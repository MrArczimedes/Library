package pl.skycash.zadanie_rekrutacyjne.crud_example.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;
import pl.skycash.zadanie_rekrutacyjne.crud_example.service.LibraryServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryServiceImpl libraryService;

    @GetMapping("/libraries")
    public List<Library> selectAllLibrariesWithBooks(){
        return libraryService.selectAllLibrariesWithBooks();
    }

    @PostMapping("/libraries/add")
    public Library addLibrary(@RequestBody Library library){
        return libraryService.addLibrary(library);
    }

    @DeleteMapping("/library/delete/{id}")
    public void deleteLibraryById(long id){
        libraryService.deleteLibraryById(id);
    }

    @PutMapping("/library/edit")
    public Library editLibrary(@RequestBody Library library){
        return libraryService.editLibrary(library);
    }
}
