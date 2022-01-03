import java.util.HashMap;
import java.util.HashSet;

public class Arrays
{
    public static int firstDuplicate(int[] a)
    {
        HashSet<Integer> hset = new HashSet<>();
        for (int x : a)
        {
            if (! hset.contains(x))
                hset.add(x);
            else
                return x;
        }
        return -1;
    }

    public static char firstNotRepeatingCharacter(String s)
    {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i)
        {
            char key = s.charAt(i);
            if (hmap.containsKey(s.charAt(i)))
                hmap.put(key, hmap.get(key) + 1);
            else
                hmap.put(key, 1);
        }
        for (int g = 0; g < s.length(); ++g)
        {
            if (hmap.get(s.charAt(g)) == 1)
                return s.charAt(g);
        }
        return '_';
    }
}
