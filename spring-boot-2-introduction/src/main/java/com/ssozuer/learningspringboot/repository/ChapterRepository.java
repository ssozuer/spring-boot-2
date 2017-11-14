package com.ssozuer.learningspringboot.repository;

import com.ssozuer.learningspringboot.entity.Chapter;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ChapterRepository extends ReactiveMongoRepository<Chapter, String> {

}
