public class Level7_ThroughTheFog
{
    //  # 30
    public static int circleOfNumbers(int n, int firstNumber)
    {
        if (firstNumber < n / 2)
            return n/2 + firstNumber;
        return firstNumber - n/2;
    }

    //  # 31
    public static int depositProfit(int deposit, int rate, int threshold)
    {
        int years = 0;
        double tempAmount = deposit;

        while (tempAmount < threshold)
        {
            tempAmount += (tempAmount * rate) / 100;
            ++years;
        }
        return years;
    }

    //  # 32
    public static int absoluteValuesSumMinimization(int[] a)
    {
        int minimumAbsoluteValue = Integer.MAX_VALUE;
        int element = 0;

        for (int i = 0; i < a.length; ++i)
        {
            int temporaryAbsoluteValue = 0;
            for (int g = 0; g < a.length; ++g)
                temporaryAbsoluteValue += Math.abs(a[g] - a[i]);

            if (temporaryAbsoluteValue < minimumAbsoluteValue)
            {
                minimumAbsoluteValue = temporaryAbsoluteValue;
                element = a[i];
            }
        }
        return element;
    }
}
