public class Level1_TheJourneyBegins
{
    //  # 1
    public static int add(int param1, int param2)
    {
        return param1 + param2;
    }

    //  # 2
    public static int centuryFromYear(int year)
    {
        if (year % 100 == 0)
            return year / 100;
        return year / 100 + 1;
    }

    //  # 3
    public static boolean checkPalindrome(String inputString)
    {
        for (int i = 0; i < inputString.length() / 2 + 1; ++i)
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1))
                return false;
        return true;
    }
}
