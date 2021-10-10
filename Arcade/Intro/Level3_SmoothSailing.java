import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Level3_SmoothSailing
{
    //  # 9
    public static String[] allLongestStrings(String[] inputArray)
    {
        int largest = 0;
        for (int i = 0; i < inputArray.length; ++i)
            if (inputArray[i].length() > largest)
                largest = inputArray[i].length();
        
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < inputArray.length; ++i)
            if (inputArray[i].length() ==  largest)
                list.add(inputArray[i]);
            
        String[] result = list.toArray(new String[0]);
        return result;
    }
    
    //  # 10
    public static int commonCharacterCount(String s1, String s2)
    {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); ++i)
            hm1.merge(s1.charAt(i), 1, Integer::sum);

        for (int g = 0; g < s2.length(); ++g)
            hm2.merge(s2.charAt(g), 1, Integer::sum);

        int finalResult = 0;
        for (Map.Entry<Character, Integer> entry : hm1.entrySet())
        {
            if (hm2.containsKey(entry.getKey()))
                finalResult += Math.min(entry.getValue(), hm2.get(entry.getKey()));
        }
        return finalResult;
    }

    //  # 11
    public static boolean isLucky(int n)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 0)
        {
            arr.add(n % 10);
            n /= 10;
        }

        int leftsum = 0, rightsum = 0;
        for (int i = 0; i < arr.size() / 2; ++i)
        {
            leftsum += arr.get(i);
            rightsum += arr.get(arr.size() - i - 1);
        }
        return leftsum == rightsum;
    }

    //  # 12
    public static int[] sortByHeight(int[] a)
    {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < a.length; ++i)
        {
            if (a[i] != -1)
                sortedArray.add(a[i]);
        }
        Collections.sort(sortedArray);

        int index = 0;
        for (int g = 0; g < a.length; ++g)
        {
            if (a[g] != -1)
            {
                a[g] = sortedArray.get(index);
                ++index;
            }
        }
        return a;
    }

    //  # 13
    public static String reverseInParentheses(String inputString)
    {
        int firstIndex = inputString.lastIndexOf("(");
        int lastIndex = inputString.indexOf(")", firstIndex);

        while (firstIndex != -1)
        {
            String reversedString = new StringBuilder(inputString.substring(firstIndex + 1, lastIndex))
                    .reverse().toString();
            String first = inputString.substring(0, firstIndex);
            String last = inputString.substring(lastIndex + 1);
            inputString = first + reversedString + last;
            firstIndex = inputString.lastIndexOf("(");
            lastIndex = inputString.indexOf(")", firstIndex);
        }
        return inputString;
    }
}
