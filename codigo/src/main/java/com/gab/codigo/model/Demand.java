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
public class Demand {
    private LocalDate dataPedido;
    private LocalDate dataExpiracao;
    private Client client;
    private Book loan; 
    private int idDemand; 

    public Demand(LocalDate dataPedido, Client client, Book loan, int idDemand) {
        this.dataPedido = dataPedido.now();
        this.dataExpiracao = dataPedido.plusDays(14);
        this.client = client;
        this.loan = loan;
        this.idDemand = idDemand;
    }
}
