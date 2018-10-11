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
public class Main {
    public static void main(String[] args)
    {
        Square hinhVuong = new Square(5);
        Circle hinhTron = new Circle(5);
        Rectangle HCN = new Rectangle(4,5);
        Shape Hinh = new Shape("red",true);

        System.out.println(hinhVuong.toString());
        System.out.println(hinhTron.toString());
        System.out.println(HCN.toString());
        System.out.println(Hinh.toString());
    }
}
