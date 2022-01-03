public class Level5_IslandOfKnowledge
{
    //  # 19
    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight)
    {
        return (yourLeft + yourRight == friendsLeft + friendsRight) &&
                (Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight));
    }

    //  # 20
    public static int arrayMaximalAdjacentDifference(int[] inputArray)
    {
        int maximalAdjacentDifference = 0;

        for (int i = 0; i < inputArray.length - 1; ++i)
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > maximalAdjacentDifference)
                maximalAdjacentDifference = Math.abs(inputArray[i] - inputArray[i + 1]);

        return maximalAdjacentDifference;
    }
}
