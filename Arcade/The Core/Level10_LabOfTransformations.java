public class Level10_LabOfTransformations
{
    //  # 80
    public static String characterParity(char symbol)
    {
        if (! Character.isDigit(symbol))
            return new String("not a digit");
        if (Character.getNumericValue(symbol) % 2 == 0)
            return new String("even");
        return new String("odd");
    }

    //  # 81
    public static String reflectString(String inputString)
    {
        int firstLowcaseLetter = 97;
        int lastLowcaseLetter = 122;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < inputString.length(); ++i)
        {
            int temp;
            if ((int)inputString.charAt(i) > 109)
                temp = firstLowcaseLetter + (lastLowcaseLetter - (int)inputString.charAt(i));
            else
                temp = lastLowcaseLetter - ((int)inputString.charAt(i) - firstLowcaseLetter);
            str.append((char)temp);
        }
        return str.toString();
    }
}
