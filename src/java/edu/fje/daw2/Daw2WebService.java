package edu.fje.daw2;

import edu.fje.daw2.Classes.Carta;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.*;

@WebService(serviceName = "Daw2WebService")
public class Daw2WebService {
    
    private final StringBuilder lletres = new StringBuilder("ABCDEF");
    private final String lletresObtenides = "";
    
    @WebMethod(operationName = "iniciarJoc")
    public boolean iniciarJoc(int codiPartida) {
        return false;
    }
    
    @WebMethod(operationName = "obtenirCarta")
    public Carta obtenirCarta(int codiPartida) {
        return new Carta();
    }
    
    @WebMethod(operationName = "mostrarCartes")
    public Carta[] mostrarCartes(int mostrarCartes) {
        Carta[] cartes = null;
        
        return cartes;
    }
    
    @WebMethod(operationName = "tirarCarta")
    public void tirarCarta(int codiPartida,Carta carta) {

    }
    
    @WebMethod(operationName = "moureJugador")
    public void moureJugador(int codiPartida,boolean aposta, int quantitat) {

    }
    
    @WebMethod(operationName = "acabarJoc")
    public boolean acabarJoc(int codiPartida) {
        return false;
    }
}
