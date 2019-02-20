/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

import edu.fje.daw2.Classes.Carta;

public class Jugada {
    
    int id;
    int jugador;
    String accio;
    Carta carta;
    int aposta;
            
    public void Jugada(int id, int jugador,String accio){
        this.id = id;
        this.jugador = 0;
        this.accio = accio;
    }
}
