package com.codewithharry.shape;

public class Sphere extends Shape{
    Sphere(int a){
        super(a);
    }

    public double SurArea() {
        return 4*Math.PI*this.a*this.a;

    }
}
