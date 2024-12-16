package org.home.webscraper.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document("webpages")
public class WebPage {

    @Id
    private String id;
    private String title;
    private String url;

    public WebPage(String title, String url) {
        this.title = title;
        this.url = url;
    }
}
