package com.atul.model;

public class NovelChapter {
    public String chapter;
    public String content;
    public String url;

    public NovelChapter() { }

    public NovelChapter(String url, String chapter, String content) {
        this.url = ifNull(url);
        this.chapter = ifNull(chapter);
        this.content = ifNull(content);
    }

    private String ifNull(String val){
        return val == null ? "" : val;
    }

    @Override
    public String toString() {
        return "NovelChapter{" +
                "chapter='" + chapter + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
