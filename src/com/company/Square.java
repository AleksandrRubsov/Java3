package com.company;

public class Square extends Rectangle {
    private double side;
    public Square(){

    }
    public Square(double side){
        this.side = side;

    }
    public Square(double side,String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;

    }
    public double getSide(){
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }

    public void setWidth(double side)
    {
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }
    public String toString(){
        return  "Square side: " + getSide() + "\nColor of square: " + this.getSide() + "\nColor of square: " + this.getColor();

    }


}
