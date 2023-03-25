/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Superclases;

/**
 *
 * @author hp
 */
public abstract class Electronica extends Producto{
    
    private String fabricante;    
private String modelo;    
private int garantía; // <--- días de garantía    

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantía() {
        return garantía;
    }

    public void setGarantía(int garantía) {
        this.garantía = garantía;
    }


    public Electronica(String fabricante, String modelo, int garantía, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantía = garantía;
    }

    public Electronica() {
        super();
        this.fabricante = "---";
        this.modelo = "---";
        this.garantía = 0;
    }
    
   
}