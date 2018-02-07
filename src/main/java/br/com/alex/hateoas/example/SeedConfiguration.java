package br.com.alex.hateoas.example;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
public class SeedConfiguration {

  @Autowired
  private TagRepository tagRepository;
  @Autowired
  private BookRepository bookRepository;

  @EventListener
  public void seed(ContextRefreshedEvent event) {
    Tag tagSpiritual = new Tag(1L, "Spiritual");
    Tag tagReligion = new Tag(2L, "Religion");
    tagRepository.save(tagSpiritual);
    tagRepository.save(tagReligion);
    bookRepository.save(new Book(1L, "Zen", "Art of Zen", Lists.newArrayList(tagSpiritual, tagReligion)));
  }

}
