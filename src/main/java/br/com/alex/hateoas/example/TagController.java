package br.com.alex.hateoas.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TagController {

  @Autowired
  private TagRepository tagRepository;

  public Tag getTagDetail(Long tagId) {
    return tagRepository.findOne(tagId);
  }

}
