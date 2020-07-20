package pl.skycash.zadanie_rekrutacyjne.crud_example.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String zipcode;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "libraryId", updatable = false, insertable = false)
    private List<Category> categories;
}
