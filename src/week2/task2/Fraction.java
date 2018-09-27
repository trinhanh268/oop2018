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

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result;
        result.numerator = this.numerator * orther.denominator + this.denominator * orther.numerator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction result;
        result.numerator = this.numerator * orther.denominator - orther.numerator * this.denominator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        result.numerator = this.numerator * orther.numerator;
        result.denominator = this.denominator * orther.denominator;
        return result;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        result.numerator = this.numerator * orther.denominator;
        result.denominator = this.denominator * orther.numerator;
        return result;
    }
    public boolean equals(Fraction other)
    {
        if ( this.numerator / this.denominator == other.numerator / other.denominator) return true;
        else return false;
    }
    public static void main(String[] args){
        Fraction num1 = new Fraction(-1,3);
        Fraction num2 = new Fraction(-1,6);
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

