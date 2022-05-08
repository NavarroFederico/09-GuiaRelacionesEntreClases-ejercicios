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
public class Jugador {
   private Integer id;
   private String nombre;
   private Boolean mojado;
   private Integer numeroDeJugadores;

    public Jugador(Integer id, String nombre, Boolean mojado, Integer numeroDeJugadores) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public Jugador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public Integer getNumeroDeJugadores() {
        return numeroDeJugadores;
    }

    public void setNumeroDeJugadores(Integer numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }
   /**
    * si el revolver tira agua el jugador se moja. 
    * Atributo mojado pasa a false
    * @param revolver 
    */
   public void disparo(RevolverDeAgua revolver){
       revolver.mojar();
       revolver.siguienteChorro();
       
   }
 
   
}
