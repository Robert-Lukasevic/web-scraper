package org.home.webscraper.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.home.webscraper.model.WebPage;
import org.home.webscraper.repository.WebPageRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebScraperService {

    private final WebPageRepository repository;

    public void saveWebPage(String title, String url) {
        WebPage page = new WebPage(title, url);
        repository.save(page);
        log.info("Saved webpage: {}", page);
    }

    public void scrapeAndSave(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            saveWebPage(title, url);
            log.info("Scraped and saved webpage: {} - {}", title, url);
        } catch (IOException e) {
            log.error("Error scraping webpage: {}", url, e);
        }
    }
}
