package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(int va)
    {
        this.value = va;
    }
    public Numeral()
    {
        this.value = 2;
    }
    @Override
    public String toString(){
        return "Value: " + this.value;
    }
    @Override
    public int evaluate(){
        return this.value;
    }
}
