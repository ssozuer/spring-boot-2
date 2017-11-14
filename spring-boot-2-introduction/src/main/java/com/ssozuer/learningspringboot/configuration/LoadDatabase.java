package com.ssozuer.learningspringboot.configuration;


import com.ssozuer.learningspringboot.entity.Chapter;
import com.ssozuer.learningspringboot.repository.ChapterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Chapter 1"), new Chapter("Chapter 2"), new Chapter("Chapter 3")
            ).flatMap(repository::save).subscribe(System.out::println);
        };
    }
}
