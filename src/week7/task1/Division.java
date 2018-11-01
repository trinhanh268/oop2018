/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author Trinh Duc Anh
 */
public class Division extends Expression{
    Expression left, right;
    public Division(Expression _left, Expression _right)
    {
        this.left = _left;
        this.right = _right;
    }
    @Override
    public Expression left()
    {
        return this.left;
    }
    @Override
    public Expression right()
    {
        return this.right;
    }
    @Override
    public String toString()
    {
        return null;
    }
    
    @Override
    public int evaluate(){
        return this.n1.evaluate() / this.n2.evaluate();
    }

}
