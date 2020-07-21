package pl.skycash.zadanie_rekrutacyjne.crud_example.controller.dto;

import pl.skycash.zadanie_rekrutacyjne.crud_example.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookConvertDTO {
    public static List<BookDTO> convertToDTOs(List<Book> books){
        return books.stream()
                .map(book -> convertToDTO(book))
                .collect(Collectors.toList());
    }

    private static BookDTO convertToDTO(Book book) {
        return BookDTO.builder()
                .id(book.getId())
                .author(book.getAuthor())
                .name((book.getName()))
                .rate(book.getRate())
                .build();
    }
}
