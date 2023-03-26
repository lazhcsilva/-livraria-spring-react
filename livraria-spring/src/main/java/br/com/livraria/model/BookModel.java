package br.com.livraria.model;


import jakarta.persistence.*;
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
    private String name;
    private String author;
    private Integer pages;
    @ManyToMany
    private List<BookCategoryModel> bookCategoryModels;



}
