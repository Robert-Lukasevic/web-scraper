package org.home.webscraper.repository;

import org.home.webscraper.model.WebPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebPageRepository extends MongoRepository<WebPage, String> {
}