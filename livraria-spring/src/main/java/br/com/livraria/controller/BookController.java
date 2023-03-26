package br.com.livraria.controller;

import br.com.livraria.model.BookModel;
import br.com.livraria.model.ResponseModel;
import br.com.livraria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @DeleteMapping("/removeBook/{idBook}")
    public ResponseEntity<ResponseModel> removeBook(@PathVariable long idBook){
        return bookService.removeBook(idBook);
    }

    @PutMapping("/change")
    public ResponseEntity<?> change(@RequestBody BookModel bookModel){
        return bookService.registerChange(bookModel, "change");
    }

    @PostMapping("/registerBook")
    public ResponseEntity<?> register(@RequestBody BookModel bookModel){
        return bookService.registerChange(bookModel, "register");
    }

    @GetMapping("/listBook")
    public Iterable<BookModel> listBook(){
        return bookService.listBook();
    }

    @GetMapping("/")
    public String route(){
        return "API Success!";
    }



}
