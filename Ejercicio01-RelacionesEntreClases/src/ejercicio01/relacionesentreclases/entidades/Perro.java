/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.relacionesentreclases.entidades;

import ejercicio01.relacionesentreclases.entidades.enumeraciones.Raza;

/**
 *
 * @author ASUS
 */
public class Perro {
    private String nombre;
    private Raza razasDePerro;
    private Integer edad ;
    private Integer tamanio;

    public Perro() {
    }

    public Perro(String nombre, Raza razasDePerro, Integer edad, Integer tamanio) {
        this.nombre = nombre;
        this.razasDePerro = razasDePerro;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRazasDePerro() {
        return razasDePerro;
    }

    public void setRazasDePerro(Raza razasDePerro) {
        this.razasDePerro = razasDePerro;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", razasDePerro=" + razasDePerro + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

    
}
