import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Level11_SpringOfIntegration
{
    //  # 88
    public int arrayConversion(int[] inputArray)
    {
        int count = 0;
        ArrayList<Integer> workingArray = (ArrayList<Integer>)
                Arrays.stream(inputArray).boxed().collect(Collectors.toList());

        while (workingArray.size() > 1)
        {
            ++count;
            if (count % 2 == 1)
                workingArray = oddIteration(workingArray);
            else
                workingArray = evenIteration(workingArray);
        }
        return workingArray.get(0);
    }
    private static ArrayList<Integer> oddIteration(ArrayList<Integer> inputArray)
    {
        ArrayList<Integer> temporaryArray = new ArrayList<>();

        for (int i = 0; i < inputArray.size() - 1; i += 2)
            temporaryArray.add(inputArray.get(i) + inputArray.get(i + 1));

        return temporaryArray;
    }
    private static ArrayList<Integer> evenIteration(ArrayList<Integer> inputArray)
    {
        ArrayList<Integer> temporaryArray = new ArrayList<>();

        for (int i = 0; i < inputArray.size() - 1; i += 2)
            temporaryArray.add(inputArray.get(i) * inputArray.get(i + 1));

        return temporaryArray;
    }
}
