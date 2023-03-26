package br.com.livraria.service;

import br.com.livraria.model.BookModel;
import br.com.livraria.model.ResponseModel;
import br.com.livraria.repository.BookRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ResponseModel responseModel;

    public Iterable<BookModel> listBook(){
        return bookRepository.findAll();
    }

    public ResponseEntity<?> registerChange(BookModel bookModel, String action){
        if(bookModel.getName().equals("")){
            responseModel.setMessage("O nome do livro é obrigatório!");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else if (bookModel.getAuthor().equals("")){
            responseModel.setMessage("O nome do autor é obrigatório!");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else if (bookModel.getPages().equals("")){
            responseModel.setMessage("O número de páginas é obrigatório!");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        } else {
            if (action.equals("register")){
                return new ResponseEntity<BookModel>(bookRepository.save(bookModel), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<BookModel>(bookRepository.save(bookModel), HttpStatus.OK);
            }

        }
    }

}
