public class Level9_DarkWilderness
{
    //  # 38
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight)
    {
        int tempHeight = 0;
        int numberOfDays = 0;

        while (tempHeight < desiredHeight)
        {
            tempHeight += upSpeed;
            ++numberOfDays;

            if (tempHeight >= desiredHeight)
                return numberOfDays;

            tempHeight -= downSpeed;
        }
        return numberOfDays;
    }

    //  # 39
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW)
    {
        if (weight1 + weight2 <= maxW)
            return value1 + value2;
        if (weight1 <= maxW && weight2 <= maxW)
            return Math.max(value1, value2);
        if (weight1 <= maxW)
            return value1;
        if (weight2 <= maxW)
            return value2;
        return 0;
    }

    //  # 40
    public static String longestDigitsPrefix(String inputString)
    {
        StringBuilder str = new StringBuilder();
        for (int g = 0; g < inputString.length(); ++g)
        {
            if (Character.isDigit(inputString.charAt(g)))
                str.append(inputString.charAt(g));
            else
                break;
        }
        return str.toString();
    }

    //  # 41
    public static int digitDegree(int n)
    {
        int numberOfReplacementTimes = 0;
        while (n > 9)
        {
            n = helperDigitDegree(n);
            ++numberOfReplacementTimes;
        }
        return numberOfReplacementTimes;
    }
    private static int helperDigitDegree(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
