package pl.skycash.zadanie_rekrutacyjne.crud_example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long libraryId;
    private String name;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "categoryId", updatable = false, insertable = false)
    private List<Book> books;
}
