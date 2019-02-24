/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2.Classes;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author joan
 */
public class Baralla {
    ArrayList<Carta> baralla;
    
    public Baralla(){
        this.baralla = new ArrayList<Carta>();
        baralla.add(new Carta(1,"Picas"));
        baralla.add(new Carta(2,"Picas"));
        baralla.add(new Carta(3,"Picas"));
        baralla.add(new Carta(4,"Picas"));
        baralla.add(new Carta(5,"Picas"));
        baralla.add(new Carta(6,"Picas"));
        baralla.add(new Carta(7,"Picas"));
        baralla.add(new Carta(8,"Picas"));
        baralla.add(new Carta(9,"Picas"));
        baralla.add(new Carta(10,"Picas"));
        baralla.add(new Carta(11,"Picas"));
        baralla.add(new Carta(12,"Picas"));
        
        baralla.add(new Carta(1,"Trevols"));
        baralla.add(new Carta(2,"Trevols"));
        baralla.add(new Carta(3,"Trevols"));
        baralla.add(new Carta(4,"Trevols"));
        baralla.add(new Carta(5,"Trevols"));
        baralla.add(new Carta(6,"Trevols"));
        baralla.add(new Carta(7,"Trevols"));
        baralla.add(new Carta(8,"Trevols"));
        baralla.add(new Carta(9,"Trevols"));
        baralla.add(new Carta(10,"Trevols"));
        baralla.add(new Carta(11,"Trevols"));
        baralla.add(new Carta(12,"Trevols"));
        
        baralla.add(new Carta(1,"Cors"));
        baralla.add(new Carta(2,"Cors"));
        baralla.add(new Carta(3,"Cors"));
        baralla.add(new Carta(4,"Cors"));
        baralla.add(new Carta(5,"Cors"));
        baralla.add(new Carta(6,"Cors"));
        baralla.add(new Carta(7,"Cors"));
        baralla.add(new Carta(8,"Cors"));
        baralla.add(new Carta(9,"Cors"));
        baralla.add(new Carta(10,"Cors"));
        baralla.add(new Carta(11,"Cors"));
        baralla.add(new Carta(12,"Cors"));
        
        baralla.add(new Carta(1,"Diamants"));
        baralla.add(new Carta(2,"Diamants"));
        baralla.add(new Carta(3,"Diamants"));
        baralla.add(new Carta(4,"Diamants"));
        baralla.add(new Carta(5,"Diamants"));
        baralla.add(new Carta(6,"Diamants"));
        baralla.add(new Carta(7,"Diamants"));
        baralla.add(new Carta(8,"Diamants"));
        baralla.add(new Carta(9,"Diamants"));
        baralla.add(new Carta(10,"Diamants"));
        baralla.add(new Carta(11,"Diamants"));
        baralla.add(new Carta(12,"Diamants"));
              
        //Barrejem
        Collections.shuffle(baralla);
    }
}
