public class Level6_LabyrinthOfNestedLoops
{
    //  # 43
    public static boolean isPower(int n)
    {
        if (n == 1)
            return true;

        double a = 2, b = 2;
        while (Math.pow(a, 2) <= n)
        {
            while (Math.pow(a, b) <= n)
            {
                if (Math.pow(a, b) == n)
                    return true;
                ++b;
            }
            b = 2;
            ++a;
        }
        return false;
    }

    //  # 46
    public static int pagesNumberingWithInk(int current, int numberOfDigits)
    {
        int i = current, finalOutput = 0;
        while (numberOfDigits >= 0)
        {
            int tmp = helperGetNumberOfDigits(i);
            if (numberOfDigits - tmp < 0)
                break;
            numberOfDigits -= tmp;
            ++i;
            ++finalOutput;
        }
        return current + finalOutput - 1;
    }
    public static int helperGetNumberOfDigits(int number)
    {
        int tempNum = 0;
        while (number != 0)
        {
            number /= 10;
            ++tempNum;
        }
        return tempNum;
    }
}
