/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.model;

/**
 *
 * @author eduar
 */
public class Adress {
    private String cep;
    private String street;
    private int num;
    private String neighborhood;
    private String city;
    private String state;

    public Adress(String cep, String street, int num, String neighborhood, String city, String state) {
        this.cep = cep;
        this.street = street;
        this.num = num;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
    }
}
