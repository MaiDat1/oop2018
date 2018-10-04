package week3;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(10, Week3.max(8,10));
        assertEquals(-10, Week3.max(-922, -10));
        assertEquals(0, Week3.max(-2,0));
        assertEquals(4, Week3.max(-6, 4));
        assertEquals(80, Week3.max(50, 80));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMin(){
        int arr [] = {9, 10 , 1, 7, 5};
        assertEquals(1, Week3.minOfArray(arr));

        int arr1 []={9, 10 , 12, 7, 5, 1, 2};
        assertEquals(1, Week3.minOfArray(arr1));

        int arr2 [] = {-100, -98, -87, -1, 0, -6};
        assertEquals(-100, Week3.minOfArray(arr2));

        int arr3 [] ={0, 1, 2, 3, 6, 8, 9, -56, 82, 9};
        assertEquals(-56, Week3.minOfArray(arr3));

        int arr4 [] = {9, 10 , 100, 7, 5, -52, 69, 3, 58, -20};
        assertEquals(-52, Week3.minOfArray(arr4));

    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testBMI(){
        assertEquals("Thieu can", Week3.calculateBMI(49.5, 1.68));
        assertEquals("Binh thuong", Week3.calculateBMI(60, 1.7));
        assertEquals("Thieu can", Week3.calculateBMI(50, 1.72));
        assertEquals("Beo phi", Week3.calculateBMI(80, 1.7));
        assertEquals("Thieu can", Week3.calculateBMI(52, 1.82));
    }
}
