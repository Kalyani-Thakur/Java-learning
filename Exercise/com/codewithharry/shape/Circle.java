package com.codewithharry.shape;

public class Circle extends Shape{
    Circle(int a){
        super(a);
    }

    public double Area(){
        return Math.PI*this.a*this.a;
    }
}
