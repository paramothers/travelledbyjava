package param.others.learningspringboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import param.others.learningspringboot.domain.Chapter;
import param.others.learningspringboot.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabse {
	
	@Bean
	CommandLineRunner init(ChapterRepository chapterRepository) {
		
		return args -> {Flux.just(
							new Chapter("First Book"),
							new Chapter("New chapter Book"),
							new Chapter(".. and more"))
			            .flatMap(chapterRepository::save)
			            .subscribe(System.out::println);			   
		};
	}

}
