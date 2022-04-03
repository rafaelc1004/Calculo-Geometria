/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria_Calculos;

public class Circulos {
    
    private double diametro;

    public Circulos(double diametro) {
        this.diametro = diametro;
    }
    
    public Circulos() {
    	
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public double calcularRadioCirculo(){
        return diametro / 2;
    }
    
    public double calcularPerimetroCirculo(){
        return Math.PI * diametro;
    }
    
    public double calcularAreaCirculo(){
        double radio = calcularRadioCirculo();
        return Math.PI * Math.pow(radio, 2.0);
    }
    
}
