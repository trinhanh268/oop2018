package week7.task1;

public class Square extends Expression{
    Expression exp;
    Square(Expression _exp)
    {
        this.exp = _exp;
    }
    @Override
    public String toString(){
        return null;
    }
    @Override
    public int evaluate(){
        return this.exp.evaluate() * this.exp.evaluate();
    }
}
