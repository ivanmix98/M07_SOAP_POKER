/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

import edu.fje.daw2.Classes.Carta;

public class Jugada {
    
    int jugador;
    String accio;
    Carta carta;
    int aposta;
            
    public Jugada(String accio){
        this.jugador = 0;
        this.accio = accio;
        this.accio = new String();
        this.carta = new Carta();
    }
    public void setAposta(int aposta){
        this.aposta = aposta;
    }
    public void setCarta(Carta carta){
        this.carta = carta;
    }
}
