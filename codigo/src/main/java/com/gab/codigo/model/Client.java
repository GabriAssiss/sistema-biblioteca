/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.model;

/**
 *
 * @author eduar
 */
public class Client {
   private String nome;
   private String email;
   private String telefone;
   private int idClient;
   private Adress adress;

    public Client(String nome, String email, String telefone, int idClient, Adress adress) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idClient = idClient;
        this.adress = adress;
    }
}
