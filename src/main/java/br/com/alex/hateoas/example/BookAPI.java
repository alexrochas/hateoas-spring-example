package br.com.alex.hateoas.example;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAPI {

  @Autowired
  private BookController bookService;

  @RequestMapping(value = "/books/{bookId}", method = RequestMethod.GET)
  public HttpEntity<Book> getBookById(@PathVariable Long bookId) {
    System.out.println(String.format("Searching for %s", bookId));
    Book bookDetail = bookService.getBookDetail(bookId);
    for (Tag tag : bookDetail.getTagsList()) {
      bookDetail.add(linkTo(methodOn(TagAPI.class).getTagById(tag.getId())).withRel("tags"));
    }
    return new ResponseEntity<Book>(bookDetail, HttpStatus.OK);
  }
}
