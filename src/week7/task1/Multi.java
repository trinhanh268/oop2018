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
public class Multi extends Expression{
    Expression n1, n2;
    public Multi(Expression _n1, Expression _n2){
        this.n1 = _n1;
        this.n2 = _n2;
    }
    @Override
    public String toString()
    {
        return null;
    }
    @Override
    public int evaluate()
    {
        return this.n1.evaluate() + this.n2.evaluate();
    }
}
