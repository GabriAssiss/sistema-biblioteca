/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.model;

import java.time.LocalDate;

/**
 *
 * @author eduar
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private LocalDate datePublication;
    //private int idBook;

    public Book(String title, String author, String publisher, LocalDate datePublication/*, int idBook*/) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.datePublication = datePublication;
        //this.idBook = idBook;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }
    /*
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }*/

     public void bookRegister(Book book) {
         
     }
}
