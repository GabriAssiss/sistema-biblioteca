/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.controller;

import com.gab.codigo.model.Book;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;


/**
 *
 * @author eduar
 */
public class BookController {
    
    public boolean bookRegister(String title, String author, String publisher, String date){
        if(title.split(" ").length == 0 || author.split(" ").length == 0 || publisher.split(" ").length == 0 || date.split(" ").length == 0) {
            return false;
        }
        else{
            try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate datePublication;
                try {
                datePublication = LocalDate.parse(date, formatter);
                }
                catch (DateTimeParseException e) {
                    return false;
                }
                Book book = new Book(title, author, publisher, datePublication);
            } catch(NullPointerException e){
                return false;
            }
            return true;
        }
    }
}

    
