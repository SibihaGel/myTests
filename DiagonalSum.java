package org.example;

public class DiagonalSum {

    static int [][] matrica =
            {
                    {1, 0, 0, 0, 0},
                    {0, 2, 0, 0, 0},
                    {0, 0, 3, 0, 0},
                    {0, 0, 0, 4, 0},
                    {0, 0, 0, 0, 5}
            };

    public static void main(String[] args) {

        int res = diagonalSum(matrica);

            System.out.print(res + " ");
        }

    public static int diagonalSum( int[][] matrix) {
        int sum = 0;
        int n = matrix.length; // 5 элементов

        /*

            Переменная sum инициализируется нулем, а переменная n получает значение длины матрицы.

          В цикле от 0 до n - 1 происходит обход матрицы по диагоналям.
          На каждом шаге цикла к сумме прибавляется текущий элемент на главной диагонали matrix[i][i]
          и элемент на побочной диагонали matrix[i][n - i - 1];

         */
        for (int i = 0; i < n; i++) {
//            System.out.println(i);
            sum += matrix[i][i];
            System.out.println(matrix[i][i]);

            sum += matrix[i][n - i - 1];
//            System.out.println(i);



        }
        if (n % 2 == 1) {
            sum -= matrix[n/2][n/2];
        }
        return sum;
    }
}
