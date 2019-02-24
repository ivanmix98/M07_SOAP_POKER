package edu.fje.daw2;

import edu.fje.daw2.Classes.Carta;
import edu.fje.daw2.Classes.Jugada;
import edu.fje.daw2.Classes.Partida;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.*;

@WebService(serviceName = "Daw2WebService")
public class Daw2WebService {
    
    private ArrayList<Partida> Partidas = new ArrayList<Partida>();
    
    @WebMethod(operationName = "iniciarJoc")
    public boolean iniciarJoc(int codiPartida) {
        if(findPartida(codiPartida) != null) return false;
        else{
            Partida  newPartida = new Partida(codiPartida);
            Partidas.add(newPartida);
            return true;
        }
    }
    
    @WebMethod(operationName = "obtenirCarta")
    public Carta obtenirCarta(int codiPartida) {
        Partida CurrentPartida = findPartida(codiPartida);
        return CurrentPartida.getCarta();
    }
    
    @WebMethod(operationName = "mostrarCartes")
    public ArrayList<Carta> mostrarCartes(int codiPartida) {
        Partida CurrentPartida = findPartida(codiPartida);
        return CurrentPartida.getCartesTaula();
    }
    
    @WebMethod(operationName = "tirarCarta")
    public boolean tirarCarta(int codiPartida,Carta carta) {
        Partida CurrentPartida = findPartida(codiPartida);
        Jugada jugada = new Jugada("tirarCarta");
        jugada.setCarta(carta);
        CurrentPartida.setJugada(jugada);
        return true;
    }
    
    @WebMethod(operationName = "moureJugador")
    public boolean moureJugador(int codiPartida,int quantitat) {
        Partida CurrentPartida = findPartida(codiPartida);
        Jugada jugada = new Jugada("moureJugador");
        jugada.setAposta(quantitat);
        CurrentPartida.setJugada(jugada);
        return true;
    }
    
    @WebMethod(operationName = "acabarJoc")
    public boolean acabarJoc(int codiPartida) {
        Partida CurrentPartida = findPartida(codiPartida);
        if(CurrentPartida == null) return false;
        else{
            Partidas.remove(CurrentPartida);
            return true;
        }
    }
    
    private Partida findPartida(int codiPartida) {
            for(Partida partida : this.Partidas) {
                if(partida.getid() == codiPartida) {
                    return partida;
                }
            } 
        return null;
    }  
}
