import java.util.ArrayList;

public class Level_Easy
{
    public static int noOddDigits(int n)
    {
        ArrayList<Integer> remainders = new ArrayList<>();
        while (n != 0)
        {
            if (n % 2 == 0)
                remainders.add(n % 10);
            n /= 10;
        }
        if (remainders.size() == 0)
            return 0;

        int noOddDigitsNumber = 0;
        for (int i = remainders.size() - 1; i >= 0; --i)
            noOddDigitsNumber += remainders.get(i) * Math.pow(10.0, 1.0*(i));

        return noOddDigitsNumber;
    }
}
