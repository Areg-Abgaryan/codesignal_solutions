public class DynamicProgrammingBasic
{
    public static int climbingStairs(int n)
    {
        if (n <= 3)
            return n;
        else
            return climbingStairs(n-1) + climbingStairs(n-2);
    }
    public static int climbingStairsAnotherSolution(int n)
    {
        if(n < 3)
            return n;

        int[] num = new int[n];
        num[0] = 1;
        num[1] = 2;

        for(int i = 2; i < n; ++i)
            num[i] = num[i - 1] + num[i - 2];

        return num[n - 1];
    }
}
