public class CodeSignal
{
    public static double companyBotStrategy(int[][] trainingData)
    {
        int sum = 0, count = 0;
        for (int i = 0; i < trainingData.length; i++)
        {
            if (trainingData[i][1] == 1)
            {
                ++count;
                sum += trainingData[i][0];
            }
        }

        if (sum == 0)
            return 0.0d;

        return (double)sum / count;
    }
}
