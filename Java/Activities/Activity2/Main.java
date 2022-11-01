import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));

        //Set constants
        int searchNum = 10;
        int fixedSum = 30;
        Activity2 res= new Activity2();
        //Print result
        System.out.println("Result: " + res.result(numArr, searchNum, fixedSum));
    }
}