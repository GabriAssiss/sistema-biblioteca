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
    //private int idDemand; 

    public Demand(LocalDate dataPedido, Client client, Book loan/*, int idDemand*/) {
        this.dataPedido = dataPedido.now();
        this.dataExpiracao = dataPedido.plusDays(14);
        this.client = client;
        this.loan = loan;
        //this.idDemand = idDemand;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getLoan() {
        return loan;
    }

    public void setLoan(Book loan) {
        this.loan = loan;
    }
    /*
    public int getIdDemand() {
        return idDemand;
    }

    public void setIdDemand(int idDemand) {
        this.idDemand = idDemand;
    }*/
}
