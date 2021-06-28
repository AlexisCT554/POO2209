/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animal;

/**
 *
 * @author davis
 */
public class Animal {

    private int numeroPatas;
    private String sonido;
    private int edad;

    public Animal() {
    }

    public Animal(int numeroPatas, String sonido, int edad) {
        this.numeroPatas = numeroPatas;
        this.sonido = sonido;
        this.edad = edad;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", sonido=" + sonido + ", edad=" + edad + '}';
    }

    public void vivo() {
        System.out.println("Felicidades");
    }

    public void muerto() {
        System.out.println("Una pena");
    }

}
