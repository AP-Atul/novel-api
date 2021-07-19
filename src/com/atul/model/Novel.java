package com.atul.model;

import java.util.List;

public class Novel {
    public String title;
    public String art;
    public String description;
    public String author;
    public String status;
    public String rating;
    public String url;
    public List<String> tags;
    public List<NovelChapter> chapters;

    public Novel() {
        title = null;
    }

    public Novel(String url, String title, String art, String description, String author, String status, String rating, List<String> tags, List<NovelChapter> chapters) {
        this.url = url;
        this.title = ifNull(title);
        this.art = ifNull(art);
        this.description = ifNull(description);
        this.author = ifNull(author);
        this.status = ifNull(status);
        this.rating = ifNull(rating);
        this.tags = tags;
        this.chapters = chapters;
    }

    private String ifNull(String val){
        return val == null ? "" : val;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", art='" + art + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                ", rating='" + rating + '\'' +
                ", url='" + url + '\'' +
                ", tags=" + tags +
                ", chapters=" + chapters +
                '}';
    }
}
