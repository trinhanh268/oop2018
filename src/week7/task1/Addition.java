package week7.task1;

public class Addition extends Expression{
    Expression left;
    Expression right;
    public Addition (Expression _left, Expression _right)
    {
        this.left = _left;
        this.right = _right;
    }
    public Expression left(){
        return this.left;
    }
    
    public Expression right(){
        return this.right;
    }
    @Override
    public String toString(){
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public int evaluate(){
        return this.right.evaluate() + this.left.evaluate();
    }
    
}
