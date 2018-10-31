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
public class Subtraction extends Expression{
    Expression n1, n2;
    public Subtraction(Expression a, Expression b)
    {
        this.n1 = a;
        this.n2 = b;
    }
    @Override
    public String toString()
    {
        return null;
    }
    @Override
    public int evaluate()
    {
        return this.n1.evaluate() - this.n2.evaluate();
    }
}
