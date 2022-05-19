package dsa_java.array.t2d;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        printSpiralMatrix(matrix);
    }

    private static void printSpiralMatrix(int[][] matrix) {
        int rowBegin = 0;
        int rowEnd = matrix.length-1;

        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for(int i=colBegin; i<=colEnd; i++) {
                System.out.print(matrix[rowBegin][i] + " ");
            }
            rowBegin++;

            for(int i=rowBegin; i<=rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            if(colBegin < colEnd) {
                for(int i=colEnd; i>=colBegin; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            if(rowEnd > rowBegin) {
                for(int i=rowEnd; i>=rowBegin; i--) {
                    System.out.print(matrix[i][colBegin] + " ");
                }
                colBegin++;
            }

        }
    }
}
