/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Superclases.Electronica;

/**
 *
 * @author hp
 */
public final class Computadora extends Electronica {
    

 private double tama;
    private int memoria;
    private String procesador;
    private String disco;

    public Computadora() {
        super();
        this.tama = 0;
        this.memoria = 0;
        this.procesador = "---";
        this.disco = "---";
    }



    public Computadora(double tama, int memoria, String procesador, String disco, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tama = tama;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }

    public void setTama(double tama) {
        this.tama = tama;
    }
    
    
    
    
    public double getTama() {
        return tama;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
    
    
    
    
    @Override
    public double precioVenta(int cant) {
        //10 unidades ---> precio es 80%
        if(cant<10){
            return getPrecio()*cant;
        }else{
            return (getPrecio()*0.8)*cant;
        }
    }
    
    
    
    
    
}