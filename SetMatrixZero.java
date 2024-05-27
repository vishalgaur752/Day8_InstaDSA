public class SetMatrixZero {
    public static void setZeros(int matrix[][]) {
        int numRow = matrix.length;
        int numCol = matrix[0].length;
        boolean hasZeroesFrstRow = false;
        boolean hasZeroesFirstCol = false;
        for (int i = 0; i < numCol; i++) {
            if (matrix[0][i] == 0) {
                hasZeroesFirstCol = true;
                break;
            }
        }
        for (int i = 0; i < numRow; i++) {
            if (matrix[i][0] == 0) {
                hasZeroesFirstCol = true;
                break;
            }
        }
        for (int i = 1; i < numRow; i++) {
            for (int j = 1; j < numCol; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < numRow; i++) {
            for (int j = 1; j < numCol; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeros(matrix);
    }
}
