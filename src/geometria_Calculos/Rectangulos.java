/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria_Calculos;

public class Rectangulos {
    
    private double altura;
    private double base;
    
    public Rectangulos(double altura, double base){
        this.altura = altura;
        this.base = base;
    }
    
    public Rectangulos() {
    	
    }

    public double calcularAreaRectangulo() {
        return altura * base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
}
