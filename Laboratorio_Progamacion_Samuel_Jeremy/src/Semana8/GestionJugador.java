/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author unwir
 */
public class GestionJugador {
    private Jugador jugadorActual;
    private Jugador jugador2;
    private Jugador jugadores[] = new Jugador[5];
    private static GestionJugador intanciado;
    
    public static GestionJugador getInstance(){
        if(intanciado == null){
            intanciado = new GestionJugador();
        }
        return intanciado;
    }
    
    private Jugador buscarJugador(String nomJ){
        for(Jugador j : jugadores){
            if(j != null && j.getPlayerN().equals(nomJ))
                return j;
        }
        return null;
    }

    public Jugador getJugadorActual() {
        return jugadorActual;
    }
    
    public void cerrarSesion(){
        this.jugadorActual = null;
    }
    
    public boolean agregarJugador(String nomJ, String passW) {
        if (buscarJugador(nomJ) == null) {
            for (int i = 0; i < jugadores.length; i++) {
                if (jugadores[i] == null) {
                    jugadores[i] = new Jugador(nomJ, passW);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public boolean iniciarSesion(String nomJ, String passW){
        Jugador j = buscarJugador(nomJ);
        if (j != null) {
            if(j.verificarPassWord(passW)){
                jugadorActual = j;
                return true;
            }
        }
       return false;
    }

    
}
