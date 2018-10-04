package week3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void Testmax(){
        assertEquals(5,Week3.max(5,2));
        assertEquals(4,Week3.max(4,1));
        assertEquals(8,Week3.max(6,8));
        assertEquals(12,Week3.max(12,8));
        assertEquals(7,Week3.max(3,4));
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void TestminOfArray(){
        int a[] = {3,5,4,8};
        int b[] = {12,8,9,11};
        int[] c = {1,5,6,9,4}  ;
        int[] d = {15,13,12,20};
        int [] e = {20,30,40,50};
        assertEquals(3,Week3.minOfArray(a));
        assertEquals(8,Week3.minOfArray(b));
        assertEquals(1,Week3.minOfArray(c));
        assertEquals(12,Week3.minOfArray(d));
        assertEquals(20,Week3.minOfArray(e));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void TestcalculateBMI(){
        assertEquals("Thieu can",Week3.calculateBMI(50,1.72));
        assertEquals("Binh thuong",Week3.calculateBMI(65,1.75));
        assertEquals("Thua can",Week3.calculateBMI(67,1.67));
        assertEquals("Thieu can",Week3.calculateBMI(60,1.9));
        assertEquals("Beo phi",Week3.calculateBMI(90,1.72));
    }
}
