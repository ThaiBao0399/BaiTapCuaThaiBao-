
package baitapthaytrinh;

import java.util.HashMap;

public class Execise_8 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        countFrenquency(arr);
    }
 static void countFrenquency(int[] arr) {
HashMap<Integer, Integer> frenquencyMap = new HashMap<>();
for (int num : arr) {
    frenquencyMap.put(num, frenquencyMap.getOrDerfault(num, 0) + 1 ) {
    }
for (int key : frenquencyMap.keySet()){
        System.out.println(key + ": " + frenquencyMap.get(key) + " time " + frenquencyMap.get(key) > 1 ? "s" : ""));
} 
}
}
}
  
 