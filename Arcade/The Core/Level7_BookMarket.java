import java.util.Arrays;
import java.util.HashSet;

public class Level7_BookMarket
{
    //  # 51
    public static String encloseInBrackets(String inputString)
    {
        return new String("(" + inputString + ")");
    }

    //  # 52
    public static String properNounCorrection(String noun)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(noun.charAt(0)));
      
        for (int i = 1; i < noun.length(); ++i)
            stringBuilder.append(Character.toLowerCase((noun.charAt(i))));
        return stringBuilder.toString();
    }

    //  # 53
    public static boolean isTandemRepeat(String inputString)
    {
        if (inputString.length() % 2 == 1)
            return false;

        String firstHalf = inputString.substring(0, inputString.length() / 2);
        String secondHalf = inputString.substring(inputString.length() / 2);
        return firstHalf.equals(secondHalf);
    }

    //  # 54
    public static boolean isCaseInsensitivePalindrome(String inputString)
    {
        inputString = inputString.toLowerCase();
        for(int i = 0; i < inputString.length() / 2; ++i)
        {
            if(inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1))
                return false;
        }
        return true;
    }

    //  # 55
    public static String findEmailDomain(String address)
    {
        int atIndex = address.lastIndexOf('@');
        String domain = address.substring(atIndex + 1);
        return domain;
    }

    //  # 56
    public static String htmlEndTagByStartTag(String startTag)
    {
        int indexOfOpenTag = startTag.indexOf('<');
        StringBuilder stringBuilder = new StringBuilder("</");

        for (int i = indexOfOpenTag + 1; i < startTag.length(); ++i)
        {
            if (startTag.charAt(i) == ' ' || startTag.charAt(i) == '>')
                break;
            stringBuilder.append(startTag.charAt(i));
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }

    //  # 57
    public static boolean isMAC48Address(String inputString)
    {
        HashSet<Character> capitalLetters = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
        if (inputString.length() != 17)
            return false;

        for (int i = 0; i < inputString.length(); ++i)
        {
            if (i % 3 == 2)
            {
                if (inputString.charAt(i) != '-')
                    return false;
            }
            else
              if ( (! capitalLetters.contains(inputString.charAt(i))) && (! Character.isDigit(inputString.charAt(i))))
                return false;
        }
        return true;
    }
    
    //  # 58
    public static boolean isUnstablePair(String filename1, String filename2)
    {
        return (filename1.compareTo(filename2) < 0 && filename1.compareToIgnoreCase(filename2) > 0)
                || (filename1.compareTo(filename2) > 0 && filename1.compareToIgnoreCase(filename2) < 0);
    }
}
