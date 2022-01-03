public class Level9_WellOfIntegration
{
    //  # 67
    public static int houseNumbersSum(int[] inputArray)
    {
        int sum = 0;
        int index = 0;
        while (inputArray[index] != 0)
        {
            sum += inputArray[index];
            ++index;
        }
        return sum;
    }

    //  # 68
    public static String[] allLongestStrings(String[] inputArray)
    {
        int maxLength = 0;
        for (String s : inputArray)
        {
            if (s.length() > maxLength)
                maxLength = s.length();
        }

        int index = 0;
        String[] strArray = new String[10];
        for (String s : inputArray)
        {
            if (s.length() == maxLength)
            {
                strArray[index] = s;
                ++index;
            }
        }

        String[] cleanedArray = Arrays.stream(strArray).filter(Objects::nonNull).toArray(String[]::new);
        return cleanedArray;
    }
}
