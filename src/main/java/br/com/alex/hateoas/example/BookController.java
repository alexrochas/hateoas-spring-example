package br.com.alex.hateoas.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  @Autowired
  private BookRepository bookRepository;

  public Book getBookDetail(Long bookId) {
    return bookRepository.findOne(bookId);
  }
}
