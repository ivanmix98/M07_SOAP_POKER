/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

import edu.fje.daw2.Classes.Carta;

public class Partida {
    int id;
    Carta[] cartes;
    int aposta;
    public void Carta(int id,Carta[] cartes){
        this.id     = id;
        this.cartes = cartes;
    } 
}
