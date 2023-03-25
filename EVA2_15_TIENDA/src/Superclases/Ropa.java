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
public abstract class Ropa extends Producto{
 private String talla;   
private String color; 
private String marca;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public Ropa(String talla, String color, String marca, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.talla = talla;
        this.color = color;
        this.marca = marca;
    }

    public Ropa() {
     super();
        this.talla = "---";
        this.color = "---";
        this.marca = "---";  
    }
    
}
    

