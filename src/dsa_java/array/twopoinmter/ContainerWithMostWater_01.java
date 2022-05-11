package dsa_java.array.twopoinmter;

public class ContainerWithMostWater_01 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(findMaxWater(arr));
    }

    private static int findMaxWater(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int max_area = 0;

        while (l < r) {
            if(arr[l] < arr[r]) {
                max_area = Math.max(max_area, arr[l] * (r - l));
                l++;
            } else {
                max_area = Math.max(max_area, arr[r] * (r - l));
                r--;
            }
        }
        return max_area;
    }

}
