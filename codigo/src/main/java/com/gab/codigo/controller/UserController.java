/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gab.codigo.controller;

import com.gab.codigo.model.User;

/**
 *
 * @author eduar
 */
public class UserController {
    
    public boolean userRegister(String cpf, String name, String email) {
      
        if(cpf.split(" ").length == 0 || name.split(" ").length == 0 || email.split(" ").length == 0 || name.isEmpty() || email.isEmpty()) {
            return false;
        }
        try {
            User user = new User(cpf, name, email);
        }
        catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    
    public String formatterCpf(String cpf) {
        
        String[] vetor;
        vetor = cpf.split("[.-]");
        String formattedCpf = String.join("", vetor);
        
        System.out.println(cpf);
        System.out.println(formattedCpf);
        return formattedCpf;
    }
}
