package com.calculateArea;

public class triangle extends Calculator{
    public triangle (int x, int y) {
        height = x;
        base = y;
    }
    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getBase() {

        return base;
    }

    public void setBase(int base) {

        this.base = base;
    }

    private int height, base;
    @Override
    public int calculateArea(){
        return (height*base)/2 ;
    }
}
