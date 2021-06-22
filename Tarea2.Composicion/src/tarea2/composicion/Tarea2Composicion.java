/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2.composicion;

import ico.fes.comp.CPU;
import ico.fes.comp.Computadora;
import ico.fes.comp.Monitor;
import ico.fes.comp.Mouse;
import ico.fes.comp.Teclado;

/**
 *
 * @author davis
 */
public class Tarea2Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora PC1=new Computadora("LENOVO", "RH705", new Monitor("SAMSUNG", "QR36-9", 24), new Mouse("LOGITECH", "G203", "ALAMBRICO"), new Teclado("LOGITECH", "G213", 103, 9), new CPU("RYZEN", "5 3600", 3800));
    
        System.out.println("Computadora: " + PC1.getMarca());
        System.out.println("Modelo: " + PC1.getModelo());
        
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        
        System.out.println("Monitor: " + PC1.getMonitor().getMarca());
        System.out.println("Modelo: " + PC1.getMonitor().getModelo());
        System.out.println(PC1.getMonitor().getPulgadas()+ " Pulgadas");
        
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        
        System.out.println("Mouse: " + PC1.getMouse().getMarca());
        System.out.println("Modelo: " + PC1.getMouse().getModelo());
        System.out.println("Tipo: " + PC1.getMouse().getTipo());
        
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        
        System.out.println("Teclado: " + PC1.getTeclado().getMarca());
        System.out.println("Modelo: " + PC1.getTeclado().getModelo());
        System.out.println(PC1.getTeclado().getNumeroDeTeclas() + " teclas");
        System.out.println(PC1.getTeclado().getMultimedia() + " Multimedia");
        
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        
        System.out.println("CPU: " + PC1.getCpu().getMarca());
        System.out.println("Modelo: " + PC1.getCpu().getModelo());
        System.out.println(PC1.getCpu().getVelocidadProcesador() + " MHz");
        
    }
    
}
