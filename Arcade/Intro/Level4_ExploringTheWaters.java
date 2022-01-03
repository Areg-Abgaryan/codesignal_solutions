import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Level4_ExploringTheWaters
{
    //  # 14
    public static int[] alternatingSums(int[] a)
    {
        int b = 0, c = 0;
        for(int i = 0; i < a.length; ++i)
        {
            if(i % 2 == 0)
                b += a[i];
            else
                c += a[i];
        }

        int[] ret = new int[2];
        ret[0] = b;
        ret[1] = c;

        return ret;
    }

    //  # 16
    public static boolean areSimilar(int[] a, int[] b)
    {
        int count = 0;
        ArrayList<Integer> arrForA = new ArrayList<>();
        ArrayList<Integer> arrForB = new ArrayList<>();

        for (int i = 0; i < a.length; ++i)
        {
            if (a[i] != b[i])
            {
                ++count;
                arrForA.add(a[i]);
                arrForB.add(b[i]);
            }
            if (count == 3)
                return false;
        }
        if (count == 0)
            return true;
        if (count == 1)
            return false;
        if (arrForA.get(0).equals(arrForB.get(0)) || arrForA.get(0).equals(arrForB.get(1)) &&
                arrForA.get(1).equals(arrForB.get(0)) || arrForA.get(1).equals(arrForB.get(1)))
            return true;
        return false;
    }

    //  # 17
    public static int arrayChange(int[] inputArray)
    {
        int minMoves = 0;
        for (int i = 0; i < inputArray.length - 1; ++i)
        {
            if (inputArray[i] >= inputArray[i + 1])
            {
                int diff = inputArray[i] - inputArray[i + 1] + 1;
                minMoves += diff;
                inputArray[i + 1] += diff;
            }
        }
        return minMoves;
    }

    //  # 18
    public static boolean palindromeRearranging(String inputString)
    {
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); ++i)
        {
            if (characterMap.containsKey(inputString.charAt(i)))
                characterMap.put(inputString.charAt(i), characterMap.get(inputString.charAt(i)) + 1);
            else
                characterMap.put(inputString.charAt(i), 1);
        }

        boolean onlyOddNumber = false;
        for (Map.Entry<Character, Integer> entry : characterMap.entrySet())
        {
            if (entry.getValue() % 2 == 1)
            {
                if (onlyOddNumber == true)
                    return false;
                else
                    onlyOddNumber = true;
            }
        }
        return true;
    }
}
