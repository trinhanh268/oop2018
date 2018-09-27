package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    public int numerator;
    public int denominator;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
     }

    public Fraction add(Fraction orther) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0,0);
        result.numerator = this.numerator * orther.denominator + this.denominator * orther.numerator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction subtract(Fraction orther) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0,0);
        result.numerator = this.numerator * orther.denominator - orther.numerator * this.denominator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction multiply(Fraction orther) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0,0);
        result.numerator = this.numerator * orther.numerator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction divide(Fraction orther) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result = new Fraction(0,0);
        result.numerator = this.numerator * orther.denominator;
        result.denominator = this.denominator * orther.numerator;
        return result;
    }
    public boolean equals(Fraction orther)
    {
        if ( this.numerator / this.denominator == orther.numerator / orther.denominator) return true;
        else return false;
    }
    public static void main(String[] args){
        Fraction num1 = new Fraction(1,4);
        Fraction num2 = new Fraction(2,8);
        Fraction result ;

        result = num1.add(num2);
        System.out.println(num1.numerator + "/" + num1.denominator + " + " + num2.numerator + "/" + num2.denominator + " = " + result.numerator + "/" + result.denominator);

        result = num1.subtract(num2);
        System.out.println(num1.numerator + "/" + num1.denominator + " - " + num2.numerator + "/" + num2.denominator + " = " + result.numerator + "/" + result.denominator);

        result = num1.multiply(num2);
        System.out.println(num1.numerator + "/" + num1.denominator + " * " + num2.numerator + "/" + num2.denominator + " = " + result.numerator + "/" + result.denominator);

        result = num1.divide(num2);
        System.out.println(num1.numerator + "/" + num1.denominator + " : " + num2.numerator + "/" + num2.denominator + " = " + result.numerator + "/" + result.denominator);

        if(num1.equals(num2)){
            System.out.println("Lon hon");
        }
        else System.out.println("Nho hon");
    }
}

