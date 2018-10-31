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
    Expression n1, n2;
    public Division(Expression nu1, Expression nu2)
    {
        this.n1 = nu1;
        this.n2 = nu2;
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
