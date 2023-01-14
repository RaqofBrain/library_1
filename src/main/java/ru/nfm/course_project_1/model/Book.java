package ru.nfm.course_project_1.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Название книги не может быть пустым")
    @Size(min = 10, max = 100, message = "Название книги должно быть от 10 до 100 символов длиной")
    private String title;
    @NotEmpty(message = "")
    @Size(min = 10, max = 100)
    private String author;
    @Min(value = 1400, message = "Год должен быть больше, чем 1400")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
