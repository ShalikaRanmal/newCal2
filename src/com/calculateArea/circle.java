package com.calculateArea;
public class circle extends Calculator {
    public circle (int x){
        radius = x;
    }

    public int getRadios() {

        return radius;
    }

    public void setRadios(int radius) {
        this.radius = radius;
    }


    private int radius;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    private int diameter;

    @Override
    public int calculateArea(){
        return (int) Math.PI*radius*radius ;
    }
}
