package com.codewithharry.shape;

public class Cylinder extends Shape{

    public Cylinder(int a, int b) {
        super(a, b);
    }
    
    public double SurfaceArea(){
        return 2* Math.PI*this.a*(this.a+this.b);
    }

}
