import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DoubleSort2ArrTest {
    Setup2Arr arr=new Setup2Arr(3,6,2,7);
    @Test
    void testGetSecondArr(){
        int[]expected=new int[]{0,1,2,3};
        assertTrue(Arrays.equals(expected, arr.getSecondArr()));
        arr=new Setup2Arr(5,2,4,4,4);
        expected=new int[]{0,1,2,3,4};
        assertTrue(Arrays.equals(expected, arr.getSecondArr()));
    }
    @Test
    void sort2ArrAtSameTime(){
        int[] expected=new int[]{2,0,1,3};
        testSortResult(expected);
        int[] result;

        arr=new Setup2Arr(4,3,2,1);
        expected=new int[]{3,2,1,0};
        testSortResult(expected);
    }
    @Test
    void testPrintResult(){
        int[] testCase=new int[]{7,8,9,3};
        String result="7 8 9 3 ";
        assertEquals(result,Main.print(testCase));
    }
    private void testSortResult(int[] expected) {
        int[] result=Main.doubleSort2Arr_returnSubArr(arr.getFirstArr(),arr.getSecondArr());
        assertTrue(Arrays.equals(expected, result));
    }

}