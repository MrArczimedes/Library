package pl.skycash.zadanie_rekrutacyjne.crud_example.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BookDTO {
    private long id;
    private String name;
    private String author;
    private byte rate;

}
