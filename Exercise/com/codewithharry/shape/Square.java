package com.codewithharry.shape;

class Square extends Shape{
    Square(int a){
        super(a);
    }

    public int Surface(){
        return this.a * this.a;
    }
}
