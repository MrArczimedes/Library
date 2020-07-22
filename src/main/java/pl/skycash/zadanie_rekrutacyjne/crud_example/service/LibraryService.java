package pl.skycash.zadanie_rekrutacyjne.crud_example.service;

import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Library;

import java.util.List;

public interface LibraryService {

    List<Library> selectAllLibrariesWithBooks();

    Library addLibrary(Library library);

    void deleteLibraryById(long id);

    Library editLibrary(Library library);
}
