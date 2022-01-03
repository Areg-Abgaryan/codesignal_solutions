import java.util.ArrayList;
import java.util.Arrays;

public class Level4_LoopTunnel
{
    //  # 25
    public static int leastFactorial(int n)
    {
        int index = 0;
        ArrayList<Integer> number2Factorial = new ArrayList<>(Arrays.asList(1, 2, 6, 24, 120));

        while (number2Factorial.get(index) < n)
            ++index;

        return number2Factorial.get(index);
    }

    //  # 27
    public static int magicalWell(int a, int b, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; ++i)
        {
            sum += a * b;
            ++a;
            ++b;
        }
        return sum;
    }

    //  # 29
    public static int additionWithoutCarrying(int param1, int param2)
    {
        if (param1 == 0 && param2 == 0)
            return 0;

        StringBuilder str = new StringBuilder();
        while (param1 >= 0 && param2 >= 0)
        {
            if (param1 == 0 && param2 == 0)
                break;
            int temp = param1 % 10 + param2 % 10;
            str.append(temp % 10);
            param1 /= 10;
            param2 /= 10;
        }
        String regex = "^0+(?!$)";
        str = str.reverse();
        String s = str.toString().replaceAll(regex, "");
        return Integer.parseInt(s);
    }

    //  # 30
    public static int appleBoxes(int k)
    {
        int sum = 0;
        for (int i = 1; i <= k; ++i)
        {
            if (i % 2 == 0)
                sum += i * i;
            else
                sum -= i * i;
        }
        return sum;
    }

    //  # 31
    public static boolean increaseNumberRoundness(int n)
    {
        boolean possibility = false;
        while (n > 0)
        {
            if (n % 10 != 0)
                possibility = true;
            if (possibility && n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }
}
