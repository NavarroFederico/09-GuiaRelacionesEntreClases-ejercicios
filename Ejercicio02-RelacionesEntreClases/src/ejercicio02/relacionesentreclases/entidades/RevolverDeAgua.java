/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.relacionesentreclases.entidades;

/**
 *
 * @author ASUS
 */
public class RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionDeAgua;

    public RevolverDeAgua(Integer posicionActual, Integer posicionDeAgua) {
        this.posicionActual = posicionActual;
        this.posicionDeAgua = posicionDeAgua;
    }

    public RevolverDeAgua() {
    }
    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionDeAgua() {
        return posicionDeAgua;
    }

    public void setPosicionDeAgua(Integer posicionDeAgua) {
        this.posicionDeAgua = posicionDeAgua;
    }
    
//METODOS
    
    public void llenarRevolver(){
        
    }
    public void mojar(){
        
    }
    public void siguienteChorro(){
        
    }
    
}
