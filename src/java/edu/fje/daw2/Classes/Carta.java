/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

public class Carta {
    int numero;
    String pal;
    
    public Carta(){
        this.numero = 0;
        this.pal = " ";
    }
    
    public Carta(int numero, String pal){
        this.numero = numero;
        this.pal = pal;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getPal(){
        return this.pal;
    }
}
