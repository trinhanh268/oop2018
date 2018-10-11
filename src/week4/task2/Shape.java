/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author Trinh Duc Anh
 */
public class Shape {
    private String color;
    private boolean filled;
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public Shape(){
        
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public String toString(){
    return ("Shape: " + "\nColor: " + this.color + "\nFilled: " + this.filled);
}
}
