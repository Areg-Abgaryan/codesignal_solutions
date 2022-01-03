import java.util.Arrays;
import java.util.List;

public class Level12_LandOfLogic
{
    //  # 53
    public static boolean validTime(String time)
    {
        return time.matches("(2[0-3]|1[0-9]|0[0-9]):[0-5][0-9]");
    }

    //  # 54
    public static int sumUpNumbers(String inputString)
    {
        inputString = inputString.replaceAll("[^0-9]+", " ");
        final List<String> newList = Arrays.asList(inputString.trim().split(" "));
        if (newList.size() == 1 && (! newList.get(0).matches("-?\\d+")))
            return 0;

        int sum = 0;
        for (String str : newList)
            sum += Integer.parseInt(str);
        return sum;
    }
}
