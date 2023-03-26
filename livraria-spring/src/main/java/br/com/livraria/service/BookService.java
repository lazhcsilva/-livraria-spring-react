package br.com.livraria.service;

import br.com.livraria.model.BookModel;
import br.com.livraria.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository br;

    public Iterable<BookModel> list(){
        return br.findAll();
    }

}
