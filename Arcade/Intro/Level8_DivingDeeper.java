import java.util.HashSet;

public class Level8_DivingDeeper
{
    public static int[] extractEachKth(int[] inputArray, int k)
    {
        int[] extractedArray = new int[inputArray.length - inputArray.length / k];
        int index = 0;

        for (int i = 0; i < inputArray.length; ++i)
        {
            if (i % k != k - 1)
            {
                extractedArray[index] = inputArray[i];
                ++index;
            }
        }
        return extractedArray;
    }

    public static char firstDigit(String inputString)
    {
        for (char c: inputString.toCharArray())
        {
            if (Character.isDigit(c))
                return c;
        }
        return '0';
    }

    public static int differentSymbolsNaive(String s)
    {
        HashSet<Character> differentSymbols = new HashSet<>();
        for (char c : s.toCharArray())
            differentSymbols.add(c);

        return differentSymbols.size();
    }

    public static int arrayMaxConsecutiveSum(int[] inputArray, int k)
    {
        int maxPossibleConsecutiveSum = 0;
        for (int i = 0; i < inputArray.length - k + 1; ++i)
        {
            if (helperConsecutiveSum(inputArray, i, k) > maxPossibleConsecutiveSum)
                maxPossibleConsecutiveSum = helperConsecutiveSum(inputArray, i, k);
        }
        return maxPossibleConsecutiveSum;
    }
    private static int helperConsecutiveSum(int[] array, int index, int num)
    {
        int sum = 0;
        for (int i = index; i < index + num; ++i)
            sum += array[i];
        return sum;
    }
}
