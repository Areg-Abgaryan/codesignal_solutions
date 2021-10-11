public class Level2_AtTheCrossroads
{
    //  # 9
    public static boolean reachNextLevel(int experience, int threshold, int reward)
    {
        return (experience + reward) >= threshold;
    }

    //  # 10
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

    //  # 11
    public static int extraNumber(int a, int b, int c)
    {
        if (a == b)
            return c;
        if (b == c)
            return a;
        return b;
    }

    //  # 12
    public static boolean isInfiniteProcess(int a, int b)
    {
        return (a > b) || ((b - a) % 2 == 1);
    }

    //  # 13
    public static boolean arithmeticExpression(int a, int b, int c)
    {
        return ((a + b == c) || (a * b == c) || (a - b == c) || (a * 1.0 / b == c));
    }

    //  # 14
    public static boolean tennisSet(int score1, int score2)
    {
        return (score1 == 6 && score2 < 5) || (score2 == 6 && score1 < 5)
                || (score1 == 7 && score2 > 4 && score2 < 7)
                || (score2 == 7 && score1 > 4 && score1 < 7);
    }

    //  # 15
    public static boolean willYou(boolean young, boolean beautiful, boolean loved)
    {
        return (young && beautiful && !loved) || (young && !beautiful && loved)
                || (!young && beautiful && loved) || (!young && !beautiful && loved);
    }

    //  # 16
    public static int[] metroCard(int lastNumberOfDays)
    {
        if (lastNumberOfDays == 28 || lastNumberOfDays == 30)
            return new int[] { 31 };
        else
            return new int[] { 28, 30, 31 };
    }
}
