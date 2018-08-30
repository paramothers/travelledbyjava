package param.others.learningspringboot.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import param.others.learningspringboot.domain.Chapter;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
