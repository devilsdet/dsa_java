package dsa_java.windowsliding;

import java.util.HashMap;
import java.util.Map;

public class FruitInToBasket_10 {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C', 'B', 'B', 'C'};
        int k =2;
        System.out.println(findMaximumFruits(arr, k));
    }

    private static int findMaximumFruits(char[] arr, int k) {
        int i = 0;
        int j = 0;
        int result = Integer.MIN_VALUE;
        int windowSize = 0;
        Map<Character, Integer> hm = new HashMap<>();
        while (j < arr.length) {
            windowSize = (j-i+1);
            hm.put(arr[j], hm.getOrDefault(arr[j], 0)+1);
            if(hm.keySet().size() == k) {
                result = Math.max(result, windowSize);
            } else if (hm.keySet().size() > k) {
                while (hm.keySet().size() > k) {
                    hm.put(arr[i], hm.get(arr[i])-1);
                    if(hm.get(arr[i]) == 0) {
                        hm.remove(arr[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return result;
    }
}
