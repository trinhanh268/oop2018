/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape{
    private double length,width;
    public Rectangle(){}
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return (this.length * this.width);
    }

    public double getPerimeter(){
        return (this.length * this.width * 2);
    }

    public String toString(){
        return ("Rectangle: \n" + "Width: " + this.width + "\nLength:" + this.length + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter());
    }
}
