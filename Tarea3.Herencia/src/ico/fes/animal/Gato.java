/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animal;

import java.awt.Color;

/**
 *
 * @author davis
 */
public class Gato extends Animal {

    private String raza;
    private String Genero;
    private Color color;

    public Gato() {
    }

    public Gato(String raza, String Genero, Color color) {
        this.raza = raza;
        this.Genero = Genero;
        this.color = color;
    }

    public Gato(String raza, String Genero, Color color, int numeroPatas, String sonido, int edad) {
        super(numeroPatas, sonido, edad);
        this.raza = raza;
        this.Genero = Genero;
        this.color = color;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + ", Genero=" + Genero + ", color=" + color + '}';
    }

    public void Maullar() {
        System.out.println("Miau");
    }

}
