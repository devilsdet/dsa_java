package dsa_java.recursion;

public class AllPermutationOfString_11 {
    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        findAllPermutation(input, output);
    }

    private static void findAllPermutation(String input, String output) {
        if(input.length() == 0) {
            System.out.println(output);
            return;
        }
        String output1 = output;
        String output2 = output + input.charAt(0);
        input = input.substring(1);
        findAllPermutation(input, output1);
        findAllPermutation(input, output2);
    }
}
