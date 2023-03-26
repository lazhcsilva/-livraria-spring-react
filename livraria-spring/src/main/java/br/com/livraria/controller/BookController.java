package br.com.livraria.controller;

import br.com.livraria.model.BookModel;
import br.com.livraria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody BookModel bookModel){
        return bookService.register(bookModel);
    }

    @GetMapping("/list")
    public Iterable<BookModel> list(){
        return bookService.list();
    }

    @GetMapping("/")
    public String route(){
        return "API Sucess!";
    }



}
