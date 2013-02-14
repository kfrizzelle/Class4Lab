/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Owner
 */
public class CircleCalculator {
    
    private double radius;
    
    public double getArea(){
        return Math.pow(Double.valueOf(radius), 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = Double.valueOf(radius);
    }
    
    
}
