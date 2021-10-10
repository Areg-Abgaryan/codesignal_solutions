public class Level2_EdgeOfTheOcean
{
    public static int adjacentElementsProduct(int[] inputArray)
    {
        int product = 0;
        if (inputArray.length == 0)
            return 0;
        if (inputArray.length == 1)
            return inputArray[0];
        else
        {
            product = inputArray[0] * inputArray[1];
            for (int i = 1; i < inputArray.length - 1; ++i)
            {
                if (inputArray[i] * inputArray[i+1] > product)
                    product = inputArray[i] * inputArray[i+1];
            }
        }
        return product;
    }

    public static int shapeArea(int n)
    {
        if (n == 1)
            return 1;
        else
            return shapeArea(n - 1) + 4 * (n - 1);
    }

    public static int makeArrayConsecutive2(int[] statues)
    {
        boolean[] indexCount = new boolean[21];
        for (int i = 0; i < statues.length; ++i)
            indexCount[statues[i]] = true;

        int firstTrueIndex = 0;
        for (int i = 0; i < indexCount.length; ++i)
        {
            if (indexCount[i] == true)
            {
                firstTrueIndex = i;
                break;
            }
        }

        int lastTrueIndex = 0;
        for (int g = indexCount.length - 1; g >= 0; --g)
        {
            if (indexCount[g] == true)
            {
                lastTrueIndex = g;
                break;
            }
        }

        int count = 0;
        for (int t = firstTrueIndex; t <= lastTrueIndex; ++t)
        {
            if (indexCount[t] == false)
                ++count;
        }

        return count;
    }

    public static int matrixElementsSum(int[][] matrix)
    {
        int cost = 0;
        for (int l_r = 0; l_r < matrix[0].length; ++l_r)
        {
            for (int u_d = 0; u_d < matrix.length; ++u_d)
            {
                if (matrix[u_d][l_r] == 0)
                    break;
                cost += matrix[u_d][l_r];
            }
        }
        return cost;
    }
}
