
package baitapthaytrinh;

import java.util.Arrays;
import java.util.HashSet;

public class Execise_4 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        int[] outputArray = removeDuplicates(inputArray);
        
        System.out.println("Input: " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(outputArray));
    }

    public static int[] removeDuplicates(int[] array) {
    
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        for (int num : array) {
            uniqueElements.add(num);
        }
        

        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }
        return resultArray;
    }
}
 

