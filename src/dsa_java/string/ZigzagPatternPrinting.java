package dsa_java.string;

public class ZigzagPatternPrinting {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rows = 3;
        System.out.println(s);
        System.out.println( printInZigZag(s, rows));
    }

    private static String printInZigZag(String s, int rows) {
        StringBuilder[] sb = new StringBuilder[rows];
        for(int i=0; i<rows; i++ ) {
            sb[i] = new StringBuilder();
        }

        int i = 0;
        while (i< s.length()) {
            for(int j=0; j<rows && i<s.length(); j++ ) {
                sb[j].append(s.charAt(i));
                i++;
            }
            for(int j=rows-2; j>0 && i<s.length(); j--) {
                sb[j].append(s.charAt(i));
                i++;
            }
        }

        for(int k=1; k<sb.length; k++) {
            sb[0].append(sb[k]);
        }

        return sb[0].toString();

    }
}
