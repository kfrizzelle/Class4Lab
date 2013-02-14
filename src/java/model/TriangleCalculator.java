/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Owner
 */
public class TriangleCalculator {
    
    private double sideA;
    private double sideB;
    private double sideC;

    public double getThirdSide(){
        return Math.sqrt(Math.pow(sideC, 2)-Math.pow(sideB, 2));
    }
    //Have to create two methods, because I can't compare null to a double at this level.
    public double getHypotenuse(){
        return Math.sqrt(Math.pow(sideA, 2)+Math.pow(sideB, 2));
    }
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(String sideA) {
        this.sideA = Double.valueOf(sideA);
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(String sideB) {
        this.sideB = Double.valueOf(sideB);
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(String sideC) {
        this.sideC = Double.valueOf(sideC);
    }
    
}
