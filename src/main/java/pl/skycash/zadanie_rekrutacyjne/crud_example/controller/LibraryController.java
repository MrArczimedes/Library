package pl.skycash.zadanie_rekrutacyjne.crud_example.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;
import pl.skycash.zadanie_rekrutacyjne.crud_example.service.LibraryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @GetMapping("/libraries")
    public List<Library> selectAllLibraries(){
        return libraryService.selectAllLibraries();
    }
}
