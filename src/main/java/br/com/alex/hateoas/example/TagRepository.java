package br.com.alex.hateoas.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TagRepository extends CrudRepository<Tag, Long> {

}
