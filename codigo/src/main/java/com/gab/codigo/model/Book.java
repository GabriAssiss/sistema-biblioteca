/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.model;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private Date datePublication;

    public Book(String title, String author, String publisher, Date datePublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.datePublication = datePublication;
    }
    
    
}
