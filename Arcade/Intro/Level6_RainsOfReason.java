public class Level6_RainsOfReason
{
    //  # 25
    public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem)
    {
        for (int i = 0; i < inputArray.length; ++i)
        {
            if(inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;
        }
        return inputArray;
    }

    //  # 26
    public static boolean evenDigitsOnly(int n)
    {
        while (n != 0)
        {
            if ((n % 10) % 2 == 1)
                return false;
            n /= 10;
        }
        return true;
    }

    //  # 27
    public static boolean variableName(String name)
    {
        return name.matches("[a-z_A-Z]+[a-zA-Z_0-9]*");
    }

    //  # 28
    public static String alphabeticShift(String inputString)
    {
        StringBuilder copyString = new StringBuilder();
        for (int i = 0; i < inputString.length(); ++i)
        {
            if (inputString.charAt(i) == 'z')
                copyString.append('a');
            else
            {
                char temp = inputString.charAt(i);
                copyString.append(++temp);
            }
        }
        return copyString.toString();
    }
}
