/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

import edu.fje.daw2.Classes.Carta;
import java.util.ArrayList;

public class Partida {
    int id;
    Baralla baralla;
    int aposta;
    ArrayList<Jugada> jugades;
    ArrayList<Carta> cartesTaula;
    
    public Partida(int id){
        this.id      = id;
        this.baralla = new Baralla();
        this.cartesTaula = new ArrayList<Carta>();
        this.jugades = new ArrayList<Jugada>();
        treu5();
    }
    
    public int getid(){
        return this.id;
    }
    
    public Carta getCarta(){
        Carta c = this.baralla.baralla.get(0);
        this.baralla.baralla.remove(c);
        return c;
    }
    
    private void treu5(){
        for(int i=1;i<=5;i++){
             Carta c = this.baralla.baralla.get(0);
            this.baralla.baralla.remove(c);
            this.cartesTaula.add(c);
        }      
    }
    public ArrayList<Carta> getCartesTaula(){
        return this.cartesTaula;
    }
    public void setJugada(Jugada jugada){
        this.jugades.add(jugada);
    }
}
