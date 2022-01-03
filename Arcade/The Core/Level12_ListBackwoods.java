public class Level12_ListBackwoods
{
    //  # 98
    public static int[] extractMatrixColumn(int[][] matrix, int column)
    {
        int[] extractedColumn = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i)
            extractedColumn[i] = matrix[i][column];
        return extractedColumn;
    }

    //  # 99
    public static boolean areIsomorphic(int[][] array1, int[][] array2)
    {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; ++i)
            if (array1[i].length != array2[i].length)
                return false;

        return true;
    }
}
