package com.example.demo12.html;

public class Book {

    private String name;

    private String type;

    private int pages;

    private String author;

    public Book() {
    }

    public Book(String name, String type, int pages, String author) {
        this.name = name;
        this.type = type;
        this.pages = pages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
