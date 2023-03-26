package br.com.livraria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "bookCategory")
@Getter
@Setter
public class BookCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBookCategory;

    private String name;
    @ManyToMany
    private List<BookModel> bookModels;

}
