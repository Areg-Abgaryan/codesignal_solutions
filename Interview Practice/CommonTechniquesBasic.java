import java.util.HashSet;

public class CommonTechniquesBasic
{
    public static boolean containsDuplicates(int[] a)
    {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < a.length; ++i)
        {
            if (hset.contains(a[i]))
                return true;
            else
                hset.add(a[i]);
        }
        return false;
    }

    public static boolean sumOfTwo(int[] a, int[] b, int v)
    {
        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();

        for (int i = 0; i < a.length; ++i)
            hset1.add(a[i]);
        for (int g = 0; g < b.length; ++g)
            hset2.add(b[g]);

        for (Integer in : hset1)
        {
            if (hset2.contains(v - in))
                return true;
        }
        return false;
    }
}
