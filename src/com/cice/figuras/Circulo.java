/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.figuras;

/**
 *
 * @author TrendingPC
 */
public class Circulo {
    
    private double area;
    private double perimetro;
    private double radio;
    
    public Circulo(double rad) {
        radio = rad;
    
    }
    
    public double calcularArea (){
        
        area = 0;
        area = Math.PI * radio * radio;
        return area;
    }
    
    public double calcularPerimetro (){
        
        perimetro = 0;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }


}
    

