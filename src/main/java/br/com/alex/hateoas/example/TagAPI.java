package br.com.alex.hateoas.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagAPI {

  @Autowired
  private TagController tagService;

  @RequestMapping(value = "/tags/{tagId}", method = RequestMethod.GET)
  public HttpEntity<Tag> getTagById(@PathVariable Long tagId) {
    System.out.println(String.format("Searching for %s", tagId));
    return new ResponseEntity<Tag>(tagService.getTagDetail(tagId), HttpStatus.OK);
  }
}
