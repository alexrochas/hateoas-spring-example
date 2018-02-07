package br.com.alex.hateoas.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.hateoas.ResourceSupport;

@EnableAutoConfiguration
@Entity
public class Book extends ResourceSupport {

  @Id
  @GeneratedValue
  private Long bookId;
  private String title;
  private String resume;
  @JsonIgnore
  @OneToMany
  private List<Tag> tagsList;

  public Book() {
  }

  public Book(Long bookId, String title, String resume,
          List<Tag> tagsList) {
    this.bookId = bookId;
    this.title = title;
    this.resume = resume;
    this.tagsList = tagsList;
  }

  public Long getBookId() {
    return bookId;
  }

  public void setBookId(Long id) {
    this.bookId = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public List<Tag> getTagsList() {
    return tagsList;
  }

  public void setTagsList(List<Tag> tagsList) {
    this.tagsList = tagsList;
  }
}
