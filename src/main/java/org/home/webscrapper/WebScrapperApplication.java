package org.home.webscrapper;

import org.home.webscrapper.model.WebPage;
import org.home.webscrapper.repository.WebPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebScrapperApplication implements CommandLineRunner {

	@Autowired
	private WebPageRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(WebScrapperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		WebPage page = new WebPage("Example Title", "https://example.com");
		repository.save(page);
		System.out.println("Saved WebPage to MongoDB: " + page.getTitle());
	}
}
