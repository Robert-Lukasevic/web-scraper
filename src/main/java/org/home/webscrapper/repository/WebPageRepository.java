package org.home.webscrapper.repository;

import org.home.webscrapper.model.WebPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebPageRepository extends MongoRepository<WebPage, String> {
}