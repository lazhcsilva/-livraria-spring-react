package br.com.livraria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String name;
    @ManyToMany
    private List<BookModel> bookModels;

}
