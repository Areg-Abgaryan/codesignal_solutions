import java.util.ArrayList;
import java.util.Arrays;

public class Level5_ListForestEdge
{
    //  # 35
    public static int[] createArray(int size)
    {
        int[] returnArray = new int[size];
        Arrays.fill(returnArray, 1);
        return returnArray;
    }

    //  # 36
    public static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem)
    {
        for (int i = 0; i < inputArray.length; ++i)
            if (inputArray[i] == elemToReplace)
                inputArray[i] = substitutionElem;

        return inputArray;
    }
  
    //  # 37
    public static int[] firstReverseTry(int[] arr)
    {
        if (arr.length == 0 || arr.length == 1)
            return arr;

        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = temp;

        return arr;
    }

    //  # 38
    public static int[] concatenateArrays(int[] a, int[] b)
    {
        ArrayList<Integer> outputArray = new ArrayList<>();
        for (int i = 0; i < a.length; ++i)
            outputArray.add(a[i]);
        for (int g = 0; g < b.length; ++g)
            outputArray.add(b[g]);

        return outputArray.stream().mapToInt(Integer::intValue).toArray();
    }

    //  # 39
    public static int[] removeArrayPart(int[] inputArray, int l, int r)
    {
        int[] removedArray = new int[inputArray.length - r + l - 1];
        int index = 0;

        for (int i = 0; i < l; ++ i)
        {
            removedArray[index] = inputArray[i];
            ++index;
        }
        for (int i = r + 1; i < inputArray.length; ++i)
        {
            removedArray[index] = inputArray[i];
            ++index;
        }
        return removedArray;
    }

    //  # 40
    public static boolean isSmooth(int[] arr)
    {
        int firstElem = arr[0];
        int lastElem = arr[arr.length - 1];
        int middleElem = 0;

        if (arr.length % 2 == 0)
            middleElem = arr[arr.length / 2] + arr[arr.length / 2 - 1];
        else
            middleElem = arr[(arr.length - 1) / 2];

        return (firstElem == lastElem && lastElem == middleElem);
    }

    //  # 41
    public static int[] replaceMiddle(int[] arr)
    {
        if (arr.length % 2 == 1)
            return arr;

        int[] replacedArray = new int[arr.length - 1];

        int index = 0;
        for (int i = 0; i < arr.length; )
        {
            if (i == (arr.length - 1) / 2)
            {
                replacedArray[index] = arr[i] + arr[i + 1];
                i += 2;
            }
            else
            {
                replacedArray[index] = arr[i];
                ++i;
            }
            ++index;
        }
        return replacedArray;
    }

    //  # 42
    public static int makeArrayConsecutive2(int[] statues)
    {
        boolean[] indices = new boolean[20];
        int missingElementsCount = 0;
        int leftMost = 0, rightMost = indices.length - 1;

        for (int i = 0; i < statues.length; ++i)
            indices[statues[i]] = true;

        for (int l = 0; l < indices.length; ++l)
        {
            if (indices[l] == true)
            {
                leftMost = l;
                break;
            }
        }
        for (int r = indices.length - 1; r >= 0; --r)
        {
            if (indices[r] == true)
            {
                rightMost = r;
                break;
            }
        }
        for (int i = leftMost; i <= rightMost; ++i)
            if (indices[i] == false)
                ++missingElementsCount;

        return missingElementsCount;
    }
}
