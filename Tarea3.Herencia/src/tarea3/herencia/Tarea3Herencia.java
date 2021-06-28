/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.herencia;

import ico.fes.animal.Animal;
import ico.fes.animal.Gato;
import ico.fes.animal.Perro;
import java.awt.Color;

/**
 *
 * @author davis
 */
public class Tarea3Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal animal1=new Animal(4, "no se");
        Perro animal1 = new Perro("Chihuahua", "Femenino", Color.black, 4, "Ladra", 5);
        Gato animal2 = new Gato("Siames", "Masculino", Color.white, 4, "Maulla", 4);

        animal1.vivo();
        System.out.println("Perro " + animal1.getRaza());
        System.out.println("Genero: " + animal1.getGenero());
        System.out.println("Tiene: " + animal1.getNumeroPatas() + " patas");
        System.out.println("Tiene: " + animal1.getEdad() + " años");
        System.out.println("Color: " + animal1.getColor());
        System.out.println("El perro " + animal1.getSonido());
        animal1.Ladrar();

        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

        animal2.vivo();
        System.out.println("Gato " + animal2.getRaza());
        System.out.println("Genero: " + animal2.getGenero());
        System.out.println("Tiene: " + animal2.getNumeroPatas() + " patas");
        System.out.println("Tiene: " + animal2.getEdad() + " años");
        System.out.println("Color: " + animal2.getColor());
        System.out.println("El gato " + animal2.getSonido());
        animal2.Maullar();
    }

}
