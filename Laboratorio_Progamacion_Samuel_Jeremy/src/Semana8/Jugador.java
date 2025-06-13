/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author unwir
 */
public class Jugador {
    private String playerN;
    private String passW;
    private int puntos;

    public Jugador(String playerN, String passW) {
        this.playerN = playerN;
        this.passW = passW;
        puntos = 0;
    }
    
    public boolean verificarPassWord(String passW){
        return this.passW.equals(passW);
    }

    public String getPlayerN() {
        return playerN;
    }

    public void setPlayerN(String playerN) {
        this.playerN = playerN;
    }

    public String getPassW() {
        return passW;
    }

    public void setPassW(String passW) {
        this.passW = passW;
    }
    
   
    
}
