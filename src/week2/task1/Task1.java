package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if( a > b) return gcd( a - b, b);
        else if ( a < b) return gcd( a, b - a);
        else return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if( n == 1 || n == 2) return 1;
        if(n > 2) return fibonacci( n - 1) + fibonacci( n - 2 );
    }
}
