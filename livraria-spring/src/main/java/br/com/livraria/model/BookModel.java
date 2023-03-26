package br.com.livraria.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;
    @NotNull
    private String name;
    @NotNull
    private String author;
    @NotNull
    private Integer pages;
    @ManyToMany
    private List<BookCategoryModel> bookCategoryModels;



}
